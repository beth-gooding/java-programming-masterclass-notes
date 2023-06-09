package OopPart1Java11.Inheritance;

public class Car extends Vehicle {
    private String gear;

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public Car(String steering, double moving, String gear) {
        super(steering, moving);
        this.gear = gear;
    }

    public void changeGear(String newGear) {
        this.setGear(newGear);
        System.out.println("The car is now using gear " + this.getGear());
    }
}

