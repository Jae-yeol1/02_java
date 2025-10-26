package com.ohgiraffers.section03.math;

public class Application2 {
    public static void main(String[] args) {
        // random() 의 결과물은 x가  0보다 크고 1.0 보다 작은값을사용
        //  0.0*10 >= 값 <1.0 * 10
        // 0 >= 값 < 10
        // Math.random() * 구하려는 난수의 갯수
        //(int)(math.random() * 구하려는난수의 갯수) +  구하려는 산수의 최소값

        // 0~ 9 까지의 난수를 생성하고싶으면
        int random1 = (int)  (Math.random()*10) + 0 ;
        System.out.println("random1 = " + random1);

        // 1부터 10까지의 난수생성
        int random2 = (int)  (Math.random()*10) + 1; // 0부터 9까지나오는데 이후 1 더헤주면 10 까지 해당 내용이 들어오는 방식
        System.out.println("random2 = " + random2);

        // 10에서 15까지의  난수생성 15 - 10 +1 = 6
        int random3 = (int)  (Math.random()*6) + 10;


        // -128에서 127까지    127 - (- 128 ) >> 255 + 1
        int random4 = (int)  (Math.random()*256) -128; // 256부터 0까지 랜덤으로 값이 뜨고 이후 - 128 처리 함
        System.out.println("random4 = " + random4);






    }
}
