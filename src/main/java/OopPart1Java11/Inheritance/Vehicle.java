package OopPart1Java11.Inheritance;

public class Vehicle {
    private String currentDirection;
    private double currentSpeed;

    public String getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(String currentDirection) {
        this.currentDirection = currentDirection;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Vehicle(String steering, double currentSpeed) {
        this.currentDirection = steering;
        this.currentSpeed = currentSpeed;
    }

    public void changeSteering(String direction) {
        this.setCurrentDirection(direction);
        System.out.println("Vehicle is steering " + this.currentDirection + " now.");
    }

    public void changeSpeed(double newSpeed) {
        this.setCurrentSpeed(newSpeed);
        System.out.println("The vehicle is now moving at speed " + this.currentSpeed);
    }
}
