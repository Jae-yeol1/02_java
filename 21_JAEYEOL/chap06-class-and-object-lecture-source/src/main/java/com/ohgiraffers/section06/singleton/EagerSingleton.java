package com.ohgiraffers.section06.singleton;

public class EagerSingleton {
        // 접근 제한자가 private 외부에서 접근 x
        private static EagerSingleton eager = new EagerSingleton();

        // 외부에서 주소값 가지고 쓸수없다.
        private EagerSingleton() {}
    public static EagerSingleton getInstance(){
            return eager;
    }


}
