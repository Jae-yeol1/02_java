package com.E.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitch(){
        Scanner sc = new Scanner(System.in);
        System.out.println("give me a num");
        int first = sc.nextInt();
        System.out.println("give me a num");
        int second = sc.nextInt();
        System.out.print("give operator");
        char op = sc.next().charAt(0);

        int result = 0;

        switch (op) {
            case '+': result = first + second;break;
            case '-': result = first - second;break;
            case '*':
            case 'x': result = first * second;break;
            case '/' : result = first / second;break;
            case '%': result = first & second;break;
            //일치하느 case가 없는 경우 실행
            default:
        }

        System.out.println(first + " " + op + " " + second + " = " + result);

    }

    public void betterSwitch(){
        Scanner sc = new Scanner(System.in);
        System.out.println("give me a num");
        int first = sc.nextInt();
        System.out.println("give me a num");
        int second = sc.nextInt();
        System.out.print("give operator");
        char op = sc.next().charAt(0);


        /*
* 2개 이상의 명령문을 작성해야 하는 경우 {} 생략하지 못하고 작성해야한다
* 반환값을 yield라는 명령문을 작성하여 명시적으로 리턴한다
* */
        int result = switch (op) {
            case '+' -> {
                System.out.println("addition activated");
                yield first + second;
            }

            case '-' -> first - second;
            case '*' -> first * second;
            case '/' -> first / second;
            case '%' -> first % second;
            default -> 0;

        };

        System.out.println(first + " " + op + " " + second + " = " + result);

    }


}
