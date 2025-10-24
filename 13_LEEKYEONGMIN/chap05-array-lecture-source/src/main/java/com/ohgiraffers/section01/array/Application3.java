package com.ohgiraffers.section01.array;

public class Application3 {
    public static void main(String[] args) {
        int num;

        String[] sarr = new String[10];
        char[] carr = new char[10];

        int[] iarr = new int[10];
        for (int i =0; i<iarr.length;i++){
            System.out.println("iarr[" + i +"] : " +iarr[i]);
        }

        /*
        기본값 외의 값으로 초기화 하면서 배열을 생성하고 싶을때
         */
        int[] iarr2 = {11,22,33,44,55}; //한번에

        int[] test = new int[5];
        test[0] =11; //하나씩
        test[1] = 22;

        //짜장면 , 짬뽕, 탕수육, 삼겹살

        String[] sarr2 = {"짜장면","잠뽕","탕수육","삼겹살"};
        for(int i =0 ; i<sarr2.length;i++){
            System.out.println("sarr2[" + i +"] : " +sarr2[i]);
        }
    }
}
