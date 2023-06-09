package OopPart2Java11.Composition.Room;

public class Bath {
    private String color;
    private Tap tap;
    private String plug;
    private int volume;

    public Bath(String color, Tap tap, String plug, int volume) {
        this.color = color;
        this.tap = tap;
        this.plug = plug;
        this.volume = volume;
    }

    public void runBath() {
        getTap().turnOn();
        System.out.println("You are running the bath");
    }

    public String getColor() {
        return color;
    }

    public Tap getTap() {
        return tap;
    }

    public String getPlug() {
        return plug;
    }

    public int getVolume() {
        return volume;
    }
}
