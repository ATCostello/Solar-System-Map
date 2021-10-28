/**
 * This class contains methods to create planets
 * @author Alf Costello
 */
public class Planet extends Base{

    private Moon[] moons;

    /**
     * Constructor for a planet with corresponding variables
     * @param s the current solar system object the planets should be created in.
     * @param distance the distance from the sun to the object.
     * @param angle the angle (in degrees) that represents how far the planet is around its orbit of the sun.
     * @param diameter the size of the object.
     * @param col the colour of this object, as a string. Case insensitive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW</p>
     * @param centreOfRotationDistance the distance part of the polar co-ordinate about which this object orbits.
     * @param centreOfRotationAngle the angular part of the polar co-ordinate about which this object orbits.
     * @param rotationVelocity the starting velocity of the object.
     * @param moonAmount the number of moons the planet will have.
     */
    Planet(SolarSystem s, double distance, double angle, double diameter, String col, double centreOfRotationDistance , double centreOfRotationAngle, double rotationVelocity, int moonAmount) {
        super(s, distance, angle, diameter, col, centreOfRotationDistance, centreOfRotationAngle, rotationVelocity);
        moons = new Moon[moonAmount];
        createMoons(moonAmount);
    }

    /**
     * Moves the object around its orbit according to it's rotationVelocity
     * @param rotationVelocity the velocity of the object.
     */
    public double move(double rotationVelocity) {
            centreOfRotationAngle = centreOfRotationAngle + rotationVelocity;
            return centreOfRotationAngle;
    }

    /**
     * Draw the current location of the planet, along with it's moons.
     */
    public void draw() {
        s.drawSolarObjectAbout(distance, angle, diameter, col, centreOfRotationDistance, centreOfRotationAngle);
        centreOfRotationAngle = move(rotationVelocity);

        for (int x = 0; x < moons.length; x++) {
            moons[x].draw(centreOfRotationAngle);
        }
    }

    /**
     * Create the moons for the planet, also spreads them out equally.
     * @param moonAmount the number of moons passed by the constructor
     */
    private void createMoons(int moonAmount){
        double moonRotationDistance = diameter + 10;
        double moonRotationVelocity = 3;
        for(int x = 0; x < moonAmount; x++) {
            moons[x] = new Moon(s, centreOfRotationDistance, 0, 2, "white", moonRotationDistance, 0, moonRotationVelocity);
            moonRotationDistance = moonRotationDistance + 10;
            if(moonRotationVelocity>0.1)
                moonRotationVelocity = moonRotationVelocity - 0.2;
        }
    }
}