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
}
