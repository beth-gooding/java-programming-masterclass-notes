package FirstStepsJava11.Operators;

public class Operators {

    public static void main (String[] args) {

        // The equals sign and the plus sign are both operators, although the equals is used for assignment
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        // The assignment of previousResult is done before we take away 1, so is still equal to three
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        // The % sign is used to do remainders
        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);
    }
}
