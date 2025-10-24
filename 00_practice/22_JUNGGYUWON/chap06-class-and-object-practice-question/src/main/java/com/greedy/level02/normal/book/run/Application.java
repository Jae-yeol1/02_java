package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {



    public static void main(String[] args) {
        BookDTO dto1 = new BookDTO();

        System.out.println(dto1.getTitle() + " "+ dto1.getPublisher() +" " + dto1.getAuthor() + " " + dto1.getPrice() + " " + dto1.getDiscountRate());

        BookDTO dto2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        System.out.println(dto2.getTitle() + " "+ dto2.getAuthor() +" " + dto2.getPrice() + " " + dto2.getDiscountRate());

        BookDTO dto3 = new BookDTO("홍길동전", "활빈당", "허균",  5000000, 0.5);
        System.out.println(dto3.getTitle() + " "+ dto3.getAuthor() +" " + dto3.getPrice() + " " + dto3.getDiscountRate());


    }
}
