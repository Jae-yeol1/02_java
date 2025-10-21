package com.E.section01.method;

public class Application4 {
    public static void main(String[] args) {

        Application4 app = new Application4();
        // 이름 나이 성별 입력 받아서 정보 반환
        app.testmethodA("홍길동", 20, '남');
    }

    private static void testmethodA (String name, int age, char gender){
        System.out.println(name + " " + age + " " +  gender);
    }

}
