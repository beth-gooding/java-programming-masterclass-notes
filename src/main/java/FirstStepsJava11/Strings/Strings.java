package FirstStepsJava11.Strings;

public class Strings {

    public static void main (String[] args) {
        // Strings are not primitive, they are a class that Java has made easier to use than usual classes
        // That's why String has a capital letter!
        String myString = "This is a string";
        System.out.println("My string is equal to: " + myString);

        // You can concatenate strings using the plus operator
        // Strings are immutable, so when you concatenate you are creating a new String in memory
        myString = myString + ", and this is more.";
        System.out.println("My string is now equal to: " + myString);

        // Unicode's characters can be used in strings
        myString = myString + " \u00A9 2023";
        System.out.println("My string with unicode is now equal to: " + myString);

        // You can see that adding number strings concatenates the strings rather than adding the numbers
        String numberString = "250.55";
        numberString = numberString + "49.55";
        System.out.println("My number string: " + numberString);

        // If you try to add an int to a string, Java converts the int to a string and concatenates them
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        // The same thing happens if you try to add a double to a String
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is now equal to " + lastString);

    }
}
