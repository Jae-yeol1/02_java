package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {

    public static void main(String[] args) {
        BookDTO bookDTO = new BookDTO();
        BookDTO bookDTO1 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        BookDTO bookDTO2 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);

        System.out.print(bookDTO.getTitle() + ", ");
        System.out.print(bookDTO.getPublisher() + ", ");
        System.out.print(bookDTO.getAuthor() + ", ");
        System.out.print(bookDTO.getPrice() + ", ");
        System.out.print(bookDTO.getDiscountRate());
        System.out.println();

        System.out.print(bookDTO1.getTitle() + ", ");
        System.out.print(bookDTO1.getPublisher() + ", ");
        System.out.print(bookDTO1.getAuthor() + ", ");
        System.out.print(bookDTO1.getPrice() + ", ");
        System.out.print(bookDTO1.getDiscountRate());
        System.out.println();

        System.out.print(bookDTO2.getTitle() + ", ");
        System.out.print(bookDTO2.getPublisher() + ", ");
        System.out.print(bookDTO2.getAuthor() + ", ");
        System.out.print(bookDTO2.getPrice() + ", ");
        System.out.print(bookDTO2.getDiscountRate());
        
    }
}
