package OopPart2Java11.Composition.Room;

public class Main {

    public static void main(String[] args) {
        Shower myShower = new Shower("Rain shower", 39, false);
        Bath myBath = new Bath("white", new Tap("double", false), "plastic", 200);
        Toilet myToilet = new Toilet("white", "brown", true);
        Sink mySink = new Sink("metal", "white", new Tap("hot", false), new Tap("cold", true));
        Bathroom myBathroom = new Bathroom(myShower, myBath, myToilet, mySink);

        myBathroom.getShower().changeTemperature(5);
        myBathroom.takeABath();
    }
}
