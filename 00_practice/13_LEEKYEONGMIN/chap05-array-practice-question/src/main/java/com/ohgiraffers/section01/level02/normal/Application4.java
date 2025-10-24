package com.ohgiraffers.section01.level02.normal;

import java.net.StandardSocketOptions;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  1~45 중 6개를 선택
		  단, 중복 값 없이 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
		  int random1 = (int) (Math.random() * 10);
	   */
        int arr[] = new int[6];
        for(int i=0;i<6;i++){
            int random = (int)(Math.random()*45)+1;
            arr[i]=random;
            for (int j=i-1;j>=0;j--){
                if(arr[j]==arr[i]) {
                    //System.out.print("중복");
                    i--;
                    break;
                }
            }
        }
        for(int k=0;k<=5;k++){
            System.out.print(arr[k]+" ");
        }

    }
}
