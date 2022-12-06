package com.generics;

public class PrintArrayWithGenerics {
    public static void main(String[] args) {
        Integer[] intArray = {100, 200, 300, 400, 500, 600};
        Double[] doubleArray = {9.2, 4.8, 2.7, 3.1, 8.2};
        Float[] floatArray = {2.1f, 6.8f, 4.2f, 6.7f, 2.3f};
        String[] strArray = {"Manju", "S", "Belagavi"};

        toPrint(intArray);
        toPrint(doubleArray);
        toPrint(floatArray);
        toPrint(strArray);
    }

    private static <M> void toPrint(M[] items){
        for (M values : items){
            System.out.printf("%s",values);
        }
        System.out.println();
    }
}
