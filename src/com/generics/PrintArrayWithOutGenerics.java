package com.generics;

public class PrintArrayWithOutGenerics {
    public static void main(String[] args) {
        Integer[] intArray= {100,200,300,400,500,600};
        Double[] doubleArray = {9.2,4.8,2.7,3.1,8.2};
        Float[] floatArray = {2.1f,6.8f,4.2f,6.7f,2.3f};
        String[] strArray = {"Manju","S","Belagavi"};

        PrintArray(intArray);
        PrintArray(doubleArray);
        PrintArray(floatArray);
        PrintArray(strArray);

    }

    private static void PrintArray(Integer[] intArray) {
        for (int ele : intArray){
            System.out.printf("%s",ele);
        }
        System.out.println();
    }
    private static void PrintArray(Double[] intArray) {
        for (double ele : intArray){
            System.out.printf("%s",ele);
        }
        System.out.println();
    }
    private static void PrintArray(Float[] intArray) {
        for (float ele : intArray){
            System.out.printf("%s",ele);
        }
        System.out.println();
    }
    private static void PrintArray(String[] intArray) {
        for (String ele : intArray){
            System.out.printf("%s",ele);
        }
        System.out.println();
    }
}
