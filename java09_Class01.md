# Class

> ```java
> public class AAA{
>     //field(전역변수)
>     //해당 속성은 필드로 하나하나의 각자 속성을 지닌다.
>     private int abc;
>     //모든 것에 같은 속성을 가지고 있을 때 static 변수로 선언해준다.
>     public static String def = "test";
>     
>     //instance var : 실제 객체 하나하나에 적용되는 nonstatic
>     //class var : 해당 clss 전체에 적용되는 static변수
>     
>     //기본생성자
>     public AAA(){
>         //super(); 이 생략되어있다. (object상속)
>     }
>     public AAA(int abc){
>         System.out.println("AAA생성(abc받아서 생성)");
>         
>         this.abc = abc;
>     }
>     
>     //해당기능은 메소드로 getAbc를 호출하면 전역변수 abc를 리턴한다.
>     public int getAbc(){
>         return abc;
>     }
>     
>     //호출하면 파라미터로 전달된 abc값을 필드 abc대입.
>     public void setAbc(int abc){
>         this.abc = abc;
>     }
>     public void prn(){
>         System.out.println("AAA의 prn 메소드");
>     }
> }
> ```
>
> **[ 생성자 ]**
>
> 1.클래스의 이름과 동일하되, 리턴타입은 없고, 객체 생성시 접근제한자는 public.
>
> 2.생성자는 객체 생성을 하는 new 연산자와 함께 사용되며 생성시 단 한번만 자동 호출된다.
>
> 3.생성자는 메소드처럼 객체 및 클래스명으로 호출할 수 없다.
>
> 4.overload할 수 있다.
>
> 5.생성자를 명시하지 않으면 기본 생성자가 제공되어 필드를 초기화하고 생성자를 명시하면 명시한
>
> 생성자만 호출되고 기본 생성자는 제공되지 않는다.
>
> 6.생성자는 상속되지 않는다.
>
> 7.생성자는 내부 호출할 수 있다.
>
> 8.생성자의 목적 : 객체생성, 필드초기화
>
>  ```java
> public class BBB extends AAA {
>     //BBB라는 class는 AAA라는 클래스는 상속받는다.
>     private int b;
>     //BBB라는 class 내에서만 사용할 수 있다.
>     
>     public BBB(){
>         //super(); 는 생략되어있는 명령어.
>         System.out.println("BBB생성");
>     }
>     public BBB(int b){
>         this.b = b;
>         System.out.println("BBB생성(b를 받아서 생성)");
>     }
>     public BBB(int abc, int b){
>         super(int abc);
>         this.b = b;
>         System.out.println("BBB생성(abc, b를 받아서 생성)");
>     }
>     
>     //getter & setter
>     public int getB(){
>         return b;
>     }
>     public void setB(int b){
>         this.b = b;
>     }
>     public int getSum() {
> 		//super을 붙이지 않아도 가져다 쓸 수 있음.
> 		int sum = super.getAbc() + this.getB();
> 		
> 		return sum;
> 	}
> 	public void prn() {
> 		System.out.println("BBB의 prn 메소드!!!!!!!!!!!!!!!!!!!!!!!");
> 	}
> }
>  ```
>
> ```java
> public class MTest {
> 	
> 	public static void main(String[] args) {
> 		//생성자()안에 아무것도 없으면 기본생성자
>         //객체를 생성해준다.
> 		AAA aaa = new AAA();
>         //생성해준 객체의 prn을 호출한다.
> 		aaa.prn();
> 		
> 		System.out.println("-------------------------");
> 		//()안에 아규먼트를 입력하여 AAA라는 메소드에 100을 넘겨준다.
> 		AAA aaa01 = new AAA(100);
>         //얘는 기본생성자라 값을 아무것도 받지 못하여 0이 출력되고
> 		System.out.println(aaa.getAbc());
>         //파라미터 하나를 받는 메소드를 호출해왔기 때문에 100을 입력할 수 있어서 100출력
> 		System.out.println(aaa01.getAbc());
> 		
> 		System.out.println("-------------------------");
> 		
> 		BBB b01 = new BBB();
> 		b01.setAbc(10);
> 		b01.setB(20);
> 		System.out.println(b01.getSum());
> 		
> 		System.out.println("-------------------------");
> 		
> 		BBB b02 = new BBB(30);
> 		b02.setAbc(40);
> 		System.out.println(b02.getSum());
> 		
> 		System.out.println("-------------------------");
> 		
> 		BBB b03 = new BBB(50,60);
> 		System.out.println(b03.getSum());
> 		
> 		System.out.println("-------------------------");
> 		
> 		AAA a1 = new AAA();
> 		//자식클래스를 부모클래스에 담을 수 있음. 부모 > 자식 으로 저장가능. object가 제일음. 모든 클래스를 상속이니까.
> 		AAA a2 = new BBB();
> 		a1.prn();
> 		a2.prn();
> 		
> 		System.out.println("-------------------------");
> 		
> 		// BBB b = new AAA(); <- 안됌. 이 뜻은 부모클래스에 자식클래스를 담을 수 없음. 그래서 오류.
> ```
>
> 
>
>  
>
>  
>
>  
>
> 