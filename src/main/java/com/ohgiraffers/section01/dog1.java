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
}
