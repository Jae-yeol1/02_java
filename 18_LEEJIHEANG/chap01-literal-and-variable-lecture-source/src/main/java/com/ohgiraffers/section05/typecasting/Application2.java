package com.ohgiraffers.section05.typecasting;

public class Application2 {

    static void main() {
        // 의도하지 않은 값 손실
//        long lNum = 80000000000L; // 오류나는 이유는 오른쪽은 int의 범위이다.
        long lNum =8;
        int iNum = (int) lNum; // 형변환() 캐스트연산자 바꾸려고 하는 자료형을 써주게 된다. 이것은 int형
        System.out.println("iNum = " + iNum);
        int isum =  (int)(iNum + lNum);
        int isum2 =  iNum + (int)lNum;
        long isum3 =  iNum + lNum;



        // 의도한 값손실
        float avg = 31.235f;
        int floorNum = (int) avg;
        System.out.println("floorNum = " + floorNum);

        float fnum =4.0f;
        double dnum = (double)fnum;
        System.out.println("dnum = " + dnum);




    }


}
