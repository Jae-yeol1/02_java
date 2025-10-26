package com.ohgiraffers.section01.method;

import org.w3c.dom.ls.LSOutput;

import java.util.SplittableRandom;

public class Application4 {

    public static void main(String[] args) {

        Application4 app = new Application4();
        // 이름 , 나이 , 성별을 입력받아서 "당신의 이름은 xxx이고 ,나이는 xx 세이며 성별은 xx입니다 를 출력하는 메소드
        app. testmethodA("홍길동",20,'남');
        app. testmethodA("홍길순",22,'여');  // 인자값 요구사항대로

        String name = "신사임당";
        int age = 40;
        char gender = '여';
        app.testmethodA(name,age,gender);
    }

    private void testmethodA(String name, int age , char gender) {
        System.out.println("당신의 이름은" + name + "이고, 나이는"+ age +"세이며 성별은"+ gender + "입니다");
    }

}
