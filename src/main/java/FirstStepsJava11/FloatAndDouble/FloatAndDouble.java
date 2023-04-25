package FirstStepsJava11.FloatAndDouble;

public class FloatAndDouble {
    // Float has a width of 32 and Double has a width of 64, they allow us to store decimals

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        // By default, floating point numbers are assumed to doubles, so you need to use 'f' or casting for floats
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f; // Use f to make it clear it's a float
        float myCastedFloatValue = (float) 5.25; // Or you can use casting (not preferred solution)
        double myDoubleValue = 5d / 3d; // Use d to make it clear it's a double

        /*
        * Floats are not used much these days so Doubles are the preferred datatype
        * Doubles can be processed more quickly by a lot of modern computers
        * and libraries are written with them in mind instead of the float datatype
        */

        /*
        * We see by dividing the values by 2 that the int type cannot handle decimal points
        * We see by dividing the values by 3 that the float type can only hold 7 decimal places
        * but the double has more precision and can have 16 decimal places
         */
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        /*===============================================CHALLENGE===========================================*/
        double numberOfPounds = 1.34582579d;
        double conversionFactor = 0.45359237d;
        double numberOfKilograms = numberOfPounds * conversionFactor;

        System.out.println("The number of kilograms is " + numberOfKilograms);
    }
}
