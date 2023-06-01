package OopPart1Java11.Classes;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    // Constructor that saves all fields
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    // Constructor with default credit limit
    public VipCustomer(String name, String email) {
        this(name, 1000.00, email);
    }

    // Constructor with all default values
    public VipCustomer() {
        this("default name", 0.00, "default email");
    }

    // Getters created using code generation
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
