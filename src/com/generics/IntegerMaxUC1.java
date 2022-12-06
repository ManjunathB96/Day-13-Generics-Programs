package com.generics;

public class IntegerMaxUC1 {
    public static class IntgersMaxTest<T extends Comparable<T>> {
        T x, y, z;

        public IntgersMaxTest(T x, T y, T z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public T result() {
            return IntgersMaxTest.compareIntObjects(x, y, z);
        }

        public static <T extends Comparable<T>> T compareIntObjects(T x, T y, T z) {
            T max = x;
            if (y.compareTo(max) > 0) {
                max = y;
            }
            if (z.compareTo(max) > 0) {
                max = z;
            }
            printIntMax(x, y, z, max);
            return max;

        }

        private static <T extends Comparable<T>> void printIntMax(T x, T y, T z, T max) {
            System.out.printf("Max %s,%s, and %s is %s", x, y, z, max);
        }

        public static void main(String[] args) {
            Integer xInt = 10, yInt = 25, zInt = 15;

            System.out.println("Maximum among three integer values is : ");

            new IntgersMaxTest(xInt, yInt, zInt).compareIntObjects();
        }

        private void compareIntObjects() {
            compareIntObjects(x, y, z);
        }
    }
}
