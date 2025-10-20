package com.E.section05.typecasting;

public class Application2 {
    public static void main (String[] args){

        //의도하지 않은 값손실
        // long에는 들어가는 값이 int범위 밖이라 데이터 범위 밖의 값들은 버려짐
        long l = 80000000000L;
        int i = (int) l;
        System.out.println(i);

        //의도한 값손실
        float avg = 31.235f;
        int floorNum = (int) avg;
        System.out.println("floorNum = " + floorNum);
    }

}
