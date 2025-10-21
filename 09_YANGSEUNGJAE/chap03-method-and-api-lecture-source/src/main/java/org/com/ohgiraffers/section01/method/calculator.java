package org.com.ohgiraffers.section01.method;

public class calculator {

    public int plusTwoNumbers(int first, int second) {
        return first + second;
    }
    public int subTwoNumbers(int first, int second) {
        return first - second;
    }
    public static int minNumberOf(int first, int second) {
        return (first > second)? second : first;
    }
    public static int maxNumberOf(int first, int second) {
        return (first < second)? second : first;
    }

}

