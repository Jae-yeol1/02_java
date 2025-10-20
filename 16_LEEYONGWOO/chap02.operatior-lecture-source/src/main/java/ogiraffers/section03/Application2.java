package ogiraffers.section03;

public class Application2 {
    public static void main(String[] args){
        int x=3;
        int y=10;
        /* 1. 1부터 100사이의 값인지 확인 */

        int num1=55;
        System.out.println("1부터 100사이의 값인지 혹인: "+((num1>=1) && (num1<=100)));

        int num2=155;
        System.out.println("1부터 100사이의 값인지 확인 : "+((num2>=1) && (num2<=100)));

        /* 2. 영어 대문자인지 확인 */
        char ch1='G';
        System.out.println("영어 대문자인지 확인:"+((ch1>='A') && (ch1<='Z')));

        char ch4='y';
        System.out.println("영어 대문자인지 확인:"+((ch4>='A') && (ch4<='Z')));

        int num11=10;
        int result1=(false && (++num11>0)? num11 : num11);
        System.out.println("result1 : "+result1);

        int num22=10;
        int result2=(true || (++num22>0)? num22 : num22);
        System.out.println("result2 : "+result2);

    }
}
