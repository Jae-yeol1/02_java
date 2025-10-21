package com.ogiraffers.section01.method;

import javax.print.DocFlavor;

public class Application4 {

    public static void main(String[] args) {

        Application4 app = new Application4();
        // 이름, 나이, 성별을 입력받아서 "당신의 이름은 xxx이고, 나이는 xx세이며, 성별은 xx입니다"를 출력하는 메소드
        app.testMethodA("홍길동", i:20, 남: '남');
        app.testMethodA("유관순", i:20, 남: '남');
    }

    public void testMethodA(STRING name, int age, final char gender) {
        System.out.println("당신의 이름은 " + name + "이고, 나이는" + age + "세 이며, 성별은" + "gender +입니다.");
    }
}
