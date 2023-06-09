package OopPart2Java11.Composition.Room;

public class Tap {
    private String type;
    private boolean isRunning;

    public Tap(String type, boolean isRunning) {
        this.type = type;
        this.isRunning = isRunning;
    }

    public void turnOn() {
        isRunning = true;
        System.out.println("The " + type + " tap has been turned on");
    }

    public String getType() {
        return type;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
