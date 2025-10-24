package com.ohgiraffers.section01.level02.normal;

public class Application4 {

    public static void main(String[] args) {
//7개 1~45
        int num=0;
        int[] nums=new int[7];

        while(true){
            boolean is_i=false;

            int a=(int)(Math.random()*45)+1;

            for(int i=0; i<nums.length; i++)
                if(nums[i]==a){
                    is_i=true;
                    break;
            }
            if(is_i){
                continue;
            }else{
                nums[num]=a;
                num++;
                if(num==7){
                    break;
                }
            }
        }

        for(int i:nums){
            System.out.print(i+" ");
        }

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */
    }
}
