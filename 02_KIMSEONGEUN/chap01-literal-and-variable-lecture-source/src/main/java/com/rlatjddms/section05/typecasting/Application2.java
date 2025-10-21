package com.rlatjddms.section05.typecasting;

public class Application2 {

    public static void main(String[] args) {
        // 의도하지 않은 값손실
//        long lNum = 8000000000L;
        long lNum = 8;
        int iNum = (int) lNum;
        System.out.println("iNum = " + iNum); // 오버플로우
        int isum = (int) (iNum + lNum);
        int isum2 = iNum + (int) lNum;
        long lsum = iNum + lNum;

        // 의도한 값손실
        float avg = 31.235f;
        int floorNum = (int) avg;
        System.out.println("floorNum = " + floorNum);
    }
}
