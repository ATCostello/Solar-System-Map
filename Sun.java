/**
 * This class contains methods to create the Sun
 * @author Alf Costello
 */
public class Sun extends Planet{

    /**
     * Constructor for the sun with corresponding variables
     * @param s the current solar system object the planets should be created in.
     * @param distance the distance from the sun to the object.
     * @param angle the angle (in degrees) that represents how far the planet is around its orbit of the sun.
     * @param diameter the size of the object.
     * @param col the colour of this object, as a string. Case insensitive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW</p>
     */
    protected Sun(SolarSystem s, double distance, double angle, double diameter, String col) {
        super(s, distance, angle, diameter, col, 0 , 0, 0, 0);
    }

    @Override
    public void draw() {
        s.drawSolarObject(distance, angle, diameter, col);
    }
}