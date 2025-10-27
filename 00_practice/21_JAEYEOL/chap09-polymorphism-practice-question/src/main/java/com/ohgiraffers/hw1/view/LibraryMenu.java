package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        System.out.println("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.println("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.println("성별을 입력하세요: ");
        char gender = sc.next().charAt(0);

        Member newmember = new Member(name, age, gender);
        lm.insertMember(newmember);

        String menuStr = """
                ==== 메뉴 ====
                1. 마이페이지
                2. 도서 전체 조회
                3. 도서 검색
                4. 도서 대여하기
                0. 프로그램 종료하기
                """;

        while (true) {
            System.out.println(menuStr);
            System.out.print("메뉴 선택 : ");
            int choice = sc.nextInt();
            sc.nextLine(); // 버퍼 제거

            switch (choice) {
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                case 1:
                    System.out.println(lm.myInfo());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
            }
        }
    }

    public void selectAll() {
        Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번도서 : " + bList[i]);
        }
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();

        Book[] searchList = lm.searchBook(keyword);

        for (Book book : searchList) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public void rentBook() {
        selectAll();

        System.out.print("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();
        sc.nextLine();

        int result = lm.rentBook(index);

        if (result == 0) {
            System.out.println("성공적으로 대여되었습니다.");
        } else if (result == 1) {
            System.out.println("나이 제한으로 대여 불가능입니다.");
        } else if (result == 2) {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.");
            System.out.println("마이페이지를 통해 확인하세요.");
        }
    }
}
