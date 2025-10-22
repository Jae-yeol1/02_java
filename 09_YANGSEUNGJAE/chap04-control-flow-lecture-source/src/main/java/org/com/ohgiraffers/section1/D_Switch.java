package org.com.ohgiraffers.section1;

import java.util.Scanner;

public class D_Switch {
    public void testSimpleSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int first = sc.nextInt();
        System.out.print("두번째 정수 : ");
        int second = sc.nextInt();
        System.out.print("연산기호입력 : ");
        char op = sc.next().charAt(0);

        int result = 0;
        switch (op) {
            case '+': result = first + second; break;
            case '-': result = first - second; break;
            case '*':
            case 'X': result = first * second; break;
            case '/': result = first / second; break;
            case '%': result = first % second; break;
            // case의 비교할변수가 비교값과 일치하지 않을 시 반환값
            default:
        }
        System.out.println(first + " " + op + " " + second + " " + result);
    }
        public void imProveSwitchStatement() {
            Scanner sc = new Scanner(System.in);
            System.out.print("첫번째 정수 : ");
            int first = sc.nextInt();
            System.out.print("두번째 정수 : ");
            int second = sc.nextInt();
            System.out.print("연산기호입력 : ");
            char op = sc.next().charAt(0);

            int result = switch (op) {
                case '+' -> {
                    System.out.println("더하기 연산자 실해");
                    yield first + second;
                }
                case '-' -> first  - second;
                case '*','x' -> first * second;
                case '/'-> first / second;
                case '%' -> first % second;
                default -> 0;
            };
            System.out.println(first + " " + op + " " + second + " " + result);
        }
}
