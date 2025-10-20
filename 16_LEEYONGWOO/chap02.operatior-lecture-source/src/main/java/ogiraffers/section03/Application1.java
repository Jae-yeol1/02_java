package ogiraffers.section03;

public class Application1 {
    public static void main(String[] args){
        System.out.println("true의 논리 not 연산: "+(!true));
        System.out.println("false의 논리 not 연산: " +(!false));

        // 논리식에 논리연산자 활용
        int num1=10;
        int num2=20;
        int num3=30;
        int num4=40;
        System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인: "+((num1 < num2) && (num3 < num4)));
        System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인: "+((num1 < num2) || (num3 < num4)));

    }
}
