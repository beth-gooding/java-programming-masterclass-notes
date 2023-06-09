package OopPart2Java11.Composition.Room;

public class Sink {
    private String plug;
    private String color;
    private Tap hotTap;
    private Tap coldTap;

    public Sink(String plug, String color, Tap hotTap, Tap coldTap) {
        this.plug = plug;
        this.color = color;
        this.hotTap = hotTap;
        this.coldTap = coldTap;
    }

    public String getPlug() {
        return plug;
    }

    public String getColor() {
        return color;
    }

    public Tap getHotTap() {
        return hotTap;
    }

    public Tap getColdTap() {
        return coldTap;
    }
}
