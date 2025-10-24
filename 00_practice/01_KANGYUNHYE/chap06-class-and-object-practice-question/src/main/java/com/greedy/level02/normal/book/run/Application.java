package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

import java.awt.print.Book;

public class Application {
    public static void main(String[] args) {

        BookDTO bookDTO = new BookDTO();
        System.out.println(bookDTO.getTitle() + ", " + bookDTO.getPublisher() + ", " + bookDTO.getAuthor() + ", " + bookDTO.getPrice() + ", " + bookDTO.getDiscountRate());

        BookDTO bookDTO1 = new BookDTO("자바의 정석","도우출판","남궁성");
        System.out.println(bookDTO1.getTitle() + ", " + bookDTO1.getPublisher() + ", " + bookDTO1.getAuthor() + ", " + bookDTO1.getPrice() + ", " + bookDTO1.getDiscountRate());

        BookDTO bookDTO2 = new BookDTO("홍길동전","활빈당","허균",5000000,0.5);
        System.out.println(bookDTO2.getTitle() + ", " + bookDTO2.getPublisher() + ", " + bookDTO2.getAuthor() + ", " + bookDTO2.getPrice() + ", " + bookDTO2.getDiscountRate());


    }
}
