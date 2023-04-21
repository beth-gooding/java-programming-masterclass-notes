package FloatAndDouble;

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
        int myIntValue = 5;
        float myFloatValue = 5.25f; // Use f to make it clear it's a float
        float myCastedFloatValue = (float) 5.25; // Or you can use casting (not preferred solution)
        double myDoubleValue = 5d; // Use d to make it clear it's a double

        // Floats are not used much these days so Doubles are the preferred datatype
    }
}
