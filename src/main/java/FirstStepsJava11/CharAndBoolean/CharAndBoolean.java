package FirstStepsJava11.CharAndBoolean;

public class CharAndBoolean {

    public static void main(String[] args) {

        /*
        * chars are different to strings as they can only store one character
        * Good for storing last key presses, or storing things in arrays
        * You can also store unicode characters
        */
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        char myCopyrightChar = '\u00A9';

        System.out.println(myChar);
        System.out.println("Unicode character: " + myUnicodeChar);
        System.out.println("Copyright! " + myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        // Boolean variable names will often read like a question
        boolean isCustomerOverEighteen = true;
    }
}
