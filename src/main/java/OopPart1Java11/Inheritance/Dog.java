package OopPart1Java11.Inheritance;

// We want the Dog class to inherit from the Animal class, so we use the extends keyword
public class Dog extends Animal {
    // Unique characteristics that dogs have, but not all animals do
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // The keyword super means to call the constructor from the class we are inheriting from
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // Since we know all dogs have brains and bodies, we will define those values in the constructor
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    // We can override methods from the class we inherit from
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        // This means call the eat method from the Animal class
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        /*
        * Using move instead of super.move means that we will use the overridden move method if one has been created
        * If there isn't an overridden method, we will use the one defined in the super class
        */

        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        super.move(10); // Don't look in this class, only use the super class' method
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
