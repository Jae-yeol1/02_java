package com.greedy.level02.normal.book.model.run;

import com.greedy.level02.normal.book.model.dto.BookDto;

public class Application {

    public static void main(String[] args) {

        BookDto bd = new BookDto();

        System.out.print(bd.getTitle() + ", ");
        System.out.print(bd.getPublisher() + ", ");
        System.out.print(bd.getAuthor() + ", ");
        System.out.print(bd.getPrice() + ", ");
        System.out.print(bd.getDiscountRate());

        System.out.println();
        BookDto bd2 = new BookDto("자바의 정석", "도우출판", "남궁성");
        System.out.print(bd2.getTitle() + ", ");
        System.out.print(bd2.getPublisher() + ", ");
        System.out.print(bd2.getAuthor() + ", ");
        System.out.print(bd2.getPrice() + ", ");
        System.out.print(bd2.getDiscountRate());

        System.out.println();
        BookDto bd3 = new BookDto("홍길동전", "활빈당", "허균", 5000000, 0.5);
        System.out.print(bd3.getTitle() + ", ");
        System.out.print(bd3.getPublisher() + ", ");
        System.out.print(bd3.getAuthor() + ", ");
        System.out.print(bd3.getPrice() + ", ");
        System.out.print(bd3.getDiscountRate());

    }
}
