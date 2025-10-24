package com.lhw.section02.looping;

public class Application {

    public static void main (String[] args) {
        A_for afor = new A_for();
        //afor.testSimpleForStetement();
//        afor.test1();
//        afor.test2();
//        afor.test3();

        B_nestedFor bfor = new B_nestedFor();
//        bfor.printGugudanFromTwoToNine();
//        bfor.downStairStar();

        C_while cwhile = new C_while();
//        cwhile.testSimpleWhileStatement();
//        cwhile.testWhileExample();
        cwhile.testSimpleDoWhileStatement();
    }
}
