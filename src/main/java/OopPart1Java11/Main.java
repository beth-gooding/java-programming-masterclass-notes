package OopPart1Java11;

public class Main {

    public static void main(String[] args) {
        // created a new object called ferrari of type Car
        // You need to initialize objects using the new keyword, otherwise you'll get errors
        Car ferrari = new Car();
        Car redBull = new Car();

        ferrari.setModel("SF900");
        redBull.setModel("RB16b");
        System.out.println("Ferrari model is " + ferrari.getModel());
        System.out.println("Redbull model is " + redBull.getModel());
    }
}
