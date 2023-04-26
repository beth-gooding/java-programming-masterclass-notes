package OopPart1Java11;

// Classes should have capital letters to start their names
// Public access modifier means any other classes have access to this class
public class Car {
    // As a general rule, we use the private access modifier for fields/methods inside classes
    // This follows the principle of encapsulation, so that there is no outside access to the
    // internal fields of a class

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    // Use public methods to access and change the private fields of classes
    // We use setters for changing field values
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        // We can use setters to validate our information before assigning it to an object
        if (validModel.equals("sf900") || validModel.equals("rb17")) {
            this.model = model;
        } else {
            this.model = "UNKNOWN";
        }
    }

    // We use getters for accessing field values
    public String getModel() {
        return this.model;
    }
}
