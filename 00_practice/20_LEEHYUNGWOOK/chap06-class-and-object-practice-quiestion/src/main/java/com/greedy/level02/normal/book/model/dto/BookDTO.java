package com.greedy.level02.normal.book.model.dto;

public class BookDTO {
    //필드
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    //생성자
    public BookDTO(){}
    public BookDTO(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }
    public BookDTO(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    // 메소드
    public void printInformation() {
        System.out.print(this.getTitle() + ", ");
        System.out.print(this.getPublisher() + ", ");
        System.out.print(this.getAuthor() + ", ");
        System.out.print(this.getPrice() + ", ");
        System.out.print(this.getDiscountRate());
        System.out.println();
    }
    //setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    //getter

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
