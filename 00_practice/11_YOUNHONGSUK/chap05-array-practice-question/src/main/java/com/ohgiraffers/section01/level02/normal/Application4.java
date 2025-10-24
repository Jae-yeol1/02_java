package com.ohgiraffers.section01.level02.normal;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */
        boolean isClean = true;
        int[] a = new int[6];

        for (int x = 0; x < 100; x++) {
            for(int i = 0; i < a.length; i++){
                //랜덤 값 지정
                int n = (int) (Math.random()*45) + 1;
                a[i] = n;
            }

            int[] dup = new int[6];
            //중복 체크
            out:
            for(int i = 0; i < a.length; i++){
                for(int j = i+1; j < a.length; j++){
                    if(a[i] == a[j]){
                        int n = (int) (Math.random()*45) + 1;
                        a[i] = n;
                        break out;
                    }
                }
            }

            for(int i : a){
                System.out.print(i + " ");
            }
            System.out.println();
        }


    }
}