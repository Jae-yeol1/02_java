package com.ohgiraffers.operatorPractice;

public class Application2 {

    public static void main(String[] args) {

        int Num1 = 19;
        String result = (Num1 <= 13) ? "어린이" :
                (Num1 <= 19) ? "청소년" :
                        "성인";

                System.out.println(result);

    }
}
