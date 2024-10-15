# practice1
<p>다형성을 이용한 프로그래밍 연습</p>
<h3>프로그램 개요</h3>

<h4>강아지와 산책을 하는 프로그램</h4>
<h4>사용자에게 강아지 두마리의 이름을 입력받아 동시에 산책을 시키는 프로그램이다</h4>
<br>
<h3>시스템 요구사항</h3>
<p>1. 나는 간식 주기, 목줄 채우기, 집에서 출발하기, 산책시키기, 산책멈추기, 집으로 가기를 할 수 있다.</p>
<p>2. 강아지는 간식 먹기, 목줄 채우기, 집에서 출발하기, 산책하기, 산책멈추기, 집으로 가기를 할 수 있다.</p>

--현재 구현 중--
<p>3. 강아지는 처음에 앉아서 기다리고 있다.</p>
<p>4. 나는 강아지에게 간식을준다. 한번 간식을 준 상태라면 건강을 위해 더 이상 주지 않는다</p>
<p>5. 내가 간식을 준 상태에서 목줄을 채우면 강아지는 가만히 있고, 간식을 주지 않은 상태라면 고집을 부리며 목줄을 차지 않는다.</p>
<p>6. 목줄을 채운 상태라면 집에서 출발 할수있고, 목줄을 채우지 않았으면 위험하기 때문에 집에서 나갈수 없다. </p>
<p>7. 집에서 출발하지 않았으면 산책을 하는게 불가능하다. </p>
<p>8. 산책을 하던 중 멈추면 강아지는 앉아서 기다린다. 집으로 가거나 다시 산책을 재개하기 전까지 강아지는 일어나지 않는다</p>
<p>9. 강아지가 산책을 하는 중에는 집에 갈수없다 </p>
<p></p>


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

        //6. 강아지는 집으로 간다
        /*강아지 1은 안겨서 집으로 돌아간다 / 강아지 2는 신난 발걸음으로 집으로 돌아간다*/

        //7. 프로그램을 종료한다

        //8. 프로그램을 다시 시작한다
