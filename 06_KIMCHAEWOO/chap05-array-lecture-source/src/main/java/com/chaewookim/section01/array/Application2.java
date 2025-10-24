package com.chaewookim.section01.array;

public class Application2 {
    public static void main(String[] args) {
        int[] iarr;
        double[] darr;

        iarr = new int[5];
        darr = new double[10];

        System.out.println("iarr = " + iarr);
        System.out.println("darr = " + darr);

        System.out.println("iarr.hashCode() = " + iarr.hashCode());

        System.out.println("iarr.length = " + iarr.length);

        iarr = new int [100];
        System.out.println("수정된 iarr의 hashCode(): " + iarr.hashCode());
        System.out.println("수정된 iarr.length" + iarr.length);

//        iarr = null;
//
//        System.out.println("수정된 iarr의 hashCode(): " + iarr.hashCode());
//        System.out.println("수정된 iarr.length" + iarr.length);
    }
}
