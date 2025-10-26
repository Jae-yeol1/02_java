package com.ohgiraffers.section07.initblock;

import org.w3c.dom.ls.LSOutput;

import java.util.Properties;

public class Application {
    public static void main(String[] args) {


        //product 클래스 호출
        Product product = new Product();
        System.out.println("product.imformation = " + product.getInformation());

        Properties product2 = new Properties();
        System.out.println("대륙폰 샤우미 = " + product.getInformation());

    }



}
