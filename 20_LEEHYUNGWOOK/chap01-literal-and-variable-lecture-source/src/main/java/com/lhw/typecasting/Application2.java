package com.lhw.typecasting;

public class Application2 {
    public static void main(String[] args) {
//        강제 형변환
        /* 1. 정수 끼리의 강제 형변환 */
        // 의도하지 않은 값손실
        long lnum = 80000000000L;
//      int inum = lnum;			  //데이터 손실 가능성을 컴파일러가 알려준다. (에러남)
        int inum = (int) lnum;		//변경하려는 자료형을 명시하여 강제 형변환을 해야 함
        System.out.println(inum);   // 오버플로우 발생

        // 의도한 값손실
        float avg = 31.235f;
        int floorNum = (int) avg; //의도해서 소숫점을 제거한다.

        short snum = (short) inum;
        byte bnum = (byte) snum;

        /* 2. 실수 끼리의 강제 형변환 */
        double dnum = 8.0;
//      float fnum = dnum;			//데이터 손실 가능성을 컴파일러가 알려준다. (에러남)
        float fnum = (float) dnum;

        System.out.println(fnum);

    }
}
