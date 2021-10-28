/**
 * This class contains methods to create planet's Moons
 * @author Alf Costello
 */
public class Moon extends Planet{

    /**
     * Constructor for a moon with corresponding variables
     * @param s the current solar system object the planets should be created in.
     * @param distance the distance from the sun to the object.
     * @param angle the angle (in degrees) that represents how far the planet is around its orbit of the sun.
     * @param diameter the size of the object.
     * @param col the colour of this object, as a string. Case insensitive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW</p>
     * @param centreOfRotationDistance the distance part of the polar co-ordinate about which this object orbits.
     * @param centreOfRotationAngle the angular part of the polar co-ordinate about which this object orbits.
     * @param rotationVelocity the starting velocity of the object.
     */
    protected Moon(SolarSystem s, double distance, double angle, double diameter, String col, double centreOfRotationDistance , double centreOfRotationAngle, double rotationVelocity){
        super(s, distance, angle, diameter, col, centreOfRotationDistance , centreOfRotationAngle, rotationVelocity, 0);
    }

    /**
     * Draws the moon at it's current location.
     * @param planetLocation the value of the moon's planet location in order to move accordingly.
     */
    public void draw(double planetLocation) {
        s.drawSolarObjectAbout(distance, planetLocation, diameter, col, centreOfRotationDistance, centreOfRotationAngle);
        centreOfRotationAngle = move(rotationVelocity);
    }
}