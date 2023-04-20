public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Beth");

        /*
        * Variable declaration statement
        * <data type> <variable name> = <value>
        * It is optional to set the value during the declaration
        * But in general, variables should be initialised before being used
        */
        int myFirstNumber = (10 + 5) + (2 * 10);

        // Create more declarations of variables
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        // Declare variables using existing variables
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);

    }
}
