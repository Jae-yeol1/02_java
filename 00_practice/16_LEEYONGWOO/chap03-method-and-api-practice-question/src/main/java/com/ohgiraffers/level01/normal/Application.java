package com.ohgiraffers.section01.level01.normal;

import com.ohgiraffers.section01.level01.normal.RandomMaker;
public class Application {

    public static void main(String[] args) {

        // 실행용 클래스
        RandomMaker ran=new RandomMaker();
        System.out.println("동전은 과연 앞면? 뒷면? :"+ ran.tossCoin(Math.random()*10));
    }
}
