package sec05.logical;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("true와 true의 논리 and 연산 : " + (true && true)); // 1 && 1 1
        System.out.println("true와 false의 논리 and 연산 : " + (true && false)); // 0&& 1 0
        System.out.println("false와 true의 논리 and 연산 : " + (false && true)); // 0 && 1 0
        System.out.println("false와 false의 논리 and 연산 : " + (false && false)); // 0 && 0 0

        System.out.println("true와 true의 논리 or 연산 : " + (true || true)); // 1 || 1 1
        System.out.println("true와 false의 논리 or 연산 : " + (true || false)); // 1 || 0 1
        System.out.println("false와 true의 논리 or 연산 : " + (false || true)); // 1 || 0 1
        System.out.println("false와 false의 논리 or 연산 : " + (false || false)); // 0 || 0 0

        System.out.println("true의 논리 not 연산 : " + (!true)); // !1 = 0
        System.out.println("false의 논리 not 연산 : " + (!false)); // !0 = 1

        // 논리식에 논리연산자 활용
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;

        System.out.println((num1 < num2) && (num3 < num4));
        // num1 < num2 true, num3 < num4 true , true && true = true
        System.out.println((num1 < num2) && (num3 > num4));
        // num1 < num2 true, num3 > num 4 false , true & false = false

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인 : " + (a < b && c < d));
        System.out.println("a가 b보다 작으면서 c가 d보다 큰지 확인 : " + (a < b && c > d));
        System.out.println("a가 b보다 크면서 c가 d보다 작은 확인 : " + (a > b && c < d));
        System.out.println("a가 b보다 크면서 c가 d보다 큰지 확인 : " + (a > b && c > d));

        System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인 : " + (a < b || c < d));
        System.out.println("a가 b보다 작거나 c가 d보다 큰지 확인 : " + (a < b || c > d));
        System.out.println("a가 b보다 크거나 c가 d보다 작은 확인 : " + (a > b || c < d));
        System.out.println("a가 b보다 크거나 c가 d보다 큰지 확인 : " + (a > b || c > d));

        
    }
}
