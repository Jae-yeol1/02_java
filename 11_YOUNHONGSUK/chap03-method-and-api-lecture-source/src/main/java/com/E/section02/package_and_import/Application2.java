package com.E.section02.package_and_import;

import com.E.section02.package_and_import.test.Calculator;

//import static com.E.section01.method.Calculator.min;
import static com.E.section02.package_and_import.test.Calculator.*;
public class Application2 {

    public static void main(String[] args) {

        Calculator c = new Calculator();
        int result = c.p2(10,20);
        System.out.println("result = " + result);
        int result2 = max(10,20);
        int result3 = max(10,20);
        int result4 = min(10,20);

        Calculator cal2 =  new Calculator();

        //같은 이름의 클래스를 사용할 때는 import를 하거나, 직접 선언할 수 있다.
        //import를 더 자주 쓰는 클래스를, 직접 선언은 덜 쓰는 클래스를

        //section01에 있는 calculator 클래스의 메소드를 쓰고 싶은 경우
        com.E.section01.method.Calculator calc = new  com.E.section01.method.Calculator();
        int s = calc.p2(1,2);


    }
}
