package com.ohgiraffers.section08.Users;

public class Memberfinder {
    public Member[] findAllMembers() {
        return MemberRepository.findAllMembers();
    }
}
