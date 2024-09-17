package com.ohgiraffers.section01;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /*필기.
        * 프로그램 개요
         * 강아지 두마리와 산책을 하는 프로그램
         * 사용자에게 강아지 두마리의 이름을 입력받아 동시에 산책을 시키는 프로그램이다
         *
         *
         * 시스템 요구사항
         * 1. 나는 간식 주기, 목줄 채우기, 집에서 출발하기, 산책시키기, 산책멈추기, 집으로 가기를 할 수 있다.
         * 2. 강아지는 간식 먹기, 목줄 채우기, 집에서 출발하기, 산책하기, 산책멈추기, 집으로 가기를 할 수 있다.
         * 3. 강아지는 처음에 앉아서 기다리고 있다.
         * 4. 나는 강아지에게 간식을준다. 한번 간식을 준 상태라면 건강을 위해 더 이상 주지 않는다
         * 5. 내가 간식을 준 상태에서 목줄을 채우면 강아지는 가만히 있고, 간식을 주지 않은 상태라면 고집을 부리며 목줄을 차지 않는다.
         * 6. 목줄을 채운 상태라면 집에서 출발 할수있고, 목줄을 채우지 않았으면 위험하기 때문에 집에서 나갈수 없다.
         * 7. 집에서 출발하지 않았으면 산책을 하는게 불가능하다.
         * 8. 산책을 하던 중 멈추면 강아지는 앉아서 기다린다. 집으로 가거나 다시 산책을 재개하기 전까지 강아지는 일어나지 않는다
         * 9. 강아지가 산책을 하는 중에는 집에 갈수없다
         * */

        /* 객체간 상호작용
         * -내가 수신할수있는 메세지(내가 해야하는 일 )
         * 1. 간식을 줘라
         * 2. 목줄을 채워라
         * 3. 집에서 출발해라
         * 4. 산책을 시켜라
         * 5. 산책을 멈춰라
         * 6. 집으로 가라
         *
         *
         * - 강아지가 수신할수 있는 메세지 (강아지가 해야하는일)
         * 1. 간식을 먹어라
         * 2. 목줄을 채워라
         * 3. 집에서 출발해라
         * 4. 산책을 해라
         * 5. 앉아서 기다려라
         * 6. 집으로 가라
         * */

        //1. 강아지는 간식을 먹는다
        /*강아지 1은 고구마를 먹는다 / 강아지 2는 개껌을 먹는다*/

        //2. 강아지는 목줄을 찬다
        /*강아지 1은 파란색 목줄을 찬다 / 강아지 2는 초록색 목줄을 찬다*/

        //3. 강아지는 집에서 출발한다
        /*강아지 1은 집에서 출발한다 / 강아지 2는 집에서 출발한다*/

        //4. 강아지는 산책을 한다
        /*강아지 1은 냄새를 맡는다 / 강아지 2는 꼬리를 흔든다*/

        //5. 강아지는 산책을 멈춘다
        /*강아지 1은 앉아서 기다린다 / 강아지 2는 제자리를 돈다 */

        //6. 강아지는 집에 간다
        /*강아지 1은 안겨서 집에 간다 / 강아지 2는 걸어서 집에 간다*/

        Scanner sc = new Scanner(System.in);
        System.out.println("=========강아지 산책 시키기=========");
        System.out.println();
        System.out.print("첫번째 강아지의 이름을 입력하세요 : ");
        String fristDog = sc.next();
        System.out.print("두번째 강아지의 이름을 입력하세요 : ");
        String secondDog = sc.next();
        Animal animal = new Animal();
        System.out.println();
        dog1 dog1= new dog1();
        dog1.stay(fristDog);
        dog2 dog2 = new dog2();
        dog2.stay(secondDog);
        //산책 기대
        while (true){
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
            System.out.println("         8. 다시 시작하기 ");
            System.out.println();
            System.out.print("번호를 입력하세요 : ");
            int num = sc.nextInt();

            switch (num){
                case 1:
                    System.out.println("=========산책 전에는 간식을 주어야 합니다=========");
                    System.out.println();
                    System.out.print(fristDog +"에게 줄 간식을 입력하세요 : ");
                    String food1 = sc.next();
                    dog1.eat(fristDog,food1);
                    System.out.print(secondDog +"에게 줄 간식을 입력하세요 : ");
                    String food2 = sc.next();
                    dog1.eat(secondDog,food2);
                    break;

                case 2: System.out.println("=========산책 전에는 목줄을 채워야 합니다=========");
                    System.out.println();
                    System.out.print(fristDog + "에게 채울 목줄의 색을 입력하세요 : ");
                    String leash1 = sc.next();
                    dog1.leash(fristDog,leash1);
                    System.out.print(secondDog + "에게 채울 목줄의 색을 입력하세요 : ");
                    String leash2 = sc.next();
                    dog2.leash(secondDog,leash2);
                    break;

                case 3: System.out.println("=========산책을 하러 출발합니다=========");
                    System.out.println();
                    dog1.start(fristDog);
                    dog2.start(secondDog);
                    break;

                    case 4:
                        System.out.println("=========강아지들은 산책을 즐깁나다=========");
                        dog1.small(fristDog);
                        dog2.shake(secondDog);
                        break;

                case 5:
                    System.out.println("=========산책을 멈춥니다=========");
                    dog1.stop(fristDog);
                    dog2.stop(secondDog);
                    break;

                    case 6:
                        System.out.println("=========산책을 마치고 집으로 돌아갑니다=========");
                        dog1.go(fristDog);
                        dog2.go(secondDog);
                        break;

                        case 7:
                            System.out.println("=========프로그램을 종료합니다=========");
                            break;

                            case 8:
                                System.out.println("=========프로그램을 다시 시작합니다=========");
                                break;

                default:
                    System.out.println("잘못된 번호를 입력하셨습니다");
                    break;

            }



if(num==7){
    break;
}
    }
    }

    public void nm1(){

    }

}
