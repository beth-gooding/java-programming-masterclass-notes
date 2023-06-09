package OopPart2Java11.Composition.Room;

public class Shower {
    private String model;
    private int temperature;
    private boolean isOn;

    public Shower(String model, int temperature, boolean isOn) {
        this.model = model;
        this.temperature = temperature;
        this.isOn = isOn;
    }

    public void changeTemperature(int temperatureDelta) {
        temperature += temperatureDelta;
        System.out.println("The shower is running water at " + temperature + " degrees.");
    }

    public String getModel() {
        return model;
    }

    public int getTemperature() {
        return temperature;
    }

    public boolean isOn() {
        return isOn;
    }
}
