package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO BasicConstructorBkDTO = new BookDTO();
        BasicConstructorBkDTO.printInformation();

        BookDTO ThreeFieldConstructorBkDTO = new BookDTO();
        ThreeFieldConstructorBkDTO.setTitle("자바의 정석");
        ThreeFieldConstructorBkDTO.setPublisher("도우출판");
        ThreeFieldConstructorBkDTO.setAuthor("남궁성");
        ThreeFieldConstructorBkDTO.printInformation();

        BookDTO AllFieldConstructorBkDTO = new BookDTO();
        AllFieldConstructorBkDTO.setTitle("홍길동전");
        AllFieldConstructorBkDTO.setPublisher("활빈당");
        AllFieldConstructorBkDTO.setAuthor("허균");
        AllFieldConstructorBkDTO.setPrice(5000000);
        AllFieldConstructorBkDTO.setDiscountRate(0.5);
        AllFieldConstructorBkDTO.printInformation();

    }
}
