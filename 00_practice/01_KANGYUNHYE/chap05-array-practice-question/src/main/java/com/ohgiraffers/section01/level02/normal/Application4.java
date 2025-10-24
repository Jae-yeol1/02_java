package com.ohgiraffers.section01.level02.normal;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */

        // 45개중에 6개 중복 x

        int ro[] = new int[6];
//        for(int i = 0;i<6;i++) {
//            ro[i] =(int)(Math.random() * 45) + 1;
//        }

        for(int j=0;j<6;j++){

            ro[j] = (int)(Math.random() * 45) + 1;

            a:
            for(int i = 0;i<6;i++) {
                if(i != j ) {
                    while(ro[j] == ro[i]) {
                        j -= 1;
                        break a;
                    }
                }

            }
        }

        for(int j=0;j<6;j++){
            System.out.print(ro[j] + " ");
        }



    }
}
