package com.lhw.section01.array;

public class Application3 {

     public static void main(String[] args) {

         /* 지역 변수는 초기화를 해주어야 한다. 초기값이 없음*/
         int num;
//         System.out.println(num);

         /* 래퍼런스 변수의 [INT]배열 값 내에는 0으로 초기화해준다.*/
         int [] iarr = new int [10];
         for (int i = 0; i < 10; i++) {
             System.out.print(iarr[i]+",");
         }
         System.out.println();
         /* Stirng은 null 로 초기화 한다. */
         String[] sarr = new String[10];
         for (int i = 0; i < 10; i++) {
             System.out.print(sarr[i]+",");
         }
         System.out.println();

         /* char : 비어있는 값으로 초기화*/
         char[] carr = new char[10];
         for (int i = 0; i < 10; i++) {
             System.out.print(carr[i]+",");
         }
         System.out.println();

         /* boolean*/
         boolean[] barr = new boolean[10];
         for (int i = 0; i < 10; i++) {
             System.out.print(barr[i]+",");
         }
         System.out.println();
         /* 기본값 외의 값으로 초기화 하면서 배열 생성하고 싶을 때*/
         int[] iarr2 = new int[]{11,22,33,44,55};
         int[] iarr3 = {11,22,33,44,55};
         for (int i = 0; i < 5; i++) {
             System.out.println("iarr3 = [" + i + "] : " + iarr3[i]);
         }
     }
}
