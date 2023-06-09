package OopPart2Java11.Composition.Room;

public class Bathroom {
    private Shower shower;
    private Bath bath;
    private Toilet toilet;

    private Sink sink;

    public Bathroom(Shower shower, Bath bath, Toilet toilet, Sink sink) {
        this.shower = shower;
        this.bath = bath;
        this.toilet = toilet;
    }

    public void takeABath(){
        getBath().runBath();
    }

    public Shower getShower() {
        return shower;
    }

    public Bath getBath() {
        return bath;
    }

    public Toilet getToilet() {
        return toilet;
    }

    public Sink getSink() {
        return sink;
    }
}
