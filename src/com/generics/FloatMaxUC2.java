package com.generics;

public class FloatMaxUC2 {
    public static class FloatMaxTest<F extends Comparable<F>> {
        F p, q, r;

        public FloatMaxTest(F p, F q, F r) {
            this.p = p;
            this.q = q;
            this.r = r;
        }

        public F outPut() {
            return FloatMaxTest.compareFloatObjects(p, q, r);
        }

        private static <F extends Comparable<F>> F compareFloatObjects(F p, F q, F r) {
            F max = p;
            if (q.compareTo(max) > 0) {
                max = q;
            }
            if (r.compareTo(max) > 0) {
                max = r;
            }

            printIntMax(p, q, r, max);

            return max;
        }

        private static <F extends Comparable<F>> void printIntMax(F p, F q, F r, F max) {
            System.out.printf("max of %s,%s and %s is %s",p,q,r,max);
        }

        public static void main(String[] args) {
            Float pFloat=2.5f,qFloat=5.8f,rFloat=4.9f;

            new FloatMaxTest(pFloat,qFloat,rFloat).compareFloatObjects();
        }

        private void compareFloatObjects() {
            compareFloatObjects(p,q,r);
        }


    }
}
