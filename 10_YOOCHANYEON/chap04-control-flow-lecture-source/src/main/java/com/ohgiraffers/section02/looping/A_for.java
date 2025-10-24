package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    // 1부터 10까지 1씩 증가시키면서 i 값을 출력하는 기본 반복문
    // 동안 (1부터; 10까지; 1씩 증가) {
    //  1부터 10까지 반복하여 출력
    // }
    public void test1() {

//        for(int i = 1; i <= 10; i++){
//            System.out.println(i + "대");
//        }

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            System.out.println(i + " 번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + " 번째 학생의 이름은 " + student + "입니다.");
        }
        System.out.println("학생 10명의 이름을 입력 받고 출력하였습니다.");
    }

    public void test2() {

        int sum = 0;
        for (int i = 0; i <= 10; i++){
            int num = i;

            sum += num;
        }
        System.out.println("숫자들의 총 합은 ?" + sum);
    }

    public void test3() {
        /*
        * 5 ~ 10 사이의 난수를 발생시켜서
        * 1부터 발생한 난수까지의 합계를 구해보자
        * 단, 반복문은 어려우니깐 쓰지 말고 해보기*/

        int random = (int) (Math.random() * 6) + 5;
        System.out.println("난수 : " + random);
        int sum = 0;

        if(random == 5){
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
        } else if(random == 6){
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
        } else if(random == 7){
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
        } else if(random == 8){
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
        } else if(random == 9){
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
        } else if(random == 10){
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
            sum += 10;
        }
        System.out.println("1부터 " + random + "까지의 합은 " + sum + "임다");

        /*
        반복 횟수 : 5~10까지의 난수만큼, 초기식 : 1
        반복할 내용 : 1부터 난수까지의 합
         */
        int sum2 = 0;

        for (int i = 1; i <= random; i++) {
            sum2 += i;
        }
    }
}
