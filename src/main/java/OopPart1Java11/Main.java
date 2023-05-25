package OopPart1Java11;

public class Main {

    public static void main(String[] args) {
        // created a new object called ferrari of type Car
        // You need to initialize objects using the new keyword, otherwise you'll get errors
        Car ferrari = new Car();
        Car redBull = new Car();

        ferrari.setModel("SF900");
        redBull.setModel("RB16b");
        System.out.println("Ferrari model is " + ferrari.getModel());
        System.out.println("Redbull model is " + redBull.getModel());

        /*=========================================CHALLENGE EXERCISE=================================================*/
        BankAccount myBankAccount = new BankAccount(); // create new bank account
        myBankAccount.setBalance(100.00); // Set the initial balance
        myBankAccount.depositFunds(50.00); // Deposit money
        myBankAccount.withdrawFunds(100.00); // Withdraw money, should be successful
        myBankAccount.withdrawFunds(100.00); // Withdraw money, should not be successful
    }
}
