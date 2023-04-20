package ByteShortIntLong;

public class ByteShortIntLong {
    public static void main(String[] args) {
        int myValue = 10000;

        /*
         * Integer is a wrapper class for the int primitive types
         * Wrapper classes give us a way to perform certain operations on variables from a primitive type
         */
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        /*
         * Here we've tried to add a number which is too big to be an integer
         * What we see here is overflow, the compiler has tried to do the assignment anyway
         * So we've ended up with a negative number
         */
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));

        /*
         * You can also see an underflow, which is what happens
         *if you try to use a number which is smaller than the allowed minimum
         */
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        /*
         * If you type the value in, IntelliJ is dealing with a literal and
         * can flag if something is outside the range of a primitive type
         */

        int myMaxIntTest = 2147483647;
    }
}
