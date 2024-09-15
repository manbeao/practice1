package com.ohgiraffers.section01;

public class dog2 extends Animal {
    @Override
    public void stay(String dog){
        System.out.println(dog + "이(는) 소파에서 뛰어 내려옵니다");
    }

    @Override
    public void eat(String dog,String food){
        System.out.println(dog + "은(는)" + food+"(을)를 맛있게 먹습니다");
    }

    @Override
    public void leash(String dog, String leash){
        System.out.println(dog + " 에게 " + leash+"색 목줄을 채웠습니다");
    }

    @Override
    public void start(String dog){
        System.out.println(dog + "은(는) 신나게 걸어갑니다");
    }

    public void shake(String dog){
        System.out.println(dog + "(은)는 꼬리를 세차게 흔듭니다");
    }

    @Override
    public void stop(String dog){
        System.out.println(dog+ "(은)는 빨리 가자고 목줄을 잡아당깁니다");
    }
}
