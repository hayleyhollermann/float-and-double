package com.company;

public class Main {

    public static void main(String[] args) {

        // FLOAT
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value = " + myMinFloatValue);
        System.out.println("Float max value = " + myMaxFloatValue);
        
        // DOUBLE
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value = " + myMinDoubleValue);
        System.out.println("Double max value = " + myMaxDoubleValue);

        // Practice
        int myIntValue = 5 / 3 ;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d; // d or f only needed if no decimal point

        // Casting
        float myNewFloatValue = (float)5.25;

        System.out.println("myIntValue = " + myIntValue); // prints 1 *whole num* - no remainder
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue); // more precision

        // CHALLENGE
        // 1. Create a variable w/ appropriate type
        // to store a number of pounds to be converted to kg
        float weightPounds = 152.5f;

        // 2. Calculate the result (i.e. the number) of kg based on number above
        // and store that variable in a second appropriate variable type
        double weightKilograms = (weightPounds) * 0.45359239d;

        // 3. Print out the result
        System.out.println(weightKilograms);


    }
}
