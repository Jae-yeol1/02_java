package com.E.section01.array;

public class Application1 {

    public static void main(String[] args) {
        int [] arr = new int[5];
        System.out.println(arr);
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        int j = arr.length;

        for(int i = 0, value = 0; i < arr.length; i++){
            arr[i] = value += 10;
            System.out.println(arr[i]);
        }

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum+= arr[i];
        }
        System.out.println(sum);

        // for each loop는 배열안의 값을 복사해서 꺼내올 뿐, 원본값의 변경은 불가능하다
        for (int i : arr){
            if(i == Math.random()*10+1){
                System.out.println("it's a miracle");
            }
            else System.out.println("man fuck this shit");
        }
    }


}
