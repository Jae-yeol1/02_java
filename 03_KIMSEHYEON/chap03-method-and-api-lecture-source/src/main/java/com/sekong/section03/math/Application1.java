package com.sekong.section03.math;

import java.util.Random;

public class Application1 {
    public static void main(String[] args) {
        /* 절대값 출력 */
        /* 클래스의 full-name을 다 적은 경우 */
        System.out.println("-7의 절대값 : " + (java.lang.Math.abs(-7)));

        /* java.lang패키지는 import 하지 않고 사용할 수 있도록 해 놓았다.
         * 컴파일러가 import java.lang.*; 이 코드를 자동으로 추가해서 컴파일을 하기 때문이다.
         * */
        System.out.println("-1.25의 절대값 : " + (Math.abs(-1.25)));

        /* 우리가 Calculator에 만든 min과 max를 구하는 기능도 이미 제공하고 있다. */
        System.out.println("10과 20중 더 작은 것은 : " + Math.min(10, 20));
        System.out.println("20과 30중 더 큰 것은 : " + Math.max(20, 30));

        /* 수학적으로 많이 사용하는 고정된 값들도 이미 Math 안에 정의된 것이 있다.
         * 필드 라는 것을 이용한 것인데 이 부분은 나중에 다루게 되니 걱정하지 말자
         * */
        System.out.println("원주율 : " + Math.PI);			//원의 둘레나 이런거 계산할 때 미리 정의된 값이니 그냥 불러다 쓰면 된다.

        /* 난수를 발생시키는 것도 있다
         * 0부터 1 전까지의 실수 형태의 난수를 발생시킨다.
         * 얘는 호출할 때마다 다른 값을 가진다.
         * */
        System.out.println("난수 발생 : " + Math.random());

        /* 난수의 활용 */
        /* Math.random()을 이용해 발생한 난수는 0부터 1전까지의 실수 범위의 난수값을 반환한다.
         * 원하는 범위의 난수를 구하는 공식
         *(int) (Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최소값
         */
        //0~9
        int random1 = (int)(Math.random() * 10);
        System.out.println("0 부터 9 사이의 난수 : " + random1);
        // 0~99
        int random2 = (int)(Math.random() * 100);
        System.out.println("0 부터 99 사이의 난수 : " + random2);
        // 1 ~ 10
        int  random3 = (int)(Math.random() * 10) + 1;
        System.out.println("1 부터 10 사이의 난수 : " + random3);
        // 10~15
        int random4 = (int)(Math.random() * 6) + 10; // 0.0 <= (math.random() * 6 ) < 6.0
        System.out.println("10 부터 15 사이의 난수 : " + random4);
        // -128 ~ 127
        int random5 = (int)(Math.random() * 256) - 128;
        System.out.println("-128 부터 127까지의 난수 발생 : " + random5);
        // 10~99
        int random6 = (int)(Math.random() * 90) + 10;
        System.out.println("10 부터 99까지의 난수 발생 : " + random6);

        /* java.util.Random 클래스 */
        /* java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생
         * nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜서 정수 형태로 반환 */

        /* 원하는 범위의 난수를 구하는 공식
         * random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
         * */

        Random random = new Random();
        // 0 ~ 9
        int random7 = random.nextInt(10);
        System.out.println("0 부터 9 까지의 난수 : " + random7);
        // 1 ~ 10
        int random8 = random.nextInt(10) + 1;
        System.out.println("1 부터 10 까지의 난수 : " + random8);
        // 20 ~ 45
        int random9 = random.nextInt(26) + 20;
        System.out.println("20 부터 45 까지의 난수 : " + random9);

        // -128 ~ 127
        int random10 = random.nextInt(256) -128;
        System.out.println("-128 부터 127 까지의 난수 : " + random10);
    }
}
