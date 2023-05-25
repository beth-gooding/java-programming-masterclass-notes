package OopPart1Java11;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

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

    public void depositFunds(double depositAmount) {
        double currentAccountBalance = getBalance();
        double newAccountBalance = depositAmount + currentAccountBalance;
        setBalance(newAccountBalance);
        System.out.println("The balance has been updated and is now: " + getBalance());
    }

    public void withdrawFunds(double withdrawalAmount) {
        double currentAccountBalance = getBalance();
        if (currentAccountBalance >= withdrawalAmount) {
            double newAccountBalance = currentAccountBalance - withdrawalAmount;
            setBalance(newAccountBalance);
            System.out.println("Withdrawal was successful, new account balance is " + getBalance());
        } else {
            System.out.println("Withdrawal cannot be completed due to insufficient funds in the account");
        }
    }
}
