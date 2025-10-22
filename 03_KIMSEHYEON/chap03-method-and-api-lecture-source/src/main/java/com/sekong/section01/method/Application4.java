package com.sekong.section01.method;

public class Application4 {
    public static void main(String[] args) {

        Application4 app = new Application4();
        // 이름, 나이, 성별을 입력받아서 "당신의 이름은 xxx이고, 나이는 xx세 이며, 성별은 xx입니다"를 출력하는 메소드
        app.testMethodA("홍길동",20,'남');
        /* 2. 변수에 저장된 값을 전달하며 호출할 수 있다. */
        String name = "유관순";
        int age = 20;
        char gender = '여';
        app.testMethodA(name, age, gender);
    }


    public void testMethodA(String name, int age, final char gender){
        /* 매개변수도 일종의 지역변수로 분류된다.
         * 매개변수 역시 final 키워드를 사용할 수 있다.
         * 지역변수에 final 키워드를 붙여 상수를 만드는 것과 동일하다.
         * final 매개변수는 상수 네이밍 규칙을 선택적으로 따르는 경향이 있다. (써도 되고 안써도 됨)
         * */
        System.out.println("당신의 이름은 " + name +"이고, 나이는 " + age + "이며, 성별은 " + gender + "입니다.");
        /* 메소드 주석도 달아주자. 호출구문에 마우스를 올리면 메소드에 대한 설명을 볼 수 있다. */
    }
}
