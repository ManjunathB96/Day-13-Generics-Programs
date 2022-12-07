package com.generics;

public class RefactorUC2 <A extends Comparable<A>>{
    A p,q,r;
    public RefactorUC2( A p, A q, A r) {
        this.p = p;
        this.q = q;
        this.r = r;

    }
    public static <A extends Comparable<A>> A maximum(A p, A q, A r) {
        A max = p;
        if (q.compareTo(max) > 0) {
            max = q;
        }
        if (r.compareTo(max) > 0) {
            max = r;
        }
        printMax(p, q, r, max);
        return max;
    }
    private static <A extends Comparable<A>> void printMax(A p, A q, A r, A max) {
        System.out.printf("Max of %s,%s and %s is %s\n", p, q, r, max);
    }

    public static void main(String[] args) {
        Integer xInt =10,yInt=25,zInt=32;
        Float pFloat = 2.6f, qFloat = 7.8f, rFloat = 1.7f;
        String aStr = "Tanu", bStr = "Rohan", cStr = "Banu";

        new RefactorUC2<Integer>(xInt,yInt,zInt).toPrint();
        new RefactorUC2<Float>(pFloat,qFloat,rFloat).toPrint();
        new RefactorUC2<String>(aStr,bStr,cStr).toPrint();
    }

    private A toPrint(){
       return RefactorUC2.maximum(p,q,r);
    }
}
