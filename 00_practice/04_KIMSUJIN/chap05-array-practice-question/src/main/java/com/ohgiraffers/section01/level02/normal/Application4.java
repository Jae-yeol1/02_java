package com.ohgiraffers.section01.level02.normal;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */


        // 로또번호 arr 만들기
        int arr [] = new int [6];

        //숫자 생성해서 arr에 넣기 (중복시 다시 숫자 뽑기)
        for (int i = 0 ; i < arr.length ; i++){
            //random 숫자 생성(1~45)
            int random = (int) (Math.random()*45 + 1);
            arr[i] = random;
            for (int j = 0 ; j < i ; j++){
                if (arr[i] == arr[j]){
                    i --;
                }
            }
        }
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + ", ");
        }
        }
    }

