package com.lhw.section05.parameter;

public class Rectangle {
    //  필드
    private int height;
    private int width;

    // 생성자

    public Rectangle() {}

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    // 메소드
    public void calArea() {
        System.out.println("사각형의 넓이는 "+
                (width * height) + "입니다.");
    }

    public void calRound() {
        System.out.println("둘레의 길이는 " +
                (2*width + 2*height) + "입니다");
    }
}
