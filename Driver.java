public class Driver {

    public static void main(String[] args) {

        //Create a new solar system model
        SolarSystem s = new SolarSystem(1500, 1000);

        //Create the sun
        Sun Sun = new Sun(s, 0, 0, 50, "YELLOW");

        //Create the planets
        Planet Mercury = new Planet(s, 0, 0, 5, "GRAY", 100, 0, 1, 0);
        Planet Venus = new Planet(s, 0, 0, 7, "ORANGE", 150, 0, 0.8, 0);
        Planet Earth = new Planet(s, 0, 0, 7, "BLUE", 200, 0, 0.5, 1);
        Planet Mars = new Planet(s, 0, 0, 6, "RED", 250, 0, 0.4, 2);
        Planet Jupiter = new Planet(s, 0, 0, 20, "PINK", 400, 0, 0.3, 4);

        //Create the asteroid belt
        Asteroid belt = new Asteroid(s, "white", 1, 0, 0, 0.35);
        belt.create(500, 290, 340, 360);

        //Loop to draw the updated objects
        while (true) {
            Sun.draw();
            Mercury.draw();
            Venus.draw();
            Earth.draw();
            Mars.draw();
            belt.drawBelt();
            Jupiter.draw();
            s.finishedDrawing();
        }
    }
}
