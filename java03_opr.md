# 전역변수/지역변수, 연산자

> ```java
> public class OprTest{
>  //field : 속성
>  //전역변수를 작성하는 방식
>  
>  public static int I;
>  //I라는 변수를 전역변수로 만들어준다.
>  public static final int TEN = 10;
>  //TEN이라는 변수는 상수(final).
>  
>  public static void main(String args[]){
>      //지역변수 작성하는 방식
>      int I = 3;
>  }
> }
> ```
>
> - field : 
>
>   | 변수         | 생성시기                              | 소멸 시기            | 저장 메모리 | 사용방법              |
>   | ------------ | ------------------------------------- | -------------------- | ----------- | --------------------- |
>   | 클래스변수   | 클래스가 메모리에 올라갈 때           | 프로그램이 종료될 때 | 메소드 영역 | 클래스이름.변수이름   |
>   | 인스턴스변수 | 인스턴스가 생성될 때                  | 인스턴스가 소멸할 때 | 힙 영역     | 인스턴스이름.변수이름 |
>   | 지역 변수    | 블록 내에서 변수의 선언문이 실행될 때 | 블록을 벗어날 때     | 스택 영역   | 변수이름              |
>
>   
>
> - 전역변수 : main method외에 class 안에서 작성을 해주는 방식으로
>
>   ​				class전역에서 사용할 수 있는 변수를 의미한다.
>
> - 지역변수 :  하나의 method안에서만 사용이 가능한 변수로 method를 벗어날 경우에
>
>   ​				사용을 할 수 없다.
>
>  
>
>  ```java
> public class OprTest{
>     //I라는 변수 선언
>     public static int I;
>     //TEN이라는 상수(변하지 않는 수) 전역변수로 선언
>     public static final int TEN = 10;	
>     public static void main(String[] args){
>         //지역변수로 선언.
>         int I = 3;
>         
>         System.out.println(op01(TEN, I));
>         System.out.println(op02());
>         op03(TEN, 5);
>         op04();
>         op05();
>     }
>     public static String op01(int a, int b){
>         System.out.printf("%d + %d = %d\n", a, b, (a+b));
>         System.out.printf("%d - %d = %d\n", a, b, (a-b));
>         System.out.printf("%d * %d = %d\n", a, b, (a*b));
>         System.out.printf("%d / %d = 몫 : %d, 나머지 : %d\n", a, b,(a/b),(a%b));
>         
>         return "사칙연산 끝! \n";
>         /*
>         	파라미터 int a와 int b를 받는 method이다.
>         	main method드에서 ()안에 TEN과 I를 넣어줌으로써 op01 method에 넘어왔다.
>         */
>     }
>     public static String op02(){
>         //대입연산자 ( +=, -=, *=, /=, %= )
>         //res += 10 이라는 뜻은 res = res + 10 이라는 뜻과 같다.
>         
>         int res=0;
>         System.out.println("res = " + res );
>         //0출력
>         
>         res = res + 10;
>         System.out.println("res = " + res );
>         //10출력
>         
>         res += 10;
>         System.out.println("res = " + res);
>         //20출력
>         
>         res -= 10;
>         System.out.println("res = "+ res);
>         //10출력
>     }
>     
>     public static void op03(int a, int b){
>         //증감연산자( ++, -- )
>         //전위연산자 : 연산자를 변수 앞에 붙여서 연산을 먼저하고 값을 리턴한다.
>         //후위연산자 : 연산자를 변수 뒤에 붙여서 값을 리턴한 후에 연산을 한다.
>         
>         System.out.println(a);
>         //main method에서 아규먼트로 TEN과 5를 받아왔다.
>         //그래서 a는 10이되었고, b는 5가 되었다.
>         //10출력
>         
>         System.out.println(a++);
>         //값을 먼저 리턴하여 출력값은 10이지만 내부적으로는 11로 바뀌었다.
>         
>         System.out.println(--b);
>         //5에서 전위연산자이기 때문에 --를 먼저 실행해주고, 값을 리턴하기 때문에
>         //4출력
>         
>         System.out.println(--a + b++);
>         //위에서 내부적으로 바뀐 11에서 --를 먼저했기 때문에 a는 연산을 먼저한 10이
>         //출력이 되고, 4가 된 b에서 연산을 나중에 하기 때문에 내부적으로는 5로 변했지만
>         //출력은 4가 된다. 10+4 = 14.
>         //14출력
>     }
>     public static void op04(){
>         //논리연산자. && ||
>         
>         System.out.println(true && true);
> 		System.out.println(true && false);
> 		System.out.println(false && true);
>         // 앞에가 false면 뒤에가 무조건 true이기 때문에 계산 안한다.
> 		System.out.println(false && false);
> 
> 		System.out.println("-------------------------");
> 
> 		System.out.println(true || true);
>         // 앞이 참이면 뒤에가 뭐가됐든 참이 될 것이니까 뒤에는 dead code.
> 		System.out.println(true || false);
> 		System.out.println(false || true);
> 		System.out.println(false || false);
>     }
>     public static void op05(){
>         //삼항연산자
>         //(조건) ? 참 : 거짓
>         
>         int a = 5;
>         int b = 9;
>         int i = (a > b) ? a-b : b-a;
>         //a가 b보다 크다는게 참이라면 a-b를 실행해주고, 거짓이라면 b-a를 실행해라.
>         //a > b는 거짓이기 때문에 b-a를 실행해서
>         //4출력
>         System.out.println(i);
>     }
> }
>  ```
>
> **[ 비교연산자 ]**
>
>  비교연산자에는 **>, <, <=, >=, ==, !=** 이 있다.
>
> 우리가 알고있듯 **>과 <** 는 크다 작다, **>=, <=**는 크거나 같고, 작거나 같다 라는 의미다.
>
> **==**은 두 값을 비교하는 연산자이고 **!=** 는 같지 않다면 이라는 뜻을 가진다.
>
>  
>
> ---------------
>
> # 예제
>
>
> 		 * 1. 다음 class diagram을 보고 class를 작성하자.
> 		 * 
> 		 * 2.basketSetting 메서드에서는 String name과 int fruit라는 parameter가 있는데
> 		 * name의 값을 전역변수 fruitName에 대입하고
> 		 * fruit의 값을 fruitCount에 대입하자.
> 		 * 
> 		 *  그 후, basketPrn();메스드를 호출하자.
> 		 *  
> 		 *  3.basketPrn 에서는
> 		 *  "바구니 안의 과일 : xx" 를 풀력하고
> 		 *  basketSize의 값이 fruitCount 값보다 더 크거나 같으면,
> 		 *  "xx의 갯수는 n개 입니다."(과일 이름, 과일 숫자)
> 		 *  작으면
> 		 *  "바구니가 넘쳤습니다."
> 		 *  출력하자.
> 		 *  삼항연산자를 사용하자.
>
>  ```java
> public class FruitBasket{
>     static int basketSize;
>     int fruitCount;
>     String fruitName;
>     
>     public void basketSetting(String name, int fruit){
>         fruitName = name;
>         fruitCount = fruit;
>         basketPrn();
>     }
>     
>     private void basketPrn(){
>         System.out.println("바구나 안의 과일 : " + fruitName);
>         System.out.println(basketSize >= fruitCount ? fruitName+
>                            "의 갯수는"+fruitCount+"개 입니다." : "바구니가 넘쳤습니다.");
>     }
> }
>  ```
>
> ```java
> public class MTest{
>     public static void main(String[] args){
>         //fruitBasket class의 basketSize를 20으로 선언한다.
>         FruitBasket.basketSize = 20;
>         //non-static이라서 생성자를 호출해준다.
>         FruitBasket.bananaBasket = new FruitBasket();
>  		//그리고 bananaBasket의 basketSetting에 아규먼트 바나나, 10을 넣어준다,
>         //이를 호출하면 FruitBasket class에 있는 basketSetting의 메소드가 실행되어
>         //출력된다.
>         bananaBasket.basketSetting("바나나", 10);
>         System.out.println(bananaBasket.basketSize);
> 		System.out.println(bananaBasket.fruitCount);
> 		System.out.println(bananaBasket.fruitName);
>         //바구니 안에 과일 : 바나나
> 		//바나나 의 갯수는  10 개 입니다. 
> 		//20
> 		//10
> 		//바나나
>         
>         FruitBasket appleBasket = new FruitBasket();
> 		appleBasket.basketSetting("사과", 22);
> 		System.out.println(appleBasket.basketSize);
> 		System.out.println(appleBasket.fruitCount);
> 		System.out.println(appleBasket.fruitName);
>         //바구니 안에 과일 : 사과
> 		//바구니가 넘쳤습니다.
> 		//20
> 		//22
> 		//사과
>     }
> }
> ```
>
> 
>
>  
>
>  
>
> 