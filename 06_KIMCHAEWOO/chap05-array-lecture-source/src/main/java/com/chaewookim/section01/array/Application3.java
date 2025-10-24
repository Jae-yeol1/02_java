package com.chaewookim.section01.array;

public class Application3 {
    public static void main(String[] args) {
        int num;

//        System.out.println("num = " + num);
        
        int[] iarr = new int[100];
        for (int i = 0; i < iarr.length; i++) {
            System.out.println("iarr[i] = " + iarr[i]);
        }

        String[] sarr = new String[10];
        for (int i = 0; i < sarr.length; i++) {
            System.out.println("sarr[i] = " + sarr[i]);
        }

        char[] carr = new char[10];
        for (int i = 0; i < sarr.length; i++) {
            System.out.println("carr[i] = " + carr[i]);
        }

//        int[] iarr2 = new int[]{1, 2, 3, 4, 5};
        int[] iarr2 = {1, 2, 3, 4, 5};
        for (int i : iarr2) {
            System.out.println("iarr2[i] = " + i);
        }
        
    }
}
