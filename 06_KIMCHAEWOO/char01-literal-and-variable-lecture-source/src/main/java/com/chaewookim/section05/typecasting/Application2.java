package com.chaewookim.section05.typecasting;

public class Application2 {
    public static void main(String[] args) {
        // 의도하지 않은 값 손실
        long lNum = 80000000000L;
        int iNum = (int) lNum;
        System.out.println("iNum = " + iNum);   // 오버플로우 발생

        // 의도한 값 손실
        float avg = 31.235f;
        int floorNum = (int) avg;
        System.out.println("floorNum = " + floorNum);

        // 다른 자료형 끼리의 연산
        long lnum = 100;
        int inum = 10;
        int isum = (int) (inum + lnum);
        int isum2 = inum + (int) lnum;
        long lsum = inum + lnum;

    }
}
