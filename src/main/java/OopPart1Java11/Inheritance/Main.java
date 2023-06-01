package OopPart1Java11.Inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");

        // Dog objects can use the eat method which is inherited from the animal class, where eat is a public method
        dog.eat();
    }
}
