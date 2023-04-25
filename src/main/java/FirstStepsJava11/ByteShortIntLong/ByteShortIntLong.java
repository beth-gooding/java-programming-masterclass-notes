package FirstStepsJava11.ByteShortIntLong;

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

        /*
        * We can see that the range for byte datatype is quite small
        * We can use this for good code documentation as developers will see it can only have a small range
        * Occupies 8 bits
        */
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        
        // short has a larger range than a bite, smaller range than an int - occupies 16 bits
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        
        /*
        * Long values should have an "L" character on the end to signify it is a long
        * The Long datatype has a width of 64
        */
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        // Without the L on the end, IntelliJ will give us an error as it is too large to be an int
        long bigLongLiteralValue = 2147483647234L;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);

        /*
        We get an error below without casting
        This is because the expressions in the brackets are an int because Java assumes 2 is an int
        Casting tells us to treat the value as the type in the parenthesis
        We can use casting because WE KNOW that these values will fit as bytes or shorts, but be careful
        */
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        /*===============================================CHALLENGE===========================================*/

        byte myChallengeByteValue = 14;
        short myChallengeShortValue = 5678;
        int myChallengeIntValue = 12345678;

        // Longs work nicely with int variables, so we don't need to do any casting
        long myChallengeLongValue = 50000L + (10L * (myChallengeByteValue + myChallengeShortValue + myChallengeIntValue));
        System.out.println("My Challenge Long Value = " + myChallengeLongValue);
    }
}
