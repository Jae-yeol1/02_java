package com.lhw.section04.scanner;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {
        
        // 1. Scanner 객체 생서
        Scanner sc = new Scanner(System.in);
        
        // 정수값 받기
        // nextInt() : 입력받은 값을 Int형으로 반환
//        System.out.print("나이를 입력하세요: ");
//        int age = sc.nextInt();
//        System.out.println("age = " + age);

        // 실수값
//        System.out.print("원하는 실수를 입력하세요 : ");
//        double height = sc.nextDouble();
//        System.out.println("height =  " + height + "입니다.");

        // 논리형
//        System.out.print("참과 거짓 중에 한 가지를 true or false로 입력해주세요 : ");
//        boolean isTrue = sc.nextBoolean();
//        System.out.println("입력하신 논리 값은 " + isTrue + "입니다.");

        /* 2-2. next() */
//        System.out.print("이름을 입력하세요 : ");
//        String firstName = sc.next();
//        String lastName = sc.next();
//        System.out.println("firstName = " + firstName);
//        System.out.println("lastName = " + lastName);

        //sc.nextLine();		//이건 뒤에서 설명할 예정이다
//
//        System.out.print("주소를 입력하세요: ");
//        String address = sc.nextLine();
//        System.out.println("address = " + address);

        /* 2-5. 문자형 값 입력받기 */
        /* 아쉽게도 문자를 직접 입력 받는 기능을 제공하지는 않는다.
         * 따라서 문자열로 입력을 받고, 입력받은 문자에서 원하는 순번째 문자를 분리해서 사용해야 한다.
         * java.lang.String에 charAt(int index)를 사용한다.
         * index를 정수형으로 입력하면 문자열에서 해당 인덱스에 있는 한 문자를 문자 형으로 반환해주는 기능을 한다.
         *
         * index는 0부터 시작하는 숫자 체계이며 컴퓨터에서 주로 사용되는 방식이다.
         * 만약 존재하지 않는 인덱스를 입력하게 되면 IndexOutOfBoundsException이 발생한다.
         * */
        System.out.print("아무 문자나 입력 해주세요 : ");
        char ch = sc.nextLine().charAt(3); // 문자형은 "".chatAt(index) 형식으로 사용.
        System.out.println("입력하신 문자는 " + ch + "입니다.");

        /*
         * 주민등록번호를 입력받아서 남자이면 "남자 입니다.", 여자이면 "여자 입니다"를 출력하세요
         *
         * 힌트 : charAt()
         * 예시)
         * 주민등록번호를 입력해주세요(- 포함) : 881122-1
         *
         * ---출력----
         * 남자 입니다
         * */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("주민등록번호를 입력해주세요(- 포함)");
//        char num = sc.nextLine().charAt(7);
//        if (num == '1' || num == '3') {
//            System.out.println("남자입니다.");
//        } else if (num == '2' || num == '4') {
//            System.out.println("여자입니다.");
//        }
    }
}
