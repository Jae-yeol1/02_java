package com.ohgiraffers.section03.dto;

public class Application {

    /* 데이터를 추상화하는 기법을 이해하고 사용 */
    /*
     * DTO (Data Transfer Object) : 계층 간의 데이터 전달 용도로 사용되는 클래스
     * 캡슐화의 원칙에 따라 작성하기는 했으나 캡슐화가 의미 없을 정도로
     * 필드명을 그대로 사용한 setter, getter 메소드로 인해 유지 보수성이 좋지 않음
     * */

    public static void main(String[] args) {

        MemberDTO md =  new MemberDTO();

        md.setNumber(1);
        md.setName("홍길동");
        md.setAge(20);
        md.setGender('남');
        md.setHeight(178.4);
        md.setWeight(72.5);
        md.setActivated(true);

        System.out.println(md.getNumber());
        System.out.println(md.getName());
        System.out.println(md.getAge());
        System.out.println(md.getGender());
        System.out.println(md.getHeight());
        System.out.println(md.getWeight());
        System.out.println(md.isActivated());
    }

    public void testMethod1(MemberDTO md) {
        System.out.println(md.getName());
    }

    public MemberDTO getMemberDTO(MemberDTO md) {
        md.setNumber(2);
        return md;
    }
}
