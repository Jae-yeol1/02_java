package com.hihi.section4.typecasting;

public class Application2 {

    public static void main(String[] args) {
            // 의도하지 않은 값 손실
            long lNum = 800000000000L;
            int iNum = (int) lNum;
            System.out.println("lNum = " + iNum);

            //의도한 값 손실
            float avg = 31.235f;
            int floorNum = (int) avg;

    }

}
