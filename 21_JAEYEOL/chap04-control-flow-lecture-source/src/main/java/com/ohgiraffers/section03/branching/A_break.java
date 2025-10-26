package com.ohgiraffers.section03.branching;

//break 는 가장가까운 반복문을 나갈때

public class A_break {
    public void testSimpleBreakStatement(){
        int sum = 0;

        int i = 1;

        while(true){
            sum += i++;
            /* 중단 조건 걸기 */
            if(i>100) break ;
        }
        System.out.println("sum = " + sum);
    }


    // 구구단



    public void  testSimpleBreakStarement2(){
        for(int dan=1; dan <9; dan ++){
            System.out.println("======"+ dan + "======");
            for(int su = 1; su <= 9; su++){
                if (su > 6) break;
                System.out.println(dan + "*" + su + "=" + (dan*su));
            }
        }
        System.out.println();
    }

}
