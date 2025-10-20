package com.sehyeon.section5.typecasting;

public class Application2 {
    public static void main(String[] args) {
        /* 1. 정수 끼리의 강제 형변환 */
        long lnum = 80000000000L;
        //int inum = lnum;			  //데이터 손실 가능성을 컴파일러가 알려준다. (에러남)
        int inum = (int) lnum;		//변경하려는 자료형을 명시하여 강제 형변환을 해야 함
        System.out.println("inum : " + inum);

        short snum = (short) inum;
        byte bnum = (byte) snum;
        System.out.println("snum: "+ snum + "bnum : " + bnum);
        /* 2. 실수 끼리의 강제 형변환 */
        double dnum = 8.0;
        //float fnum = dnum;			//데이터 손실 가능성을 컴파일러가 알려준다. (에러남)
        float fnum = (float) dnum;

        System.out.println(fnum);

        // 의도하지 않은 데이터 손실
        int inum2 = 290;
        byte bnum2= (byte) inum;

        System.out.println("inum2 : " + inum2);
        System.out.println("bnum2 : " + bnum2);		//비트 앞부분 손실로 예측 어려움

        // 의도한 데이터 손실
        double height = 175.5;
        int floorHeight = (int) height;

        System.out.println("height : " + height);
        System.out.println("floorHeight : " + floorHeight);		//소수점 절삭에 이용할 수 있다.

        // 서로 다른 자료형끼리의 연산
        /* 다른 자료형 끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리 된다. */
        int inum3 = 10;
        long lnum3 = 100;

        /* 자바에서는 같은 자료형끼리만 연산이 가능하다.
         * 따라서 서로 자료형이 다른 두 자료를 연산할 때 자료형이 같아지도록 형변환을 해 주어야 한다.
         * */

        /* 방법1. 두 수의 연산 결과를 int 형으로 변환 후 int 자료형 변수에 리턴받는다. */
        //int isum = inum + lnum;		//그냥은 안된다. 두 자료형의 연산 결과는 큰 쪽 자료형인 long이 되고, long형 값은 int형 변수에 담길 수 없다.
        int isum = (int) (inum3 + lnum3);

        System.out.println("isum : " + isum);

        /* 방법2. long 형 값을 int로 강제 형변환 한다. */
        int isum2 = inum3 + (int) lnum3;

        System.out.println("isum2 : " + isum2);

        /* 방법3. 결과 값을 long형 자료형으로 받는다(자동 형변환 이용) */
        long lsum = inum3 + lnum3;

        System.out.println("lsum : " + lsum);

    }

}
