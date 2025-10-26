package com.greedy.level02.normal.book.model.dto;

public class BookDTO {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    // 기본 생성자 생성 기본생성자의 역할은 객체를 생성하는  것 . 매개변수가 없는 형태의 생성자

    public BookDTO(){
    }

    //필드 3가지를 초기화
    public BookDTO(String title , String publisher, String author){
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    //모든 필드를 초기화
    public BookDTO(String title , String publisher, String author, int price, double discountRate){
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    // 출력용 메소드
    public void printInformation(){
        System.out.println(this.title + "," +  this.publisher + "," + this.author + "," +this.price+ ","+ this.discountRate);
    }






}
