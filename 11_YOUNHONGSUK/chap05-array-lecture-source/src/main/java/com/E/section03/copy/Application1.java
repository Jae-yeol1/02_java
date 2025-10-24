package com.E.section03.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

/*shallow copy or 얕은 복사
* og array의 주소값을 복사했기 때문에, 값을 변경 시 모두 영향 받는다*/

        int [] og = {1,2,3,4,5};
        int [] copy = og;

        System.out.println(og.hashCode());
        System.out.println(copy.hashCode());

        for(int i : og){
            System.out.println(i);
        }
        System.out.println(Arrays.toString(og));
        System.out.println(Arrays.toString(copy));
        copy [0] = 3;
        System.out.println(copy.hashCode());
        System.out.println(Arrays.toString(og));
        System.out.println(Arrays.toString(copy));

        test(og);
        System.out.println(Arrays.toString(rT()));
    }


    // call by reference
    public static void test(int[] arr){
        System.out.println("arr hashcode(): " + arr.hashCode());
    arr[0] = 1000;
    }

    public static int[] rT() {
        return new int[] {1,2,3,4,5};
    }

}
