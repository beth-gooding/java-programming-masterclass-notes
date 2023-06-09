package OopPart1Java11.Inheritance;

public class Car extends Vehicle {
    private String currentGear;

    public String getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(String currentGear) {
        this.currentGear = currentGear;
    }

    public Car(String currentDirection, double currentSpeed, String currentGear) {
        super(currentDirection, currentSpeed);
        this.currentGear = currentGear;
    }

    public void changeGear(String newGear) {
        this.setCurrentGear(newGear);
        System.out.println("The car is now using gear " + this.getCurrentGear());
    }
}

