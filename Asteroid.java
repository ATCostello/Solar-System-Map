import java.util.Random;

/**
 * This class contains methods to create an asteroid belt
 * @author Alf Costello
 */
class Asteroid extends Planet{

    private Asteroid[] asteroids;
    private int asteroidAmount;

    /**
     * Constructor for a moon with corresponding variables
     * @param s the current solar system object the planets should be created in.
     * @param col the colour of this object, as a string. Case insensitive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW</p>
     * @param diameter the size of the object.
     * @param centreOfRotationDistance the distance part of the polar co-ordinate about which this object orbits.
     * @param centreOfRotationAngle the angular part of the polar co-ordinate about which this object orbits.
     * @param rotationVelocity the starting velocity of the object.
     */
    protected Asteroid(SolarSystem s, String col, double diameter, double centreOfRotationDistance, double centreOfRotationAngle, double rotationVelocity){
        super(s, 0, 0, diameter, col, centreOfRotationDistance , centreOfRotationAngle, rotationVelocity, 0);
    }

    /**
     * Creates the belt by randomizing the location of the asteroids within boundaries.
     * @param asteroidAmount the number of asteroids within the belt.
     * @param asteroidInner the inner boundary of the belt.
     * @param asteroidOuter the outer boundary of the belt.
     * @param asteroidLength the length of the belt. Values between 0 and 360.
     */
    protected void create(int asteroidAmount, int asteroidInner, int asteroidOuter, int asteroidLength){
        int minLength = 0;

        Random width = new Random();
        Random length = new Random();

        this.asteroidAmount = asteroidAmount;
        asteroids = new Asteroid[asteroidAmount];
        for (int x = 0; x < asteroidAmount; x++) {
            int beltWidth = width.nextInt(asteroidOuter - asteroidInner) + asteroidInner;
            int beltLength = length.nextInt(asteroidLength - minLength) - minLength;
            asteroids[x] = new Asteroid(s, col, diameter, beltWidth, beltLength, rotationVelocity);
        }
    }

    /**
     * Draws the asteroid belt.
     */
    protected void drawBelt(){
        for (int x = 0; x < asteroidAmount; x++){
            asteroids[x].draw();
        }
    }

}