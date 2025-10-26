package com.ohgiraffers.section01.array;

public class Application1 {
    public static void main(String[] args) {
        // 배열의 선언 및 할당부터 진행
        int[] arr = new int[5]; // 배열 선언하고 5개 선언 빈값으로 array에 빈값 선언 불가능
       //  System.out.println(arr)주소값 출력

        /*하나의 이름으로 관리되는 연속된 메모리 공간임, 해당 공간에 접근시에는 인덱스를 사용한다*/
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5; // 방을 5개 만들것이고 각 방을 찾아갈때 값은 index 부터 시작해서 0 1 2 3 4  순으로 들어감

        /*인덱스를  반복문으로 처리 가능*/
        // arr.length 쓰면 배열의 공간의갯수를 알 수 있음!
        for(int i = 0, value = 0; i < arr.length; i++){
            arr[i] = value += 10 ;  // 왼쪽 공간의 arr 은 0번째부터 시작 value 값은 순차적으로 10더하기
                                    //arr 0 번째는 10  2번째 value 는 10 + 10 이므로 20
            System.out.println("arr1 +++" + arr[i]);
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("sum + " + sum);


        /*
        향상된 for 문  / 반복을 수행할 배열이 있는만큼만 돌림
        for(한번의 반복문에사 사용될 변수 : 반복을 수행할 배열) {}

        배열 인덱스에 담긴 값을 꺼내 int i 라는 변수로 옮겨 담아서 사용하는맥락이므로
        i변수에 값을 대입하더라도 인덱스의 값은 변하지 않음
        즉 배열 인덱스의 값을 변경하고자 할때는 사용할 수 없다.
        * */
        for(int i : arr ){
            System.out.println("i = "+ i);
            i = 0 ;
        // i 의 갑을 바꿔도 원본값은 유지가 된다 . 읽어오기만 하기때문이다
        }
        for(int i : arr ) {
            System.out.println("i = " + i);
        }

    }
}
