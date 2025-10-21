package org.com.ohgiraffers.section01.method;

public class application7 {
    public static void main(String[] args) {
        int first = 100;
        int second = 50;

        calculator Calculator = new calculator();
        System.out.println("두수의 합은? : " + Calculator.plusTwoNumbers(first, second));
        System.out.println("두수의 차는? : " + Calculator.subTwoNumbers(first, second));

        System.out.println("두 수중 큰 값은? : " + calculator.maxNumberOf(first, second));

    }
}
