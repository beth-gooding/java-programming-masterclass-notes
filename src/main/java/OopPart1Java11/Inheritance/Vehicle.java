package OopPart1Java11.Inheritance;

public class Vehicle {
    private String steering;
    private double moving;

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public double getMoving() {
        return moving;
    }

    public void setMoving(double moving) {
        this.moving = moving;
    }

    public Vehicle(String steering, double moving) {
        this.steering = steering;
        this.moving = moving;
    }

    public void changeSteering(String direction) {
        this.setSteering(direction);
        System.out.println("Vehicle is steering " + this.steering + " now.");
    }

    public void changeSpeed(double newSpeed) {
        this.setMoving(newSpeed);
        System.out.println("The vehicle is now moving at speed " + this.moving);
    }
}
