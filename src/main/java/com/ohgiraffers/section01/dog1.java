package com.ohgiraffers.section01;

public class dog1 extends Animal{
    @Override
    public void stay(String dog){
        System.out.println(dog + "이(는) 현관문을 애타게 바라봅니다");
    }

    @Override
    public void eat(String dog,String food){
        System.out.println(dog + "은(는)" + food+"(을)를 맛있게 먹습니다");
    }

    @Override
    public void leash(String dog, String leash){
        System.out.println(dog + "에게 " + leash+"색 목줄을 채웠습니다");
    }

    @Override
    public void start(String dog){
        System.out.println(dog + "은(는) 신나게 걸어갑니다");
    }

    public void small(String dog){
        System.out.println(dog + "(은)는 킁킁거리며 냄새를 맡습니다");
    }

    @Override
    public void stop(String dog){
        System.out.println(dog + "(은)는 얌전히 앉아서 기다립니다");
    }
}
