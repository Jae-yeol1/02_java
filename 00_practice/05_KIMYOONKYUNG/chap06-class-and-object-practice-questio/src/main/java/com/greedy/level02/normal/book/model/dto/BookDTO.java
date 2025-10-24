package com.greedy.level02.normal.book.model.dto;

public class BookDTO {
    private String title;
    private String publisher;
    private String author;
    private int pirce;
    private double discountRate;

    public BookDTO() {
    }

    public BookDTO(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public BookDTO(String title, String publisher, String author, int pirce, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.pirce = pirce;
        this.discountRate = discountRate;
    }




    }
}
