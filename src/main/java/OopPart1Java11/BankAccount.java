package OopPart1Java11;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Add a constructor that is used when a new BankAccount object is made
    public BankAccount() {
        // You can use the 'this' keyword like below to set default values
        // You must make sure that this is the first statement that appears in the constructor body
        this(0, 2.50, "Default name", "Default email", "Default phone");
        System.out.println("Empty constructor function called");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // A constructor where some fields are set to default values
    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999, 100.55, customerName, email, phoneNumber);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // LEARNING: We don't have to use getters and setters inside the methods
    // of the class because we can access the private fields here
    public void depositFunds(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("The balance has been updated and is now: " + this.balance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (this.balance >= withdrawalAmount) {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal was successful, new account balance is " + this.balance);
        } else {
            System.out.println("Withdrawal cannot be completed due to insufficient funds in the account");
        }
    }
}
