# if, switch

>  조건문 중 하나인 if문을 알아보자.
>
> if문은 조건을 주고 참이면 명령, 그렇지 않으면 명령 구조로 이루어져 있다.
>
> ```java
> if(조건){
>     //명령문1
> } else if(조건) {
>     //명령문2
> } else{
>     //명령문3
> }
> ```
>
> 구조로 이루어져 있다.
>
> if문 처음에는 조건이 들어간다 그 조건이 참이라면 명령문1을 실행시킨다.
>
> 하지만 그렇지 않고 만약 ~라면 의 의미가 else if라는 명령어다.
>
> else if()안에도 조건이 들어간다. 첫번째 if문이 조건이 참이 아닐 경우 else if에서 조건을 검사한다.
>
> 만약 조건이 참이라면 명령문2를 실행시킨다.
>
> 하지만 위의 두개의 조건이 둘다 거짓일 경우 else의 명령문3을 실행시킨다.
>
> else의 뜻은 참이 없을때, 거짓일 때를 의미한다.
>
>  ```java
> int i = 10;
> int j = 20;
> 
> if(i > j) {
>     System.out.println("i가 j보다 큽니다.")
> } else{
>     System.out.println("i가 j보다 작습니다.")
> }
> //i는 10, j는 20이다.
> //첫번째 if문은 거짓이기때문에 실행시키지 않는다.
> //그래서 else부분이 실행된다.
> 
> if(i > j) {
>     System.out.println("i가 j보다 큽니다.");
> } else if(i == j){
>     System.out.println("i와 j는 같습니다.");
> } else if(i < j) {
>     System.out.println("i는 j보다 작습니다.");
> }
> //첫번째 if문을 보았을 때 조건이 맞지 않자 else if 그렇지않고 ~라면 으로 넘어온다.
> //두번째도 참이 되지 않으면 또 다시 밑의 else if로 넘어간다.
> //그제서야 참이 나와 마지막 if문을 실행시켜준다.
> 
> if (i > j) {
> 	System.out.println("i가 j보다 큽니다.");
> } else if (i == j) {
> 	System.out.println("i와 j가 같습니다.");
> } else {
> 	System.out.println("i가 j보다 작습니다.");
> }
> //첫번째와 두번째는 거짓이다. 위의 조건문들 중에 참이 없이 때문에 else문 안의 명령문이 실행된다.
>  ```
>
> 
>
>  **if문에는 다중포문으로 사용할 수 있다.**
>
>  ```java
> // boolean의 값은 이미 true와 false가 정해져있어서 바로 조건에 들어갈 수 있다.
> if (ring) {
> 	if (married) {
> 		System.out.println("결혼하셨군요!");
> 	} else {
> 		System.out.println("연인이 있으신군요!");
> 	}
> } else {
> 	if (married) {
> 		System.out.println("결혼반지 어디...?");
> 	} else {
> 		System.out.println("솔로..?");
> 	}
> }
> if (ring && married) {
> 	System.out.println("결혼하셨군요!");
> } else if (ring || married) {
> 	System.out.println("연인이 있으시군요!");
> } else {
> 	System.out.println("솔로시군요....ㅜ^ㅜ");
> 	}
> }
>  ```
>
> ```java
> 	public static void main(String[] args) {
> 		prn02(true, false); //ring과 married 값을 입력.
> 	}
> 
> ```
>
> 메인 메소드에서 아규먼트로 true와 false값을 입력했다.
>
>  
>
> 이런식으로 다중if문을 사용할 수 있다.
>
> 
>
> ------------
>
> ### switch
>
>  switch문의 사용법을 알아보자
>
> ```java
> switch(값){
>     case 값 : 
>         //명령문
>     case 값 : 
>         //명령문
>     default : 
>         //명령문
> }
> ```
>
> 위와 같은 방식으로 사용이 된다.
>
> ```java
> int i = 2;
> 
> switch(i){
>     case 1 :
>         System.out.println("1");
>         break;
>     case 2 :
>         System.out.println("2");
>         break;
>     case 3 :
>         System.out.println("3");
>         break;
>     default : 
>         System.out.println("다른 숫자입니다.");
>         break;
> }
> ```
>
> switch의 괄호 값으로 i가 들어갔다.
>
> 값이 들어갔다는 의미이다.
>
> **case 1:** 라는 뜻은 switch안에 들어간 값이 1일 경우에 명령을 실행한다는 의미이다.
>
> **break**는 만일 i의 값이 1이라서 명령문을 실행했다면 그 후의 case들을 실행하지 않겠다는 의미이다.
>
> **default :** if문에서 else같은 명령어다.
>
> 위의 조건들이 하나도 들어맞지 않는다면 default를 실행해준다.
>
>  
>
>  **switch의 값으로는 숫자형 뿐 아니라 문자형도 들어갈 수 있다.**