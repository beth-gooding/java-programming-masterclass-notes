package OopPart2Java11.Composition.Room;

public class Toilet {
    private String cisternColor;
    private String lidColor;
    private boolean isLidShut;

    public Toilet(String cisternColor, String lidColor, boolean isLidShut) {
        this.cisternColor = cisternColor;
        this.lidColor = lidColor;
        this.isLidShut = isLidShut;
    }

    public String getCisternColor() {
        return cisternColor;
    }

    public String getLidColor() {
        return lidColor;
    }

    public boolean isLidShut() {
        return isLidShut;
    }
}
