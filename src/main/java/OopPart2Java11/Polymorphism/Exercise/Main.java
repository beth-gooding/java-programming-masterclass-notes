package OopPart2Java11.Polymorphism.Exercise;

class Car {
    private boolean engine;
    private int wheels;
    private int cylinders;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public void startEngine(){
        System.out.println("Car class: Engine started");
    }

    public void accelerate() {
        System.out.println("Car class: car accelerating");
    }

    public void brake() {
        System.out.println("Car class: car is breaking");
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Ferrari extends Car {
    public Ferrari(int cylinders, String name) {
        super(cylinders, name);
    }


    @Override
    public void startEngine() {
        System.out.println("Ferrari class: accelerating!");
    }
}

class McLaren extends Car {
    public McLaren(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void brake() {
        System.out.println("McLaren class: braking!");
    }
}

class Mercedes extends Car {
    public Mercedes(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Mercedes class: starting engine!");
    }
}
public class Main {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari(4, "SF900");
        McLaren mcLaren = new McLaren(6, "1000");
        Mercedes mercedes = new Mercedes(8, "Fast car");

        System.out.println("Ferrari: Polymorphism means we can use accelerate from Ferrari class and the other methods from the car class");
        System.out.println("McLaren: Polymorphism means we can use braking from McLaren class and the other methods from the car class");
        System.out.println("Mercedes: Polymorphism means we can use startEngine from Mercedes class and the other methods from the car class");

        for(int i = 1; i < 11; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + " : " + car.getName());
            car.startEngine();
            car.accelerate();
            car.brake();
            System.out.println("\n");
        }

    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Ferrari(4, "SF900");
            case 2:
                return new McLaren(6, "1000");
            case 3:
                return new Mercedes(8, "Fast car");

        }

        return null;
    }
}
