package com.E.section04;

public class Application1 {
    public static void main(String[] args) {
        int inum1 = 10;
        int inum2 = 20;

        System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2));
        System.out.println("inum1과 inum2가 같지 않은지 비교 : " + (inum1 != inum2));
        System.out.println("inum1이 inum2보다 큰지 비교 : " + (inum1 > inum2));
        System.out.println("inum1이 inum2보다 크거나 같은지 비교 : " + (inum1 >= inum2));
        System.out.println("inum1이 inum2보다 작은지 비교 : " + (inum1 < inum2));
        System.out.println("inum1이 inum2보다 작은거나 같은지 비교 : " + (inum1 <= inum2));

        /* ==과 !=은 비교 가능하지만 대소비교는 불가능하다. */
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("============== 논리값 비교 ===============");
        System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2));
        System.out.println("bool1과 bool2가 같지 않은지 비교 : " + (bool1 != bool2));
//System.out.println("bool1이 bool2보다 큰지 비교 : " + (bool1 > bool2));
//System.out.println("bool1이 bool2보다 크거나 같은지 비교 : " + (bool1 >= bool2));
//System.out.println("bool1이 bool2보다 작은지 비교 : " + (bool1 < bool2));
//System.out.println("bool1이 bool2보다 작은거나 같은지 비교 : " + (bool1 <= bool2));

    }

}
