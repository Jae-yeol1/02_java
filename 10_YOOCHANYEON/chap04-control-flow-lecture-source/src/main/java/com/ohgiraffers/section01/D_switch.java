package com.ohgiraffers.section01;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이건 첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.println("이건 두 번째 정수 :");
        int second = sc.nextInt();
        System.out.println("이건 세 번째 문자 : ");
        char op =  sc.next().charAt(0);

        int result = 0;

        switch(op){
            case '+': result = first + second; break;
            case '-': result = first - second; break;
            case '*':
            case 'x': result = first * second; break;
            case '/': result = first / second; break;
            case '%': result = first % second; break;
            // case에서 일치 값을 찾지 못하는 경우
            default:
        }
        System.out.println(first + " " + op +  " " + second + " = " + result);
    }

    public void improveSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이건 첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.println("이건 두 번째 정수 :");
        int second = sc.nextInt();
        System.out.println("이건 세 번째 문자 : ");
        char op =  sc.next().charAt(0);

        int result = switch (op) {
          case '+' -> {
              System.out.println("더해");
              yield first + second;
          }
          case '-' -> {
              System.out.println("빼");
              yield first - second;
          }
          case '*', 'x' -> {
              System.out.println("곱혀");
              yield first * second;
          }
          case '/' -> {
              System.out.println("쪼개");
              yield first / second;
          }
          case '%' -> {
              System.out.println("남은 거");
              yield first % second;
          }
          default -> 0;
        };

//        switch(op){
//            case '+': result = first + second; break;
//            case '-': result = first - second; break;
//            case '*':
//            case 'x': result = first * second; break;
//            case '/': result = first / second; break;
//            case '%': result = first % second; break;
//            // case에서 일치 값을 찾지 못하는 경우
//            default:
//        }
        System.out.println(first + " " + op +  " " + second + " = " + result);
    }
}
