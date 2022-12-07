package com.generics;

public class RefactorUC1 {

    public static <R extends Comparable<R>> R maximum(R x, R y, R z) {
        R max = x;                         // assume x is initially the largest
        if (y.compareTo(max) > 0) {
            max = y;                        // Y is the largest so far
        }
        if (z.compareTo(max) > 0) {
            max = z;                    // z is the largest now
        }
        printMax(x, y, z, max);
        return max;                     //returns the largest object
    }
    private static <R extends Comparable<R>> void printMax(R x, R y, R z, R max) {
        System.out.printf("Max of %s,%s and %s is %s\n", x, y, z, max);
    }
    public static void main(String[] args) {
        Integer xInt = 13, yInt = 4, zInt = 5;

        Float xFloat = 6.6f, yFloat = 8.8f, zFloat = 9.7f;

        String xStr = "Manjunath", yStr = "Sadashiv", zStr = "Belagavi";

        System.out.println("Given Three Integer value  Maximum is");
        maximum(xInt, yInt, zInt);


        System.out.println("Given Three Float value  Maximum is");
        maximum(xFloat, yFloat, zFloat);


        System.out.println("Given Three String value  Maximum is");
        maximum(xStr, yStr, zStr);
    }
}
