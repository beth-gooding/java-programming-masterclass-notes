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

        /*==========================================Operator abbreviations============================================*/
        result++; // Same as result = result + 1
        System.out.println("1 + 1 = " + result);

        result--; // Same as result = result - 1
        System.out.println("2 - 1 = " + result);

        result += 2; // Same as result = result + 2
        System.out.println("1 + 2 = " + result);

        result *= 10; // Same as result = result * 10
        System.out.println("3 * 10 = " + result);

        result /= 3; // Same as result = result / 3
        System.out.println("30 / 3 = " + result);

        result -= 2; // Same as result = result -2
        System.out.println("10 - 2 = " + result);

        /*=============================================Logical Operators==============================================*/

        boolean isAlien = false; // = being used as an assignment operator
        // == being used as a logical operator
        if (isAlien == false) {// Don't put a semicolon here as it will interrupt the if then statement
            System.out.println("It is not an alien!");
            // Without a code block only the line directly under the if statement will be included
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        // Use double & to say logical AND
        // Use brackets to separate logical conditions and make it easier to read
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than secondTopScore and less than 100");
        }

        // You need to use two | characters to get a logical OR
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
    }
}
