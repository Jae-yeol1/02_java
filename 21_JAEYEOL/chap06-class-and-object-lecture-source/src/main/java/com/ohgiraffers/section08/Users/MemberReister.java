package com.ohgiraffers.section08.Users;

public class MemberReister {
    public void regist(Member[] members) {
        System.out.println("회원을 등록합니다. ");

        for(int i = 0; i < members.length; i++){
            System.out.println(members[i].getName() + "님을 화원등록에 성공하였습니다");
        }
        if(MemberRepository.store(members)){
            System.out.println("총 "+ members.length + "명의 회원 등록에 성공하였습니다");
        }
    }
}
