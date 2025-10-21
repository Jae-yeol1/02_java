package org.com.ohgiraffers.section01.method;

public class application4 {
    public static void main(String[] args) {

        application4 app = new application4();
        app.testmethod("홍길동", 20,'남');

        String name = "유관순";
        int age = 18;
        char gender = '여';

        app.testmethod(name, age, gender);

    }

    public void testmethod(String name, int age, char gender) {

        System.out.println("당신의 이름은 " + name +" 이고, 나이는 " + age +"세 이며, 성별은" + gender + "성입니다.");
    }
}
