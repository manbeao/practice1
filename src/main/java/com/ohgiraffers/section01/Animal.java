package com.ohgiraffers.section01;

import java.util.Scanner;

public class Animal {

    public Animal(){}
    //기본 생성자

    public void stay(String dog){
        System.out.println("강아지들은 산책 시간을 기다리고 있습니다");
    }

    public void eat(String dog, String food){

        System.out.println("강아지들에게 간식을 줍니다");
    }
    public void leash(String dog, String leash){

        System.out.println("강아지들에게 목줄을 채웁니다");
    }

    public void start(String dog){

        System.out.println("강아지들은 신나게 뛰어갑니다");
    }

    public void stop(String dog){
        System.out.println("강아지들은 멈춰서 기다립니다");
    }

    public void go(String dog){
        System.out.println("강아지는 다음 산책을 기약하며 집으로 돌아갑니다");
    }

    public void ture(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=========강아지 산책 시키기=========");
        System.out.println();
        System.out.print("첫번째 강아지의 이름을 입력하세요 : ");
        String fristDog = sc.next();
        System.out.print("두번째 강아지의 이름을 입력하세요 : ");
        String secondDog = sc.next();
        Animal animal = new Animal();
        System.out.println();
        Dog Dog = new Dog();
        Dog.stay(fristDog);
        Dog2 dog2 = new Dog2();
        dog2.stay(secondDog);
    }

    public void step1(){{
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("=========강아지 산책 시키기=========");
        System.out.println();
        System.out.println("         1. 간식주기");
        System.out.println("         2. 목줄 채우기");
        System.out.println("         3. 출발하기");
        System.out.println("         4. 산책하기");
        System.out.println("         5. 산책 멈추기");
        System.out.println("         6. 집에 가기 ");
        System.out.println("         7. 프로그램 종료하기 ");
        System.out.println("         8. 프로그램 다시 시작하기 ");
        System.out.println();
        System.out.print("번호를 입력하세요 : ");
        int num = sc.nextInt();}
    }
}
