package com.generictest;

import java.util.Arrays;

public class MaximumTC1 {

    public static class FindMax<E extends Comparable<E>> {           // Generic Class To Find Max Values
        E[] values;
        public FindMax(E... values) {
            this.values = values;
        }
        public E findMaxValue()  {
            if (values.length == 0) {
            } else {
                Arrays.sort(values);
                printMax(values[values.length - 1]);

            }
            return values[values.length - 1];
        }
        public void printMax(E value) {
            System.out.println("Max Value = " + value);
        }

    }

}
/*sort() mtd :Sorts the specified array of objects into ascending order,
according to the natural ordering of its elements.
All elements in the array must implement the Comparable interface.
 */
