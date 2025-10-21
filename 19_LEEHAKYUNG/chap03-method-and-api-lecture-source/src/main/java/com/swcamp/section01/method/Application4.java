package com.swcamp.section01.method;

public class Application4 {

    public static void main(String[] args) {

        Application4 app = new Application4();
        // 이름, 나이, 성별을 입력받아서 "당신의 이름은 xxx이고, 나이는 xx세이며, 성별은 xx입니다" 를 출력하는 메서드
        app.testMethodA("이하경", 24, "여자");
        app.testMethodA("감나무", 36, "남자");

        String ex_name = "배나무";
        int ex_age = 68;
        String ex_gender = "여자";
        app.testMethodA(ex_name, ex_age, ex_gender);

    }

    private void testMethodA(String name, int age, String gender) {
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세이며, 성별은 " + gender + "입니다.");

    }
}
