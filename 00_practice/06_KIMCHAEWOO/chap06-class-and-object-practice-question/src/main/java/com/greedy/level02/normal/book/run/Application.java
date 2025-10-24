package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO bookDTO = new BookDTO();
        bookDTO.printInformation();

        BookDTO bookDTO1 = new BookDTO("title1", "publisher1", "author1");
        bookDTO1.printInformation();

        BookDTO bookDTO2 = new BookDTO("title1", "publisher1", "author1", 10000, 20);
        bookDTO1.printInformation();
    }
}
