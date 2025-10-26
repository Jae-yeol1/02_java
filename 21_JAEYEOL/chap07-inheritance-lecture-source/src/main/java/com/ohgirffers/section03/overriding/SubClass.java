package com.ohgirffers.section03.overriding;

public class SubClass extends SuperClass {
    /*- 오버라이딩 성립 조건
    1. 메소드명 동일
    2. 메소드 리턴타입 동일
    3. 매개변수의 타입, 개수, 순서가 동일
    4. 부모 클래스의 private 메소드는 오버라이딩 불가능
    5. 부모 클래스의 final 키워드가 사용된 메소드는 오버라이딩 불가능
    6. 접근제어자는 부모 메소드와 같거나 더 넓은 범위여야 함
    7. 예외처리는 같은 예외이거나 더 구체적(하위)인 예외를 처리해야 함*/

    @Override
    public void method(int num) {}

    /*pirvate , fianl 메소드는 오버라이딩이 불가하다*/

    /*protected --> default 로 변경 : 보다 좁은 범위로 변경하는 것은 불가능*/
    @Override
    // void protectedMethod(){} 디폴트 접근제한자
    /*protected --> 에서  public 으로 변경 : 보다 넓은 범위로 변경하는 것은 가능! */
    public void protectedMethod(){}
}
