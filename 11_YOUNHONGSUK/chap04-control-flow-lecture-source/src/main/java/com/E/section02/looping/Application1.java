package com.E.section02.looping;

public class Application1 {

    public static void main(String[] args) {

        B_nestedFor b =  new B_nestedFor();
        //b.printMulttable();
     //   b.printStars();

        C_while c = new C_while();
        //c.testWhile();
c.testWhileEx();
    }
    //1 부터 10까지 증가
    public void printI(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
