package OopPart1Java11.Inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");

        // Dog objects can use the eat method which is inherited from the animal class, where eat is a public method
        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("Goldfish", 1, 1, 6,2, 3);
        fish.swim(2);

        Vehicle vehicle = new Vehicle("straight", 30);
        Car car = new Car("straight", 35.2, "3");
        FormulaOne ferrariSixteen = new FormulaOne("straight", 250, "7", "Ferrari");

        vehicle.changeSteering("left");
        car.changeGear("Reverse");
        ferrariSixteen.changeSpeed(0);
        ferrariSixteen.changeGear("Neutral");
        ferrariSixteen.changeSteering("Broken");
    }
}
