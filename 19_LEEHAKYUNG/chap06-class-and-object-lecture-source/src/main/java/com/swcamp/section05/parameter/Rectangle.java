package com.swcamp.section05.parameter;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle() {    // 기본 생성자
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void calArea() {
        System.out.println("사각형의 넓이는 " + (this.width * this.height));
    }

    public void calRound() {
        System.out.println("사각형의 둘레는 " + (2 * (this.width + this.height)));
    }

}
