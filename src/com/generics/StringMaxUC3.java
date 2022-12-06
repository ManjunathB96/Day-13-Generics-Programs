package com.generics;

public class StringMaxUC3 {
    public static class StrMaxTest<S extends Comparable<S>>{
        S a,b,c;

        public StrMaxTest(S a, S b, S c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public S result(){
            return (S) StrMaxTest.maxStringObjects((String )a,(String) b,(String) c);
        }

        private static String maxStringObjects(String a, String b, String c) {
          String max = a;
            if (b.compareTo(max)>0){
                max= b;
            }
            if (c.compareTo( max)>0){
                max= c;
            }
            printStrMax(a,b,c,max);
            return  max;
        }

        private static <S extends Comparable<S>> void printStrMax(String a, String b, String c, S max) {

            System.out.printf("max of %s,%s and %s is %s :",a,b,c,max);
        }


        public static void main(String[] args) {
            String aStr="A",bStr="Z",cStr="M";

            new StrMaxTest(aStr,bStr,cStr).maxStringObjects();
        }

        private void maxStringObjects(){
            maxStringObjects((String)a,(String) b,(String) c);
        }
    }

}
