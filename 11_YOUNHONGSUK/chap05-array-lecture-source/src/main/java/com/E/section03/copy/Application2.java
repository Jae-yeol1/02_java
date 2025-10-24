package com.E.section03.copy;

import java.util.Arrays;

public class Application2 {
public static void main(String[] args) {
int [] og = {1,2,3,4,5};

/*deep copy 1번 for loop */
    int[] copy = new int[10];
    for(int i = 0; i < og.length; i++){
        copy[i] = og[i];
    }
print(og);
print(copy);

// object 의 clone 메소드
    int[] copy2 = og.clone();
    print(copy2);

    /*system의 arraycopy 메소드
    * 복사를 시작하는 인덱스와, 어디서 멈출기 설정 가능
    * @param original array, index to start copying, copy array, stopping index*/
    int[] c3 = new int[10];
    System.arraycopy(og, 0, c3, 0, 3);
    print(c3);

    /*Arrays의 copyOf()*/
    int [] c4 = Arrays.copyOf(og, 8);
    print(c4);

}

/*전달 받은 배열의 주소 값, 값을 출력하는 용도의 메소드
* @param arr 배열의 주소값 */
public static void print(int[] arr) {
    System.out.println("arr.hashCode() : " + arr.hashCode());
    System.out.println("arr : " + Arrays.toString(arr));
}

}
