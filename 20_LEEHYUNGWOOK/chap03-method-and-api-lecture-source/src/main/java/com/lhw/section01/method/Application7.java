package com.lhw.section01.method;

public class Application7 {

    public static void main(String[] args) {

        int first = 100;
        int second = 50;

        Calculator cal = new Calculator();

        // 덧셈
        System.out.println("두 수의 합은? " + cal.plusTwoNumbers(first, second));
        // 뺄셈
        System.out.println("두 수의 차는? " + cal.subTwoNumbers(first, second));
        // max
        System.out.println("Max "+ Calculator.maxNumberOf(first, second));
        //System.out.println("Min "+ cal.minNumberOf(first, second)); 이렇게는 권장X -> Head에 이미 다 올라와 있는데 굳이 static에서 또 가져오지 않아도 된다.
        // min
        System.out.println("min = " + Calculator.minNumberOf(first, second));
    }
}
