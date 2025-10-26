package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {

        /*깊은복사*/
        /*원본배열*/
        int[] origin = {1,2,3,4,5};

        /* 1. for 문으로 복사하기*/
        int[] copy1 = new  int[10];
        int[] copy2 = new  int[10];

        for(int i = 0 ; i < origin.length ; i++){  // 오리진이 가지고 있는 개수만큼 돌리기
            copy1[i] = origin[i];
        }
        System.out.println("===========origin==========");
        print(origin);
        System.out.println("===========copy1==========");
        print(copy1);

        /*2. Object class 의 clone 사용하여
         * 동일한 길ㅇ, 동일한 값을  가진 배열의 복제본이 생성이된다.
         * */
        copy2 = origin.clone();
        System.out.println("===========copy2==========");
        print(copy2);

        /*3. System 의 arraycopy 메소드
        * arraycopy(원본배열, 복사를 시작할 인덱스 , 복사본 배열, 복사를 시작할 인덱스 , 복사할길이)*/
        int[] copy3 = new  int[10];
        System.arraycopy(origin,0,copy3,5,origin.length);
        print(copy3);

        /*4. Arrays 의 copyof 메소드*/
        int[] copy4 = Arrays.copyOf(origin,7); // 힙의 크기
        int[] copy5 = Arrays.copyOf(origin,3);

        System.out.println("===========copy4==========");
        print(copy4);



    }

    /*전달받은 배열의 주소값 , 값을 출력하는 용도의 매소드*/
    public static void print(int[] arr){
        System.out.println("arr.hastCode() :" + arr.hashCode());
        System.out.println("arr" + Arrays.toString(arr));
    }






}
