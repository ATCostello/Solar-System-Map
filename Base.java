/**
 * This class provides base variables and abstract methods that every planet should have.
 * @author Alf Costello
 */
public abstract class Base extends Point{

    SolarSystem s;
    double diameter;
    String col;
    double centreOfRotationDistance;
    double centreOfRotationAngle;
    double rotationVelocity;

    /**
     * Sets the values of the variables related to the planet.
     * @param s the current solar system object the planets should be created in.
     * @param distance the distance from the sun to the object.
     * @param angle the angle (in degrees) that represents how far the planet is around its orbit of the sun.
     * @param diameter the size of the object.
     * @param col the colour of this object, as a string. Case insensitive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW</p>
     * @param centreOfRotationDistance the distance part of the polar co-ordinate about which this object orbits.
     * @param centreOfRotationAngle the angular part of the polar co-ordinate about which this object orbits.
     * @param rotationVelocity the starting velocity of the object.
     */
    protected Base(SolarSystem s, double distance, double angle, double diameter, String col, double centreOfRotationDistance , double centreOfRotationAngle, double rotationVelocity) {
        this.s = s;
        setDistance(distance);
        setAngle(angle);
        this.diameter = diameter;
        this.col = col;
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.centreOfRotationAngle = centreOfRotationAngle;
        this.rotationVelocity = rotationVelocity;
    }

    public abstract double move(double rotationVelocity);

    public abstract void draw();

}
