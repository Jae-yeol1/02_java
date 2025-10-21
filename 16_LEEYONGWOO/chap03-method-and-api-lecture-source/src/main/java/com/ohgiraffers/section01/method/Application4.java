package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {
        Application4 app = new Application4();
        // 이름,나이,성별을 입력받아서 "당신의 이름은 xxx이고, 나이는 xx세이며,
        app.textMethodA("홍길동",20,'남');
        app.textMethodA("유관순",16,'여');

        String name="신사임당";
        int age =40;
        char gender='여';
        app.textMethodA(name,age,gender);

    }

    private void textMethodA(String name , int age, char gender) {

    }
}
