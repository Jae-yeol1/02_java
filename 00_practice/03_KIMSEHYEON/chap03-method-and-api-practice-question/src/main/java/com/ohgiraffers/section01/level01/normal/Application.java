package com.ohgiraffers.section01.level01.normal;

public class Application {

    public static void main(String[] args) {

        // 실행용 클래스
        RandomMaker random = new RandomMaker();
        String coin = random.tossCoin();
        System.out.println(coin);

    }
}
