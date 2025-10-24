package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */

        int index = 0;
        int[] lotto = new int[6];
        while (index < 6) {

            int random = (int)(Math.random() * 45) + 1;
            if(isDuplicate(lotto, random)){
                continue;
            }

            lotto[index++] = random;
        }

        Arrays.sort(lotto);
        for(int i : lotto) {
            System.out.print(i + " ");
        }
    }

//    public static void main(String[] args) {
//
//     /*
//          로또 번호 자동 생성기 프로그램을 작성하세요.
//          단, 중복 값 없이 출력하세요.
//
//          Random 클래스 사용 혹은 Math.random() 메소드를 사용
//       */
//        //1~45
//        int[] lotto = new int[6];
//
//        for(int i = 0; i < 6; i++){
//
//            while(true){
//                boolean flag = false;
//                int n = (int)(Math.random() * 45) + 1;
//
//                for(int j = 0; j <= i; j++){
//                    if(n == lotto[j]){
//                        flag =true;
//                        break;
//                    }
//                }
//
//                if(flag) {
//                    break;
//                } else {
//                    lotto[i] = n;
//                }
//            }
//        }
//        Arrays.sort(lotto);
//        System.out.println(Arrays.toString(lotto));
//    }

    private static boolean isDuplicate(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
