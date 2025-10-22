package com.sekong.section04.Scanner;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
//        /*
//         * 주민등록번호를 입력받아서 남자이면 "남자 입니다.", 여자이면 "여자 입니다"를 출력하세요
//         *
//         * 힌트 : charAt()
//         * 예시)
//         * 주민등록번호를 입력해주세요(- 포함) : 881122-1
//         *
//         * ---출력----
//         * 남자 입니다
//         * */
//
        Scanner sc = new Scanner(System.in);
//        System.out.println("주민등록번호를 입력해주세요(- 포함)");
//        char num = sc.next().charAt(7);
//        if (num == '1' || num == '3'){
//            System.out.println("남자입니다.");
//        }
//        else if (num == '2' || num == '4'){
//            System.out.println("여자입니다.");}
//       // 정수형
        /* nextInt() : 입력받은 값을 int형으로 반환한다. nextByte()/nextShort()는 생략한다.
         * 숫자가 아닌 값을 입력하게 되면 InputMismatchException이 발생한다.
         * int 범위를 초과한 값을 입력받게 되면 역시 InputMismatchException이 발생한다.
         * Exception은 나중에 다시 다루게 되겠지만 쉽게 표현하자면 에러 같은 개념이라고 생각하자.
         * */
//        System.out.print ("나이를 입력하세요 : ");
//        int age = sc.nextInt();
//        System.out.println("age = " + age);
//        System.out.print("키를 입력하세요 : ");
//        double height = sc.nextDouble();
//        System.out.println("height = " + height);

        // 논리형 입력받기
        // nextBoolean() : 입력받은 값을 boolean형으로 반환 True/false만 받음
//        System.out.println("true or false 입력 : ");
//        boolean isTrue = sc.nextBoolean();
//        System.out.println("isTrue = " + isTrue);

        // 문자열 입력받기
        // next() : 공백 또는  개행문자까지
        // 만약 공백이 있을 경우 버퍼에 저장해두기 때문에 두번째 입력을 받지 않을 수 있다.
        // 세 콩 입력시 name = 세 name2 = 콩이 됨
//        System.out.println("이름을 입력하세요 : ");
//        String name = sc.next();
//        System.out.println("name = " + name);
//        System.out.println("이름 2 입력");
//        String name2 = sc.next();
//        System.out.println("name2 = " + name2);

        // nextLine() : 개형문자까지 다 가져옴. 공백 포함
//        System.out.println("주소를  입력하세요 : ");
//        String address = sc.nextLine();
//        System.out.println("address = " + address);

        // 문자
        // 문자만 입력받는 메소드는 Scanner에서 제공하지 않으므로
        // String에서 제공하는 charAt(index) 메소드르르 통해 문자를 분리해서 활용할 수 있다.
        /* 아쉽게도 문자를 직접 입력 받는 기능을 제공하지는 않는다.
         * 따라서 문자열로 입력을 받고, 입력받은 문자에서 원하는 순번째 문자를 분리해서 사용해야 한다.
         * java.lang.String에 charAt(int index)를 사용한다.
         * index를 정수형으로 입력하면 문자열에서 해당 인덱스에 있는 한 문자를 문자 형으로 반환해주는 기능을 한다.
         *
         * index는 0부터 시작하는 숫자 체계이며 컴퓨터에서 주로 사용되는 방식이다.
         * 만약 존재하지 않는 인덱스를 입력하게 되면 IndexOutOfBoundsException이 발생한다.
         * */
        sc.nextLine();		//이건 뒤에서 설명할 예정이다
        System.out.print("아무 문자나 입력 해주세요 : ");
        char ch = sc.nextLine().charAt(0);
        System.out.println("입력하신 문자는 " + ch + "입니다.");



    }
    //
}
