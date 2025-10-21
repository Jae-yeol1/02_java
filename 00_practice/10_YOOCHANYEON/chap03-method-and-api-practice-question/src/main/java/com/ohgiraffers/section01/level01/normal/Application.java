package com.ohgiraffers.section01.level01.normal;

import java.util.Scanner;
public class Application {

    public static void main(String[] args) {

        // 실행용 클래스
        RandomMaker rand = new RandomMaker();
        Scanner sc = new Scanner(System.in);

        System.out.println("앞면? 뒷면?");
        String answer = sc.next();
        String result = rand.tossCoin();
        boolean isCorrect = answer.equals(result);
        String correct = (isCorrect)? "정답!!" : "땡! 탈락!";
        System.out.println("정답은 : " + result + " " + correct);
    }
}
