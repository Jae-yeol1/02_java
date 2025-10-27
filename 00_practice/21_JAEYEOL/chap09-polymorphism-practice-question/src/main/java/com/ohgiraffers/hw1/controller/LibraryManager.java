package com.ohgiraffers.hw1.controller;


import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;

public class LibraryManager {


    // 1. 필드구현
    // -mem : Member // null 로 명시초기화
    /*자바에서 참조 변수는 초기화하지 않으면 기본값인 null 이 자동으로 할당*/
    private Member mem = null;

    // bList : Book[] 배열 만들고 크기 5할당
    private Book[] bList = new Book[5];

    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }


    public LibraryManager() {
    }


    public void insertMember(Member mem) {
        // 전달받은 mem 주소 값을 해당 회원 레퍼런스(mem)에 대입
        this.mem = mem;
    }

    public Member myInfo() {
        // 회원 레퍼런스(mem) 주소 값 리턴
        return this.mem;
    }

    public Book[] selectAll(){
        // 필드 bList 에 저장된 book 객체 배열 전체를 반환합
        return this.bList;
    }


    public Book[] searchBook(String keyword){
        return null;
    }

    public int rentBook(int index){
        return 0;
    }

}
