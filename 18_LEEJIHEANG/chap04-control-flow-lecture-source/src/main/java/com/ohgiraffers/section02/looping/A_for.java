//package com.ohgiraffers.section02.looping;
//
//import java.util.Scanner;
//
//public class A_for {
//
//    // 1부터 10까지 1씨 증가하면서 i값을 출력하는 기본 반복물
//    // 동안(1부터 ; 10까지 ; 1씩증가 ){
//    // 1부터 10까지 반복하며 출력
//    public void testSimpleForStatement() {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//
////            public void test () {
////                Scanner sc = new Scanner(System.in);
////\
////
////            }
////        }
////
////        /*반복횟수 : 총 10번
////        시작값은 0일에서 1 알아서 시작
////        1.안내문구 출력
////        2. 학생 이름을 입력받아 변수에 저장
////        3. 저장된 이름을 출력
////         */
////        for (int i = 1; )
////    }
//
//    public void test2() {
//
//        int num1 = 1;
//        int num2 = 2;
//        int num3 = 3;
//        int num4 = 4;
//        int num5 = 5;
//        int num6 = 6;
//        int num7 = 7;
//        int num8 = 8;
//        int num9 = 9;
//        int num10 = 10;
//
//        int sum = 0;
//        sum += num1;
//        sum += num2;
//        sum += num3;
//        sum += num4;
//        sum += num5;
//        sum += num6;
//        sum += num7;
//        sum += num8;
//        sum += num9;
//        sum += num10;
//
//        System.out.println("sum = " + sum);
//
//        /*
//         * 반복할 횟수 : 10번, 초기식 : 1
//         * 반복해야할 내용:
//         * 1. 변수에 1씩 증가하는 값을 담기
//         * 2. 저장된 값을 sum에 누적시키기
//         * */
//
//        int sum2 = 0;
//        for (int i = 1; i < 11; i++) {
//            sum2 += i;
//        }
//
//        System.out.println("sum2 = " + sum2);
//
//
//    }
//
//    public void test3() {
//
//        /*
//         * 5~10사이의 난수를 발생시켜서
//         * 1부터 발생한 난수까지의 합계를 구해보자
//         * 단, 반복문은 어려우니깐 쓰지말고보자
//         * */
//        int random = (int) (Math.random() * 6) + 5;
//        System.out.println("random =" + random);
//
//        int sum = 0;
//
//        if (random == 5) {
//            sum += 1;
//            sum += 2;
//            sum += 3;
//            sum += 4;
//            sum += 5;
//        } else if (random == 6) {
//            sum += 1;
//            sum += 2;
//            sum += 3;
//            sum += 4;
//            sum += 5;
//            sum += 6;
//        } else if (random == 7) {
//            sum += 1;
//            sum += 2;
//            sum += 3;
//            sum += 4;
//            sum += 5;
//            sum += 6;
//            sum += 7;
//        } else if (random == 8) {
//            sum += 1;
//            sum += 2;
//            sum += 3;
//            sum += 4;
//            sum += 5;
//            sum += 6;
//            sum += 7;
//            sum += 8;
//        } else if (random == 9) {
//            sum += 1;
//            sum += 2;
//            sum += 3;
//            sum += 4;
//            sum += 5;
//            sum += 6;
//            sum += 7;
//            sum += 8;
//            sum += 9;
//        } else if (random == 10) {
//            sum += 1;
//            sum += 2;
//            sum += 3;
//            sum += 4;
//            sum += 5;
//            sum += 6;
//            sum += 7;
//            sum += 8;
//            sum += 9;
//            sum += 10;
//
//
//        }
//        System.out.println("1부터 " + random +"까지의 합은 " +sum);
//
//    /*
//    * 반복횟수 : 5~10까지 난수만큼, 초기식 : 1
//    * 반복할 내용: 1부터 난수까지의 합을 구하면 된다.
//    * */
//        int sum2 = 0;
//        for(int i =1; i<=random; i++) {
//            sum2 += i;
//        }
//        System.out.println("1부터 " + random +"까지의 합은 " +sum2);
//
//    }
//}