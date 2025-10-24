package com.ogiraffers.section01;

public class AccessTest {
    public static void main(String[] args) {
        PublicMembers pm = new PublicMembers();
        pm.id = "publicUser";
        pm.pwd = "publicPwd";
        pm.age = 28;
        pm.hobby = "reading";
        pm.printInfo();

        PrivateMembers pr = new PrivateMembers("privateUser", "privatePwd", 30, "coding");
        // 직접 접근 불가: pr.id = "x"; // 컴파일 오류 발생
        System.out.println("id via getter: " + pr.getId());
        pr.setAge(31);
        pr.show();
    }
}
