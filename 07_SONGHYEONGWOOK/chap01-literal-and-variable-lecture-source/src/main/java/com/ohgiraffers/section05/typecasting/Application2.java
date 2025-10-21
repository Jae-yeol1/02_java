package com.ohgiraffers.section05.typecasting;

public class Application2 {

    public static void main(String[] args) {
        
        // long lNum = 80000000000;
        // 의도하지않은 값손실
        long lNum = 80000000000L;
        int iNum = (int) lNum;
        System.out.println("iNum = " + iNum);

        // 형변환 방법
        long llNum = 8;
        int iiNum = (int) llNum;
        System.out.println("iNum = " + iNum);
        int isum = (int) (iNum + lNum);
        int isum2 = iNum + (int) lNum;
        long lsum = iNum + lNum;

        // 의도한 값손실
        float avg = 31.235f;
        int floorNum = (int) avg;
        System.out.println("floorNum = " + floorNum);

        // **주의** int 미만의 연산의 처리 결과는 int형임
    }
}
