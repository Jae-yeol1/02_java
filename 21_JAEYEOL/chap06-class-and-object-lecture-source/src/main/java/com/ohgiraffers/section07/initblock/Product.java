package com.ohgiraffers.section07.initblock;

public class Product {



    //jvm 기본값
    // 명시적 초기화를함
    private String name  = "은하수";
    private int price = 2000000;
    private static String brand = "삼송" ;
    public Product(){
        System.out.println("기본생성자 동작함");
    }


    /*3. 초기화 블럭*/
    /*인스턴스 초기화 블럭*/

    {
        name = "사이언";
        price = 800000;
//        brand = "사과";
        System.out.println("인스턴스 초기화 블럭작동함");
    }

    /*static 초기화 블럭*/
    static {
        brand = "헬지";

        // name = "아이뽕";  // 이자리는 static 자리인데  아직 생기지  못한게 들어온거?
        System.out.println("static 초기화 블럭 작동함");
    }
    /*4. 기본생성자*/


    public String getInformation(){
        return this.name + " " +  this.price + " " + Product.brand;
    }
}
