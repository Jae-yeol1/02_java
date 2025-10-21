package com.ogiraffers.section01.method;

public class Application4 {

    public static void main(String[] args) {
        Application4 a = new Application4();
        // 이름, 나이, 성별을 입력받아서 "당신의 이름은 xxx이고, 나이는 xx 세 이며, 성별은 xx입니다.

     a.introduce("홍길동", 20, "남자");
     String name = "신사임당";
     int age = 40;
     String gender = "여자";

     a.introduce(name, age, gender);

    }

    public void introduce(String name, int age, String gender) {

        System.out.println(
                "당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다."
        );
    }
}
