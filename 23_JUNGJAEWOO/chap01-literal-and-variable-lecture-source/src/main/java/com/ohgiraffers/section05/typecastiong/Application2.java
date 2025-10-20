package com.ohgiraffers.section05.typecastiong;

public class Application2 {
    public static void main(String[] args) {
        // 의도하지않은 값손실
//        long lNum = 8000000000L;
        long lNum = 8;
        int iNum = (int)lNum;
        System.out.println("iNum = " + iNum);
        int isum = (int) (iNum + lNum);

        System.out.println("isum : " + isum);

        /* 방법2. long 형 값을 int로 강제 형변환 한다. */
        int isum2 = iNum + (int) lNum;

        System.out.println("isum2 : " + isum2);

        /* 방법3. 결과 값을 long형 자료형으로 받는다(자동 형변환 이용) */
        long lsum = iNum + lNum;

        System.out.println("lsum : " + lsum);

        // 의도한 값손실
        float avg = 31.235f;
        int floorNum = (int) avg;
        System.out.println("floorNum = " + floorNum);


    }
}
