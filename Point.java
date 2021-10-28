/**
 * This class provides a point to draw around
 * @author Alf Costello
 */
class Point{

    double distance = 0;
    double angle = 0;

    /**
     * Sets the distance from the sun
     * @param distance the distance from the sun to the object.
     */
    protected void setDistance(double distance){
        this.distance = distance;
    }

    /**
     * Sets the angle of rotation
     * @param angle the angle (in degrees) that represents how far the planet is around its orbit of the sun.
     */
    protected void setAngle(double angle){
        this.angle = angle;
    }

}