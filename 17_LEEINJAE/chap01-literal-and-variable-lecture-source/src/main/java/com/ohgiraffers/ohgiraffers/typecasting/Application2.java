package com.ohgiraffers.ohgiraffers.typecasting;

public class Application2 {

    public static void main(String[] args) {
        // 의도하지 않은 값 손실
//        long lNum = 8888888888L;
        int iNum = 8;
        int iNum = (int) lNum;
        System.out.println("iNum = " + iNum);


        //의도한 값손실
        float avg = 31.235f;
        int floorNum = (int) avg;
        System.out.println("floorNum = " + floorNum);
    }
}
