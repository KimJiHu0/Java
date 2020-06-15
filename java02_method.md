# method

> **method란 프로그램의 주 진입점이라고 한다. ( main method )**
>
> 어떠한 작업을 수행하기 위한 **명령문들의 집합**이다.
>
> 하나의 이름으로 여러 개의 명령을 일괄처리하는 모듈
>
> 
>
> #### 선언방법
>
> 접근제한자 메모리영역 리턴타입 메소드명(파라미터){ 명령문; }
>
> - **접근제한자 :** 어디서 접근을 하는지
>
>   (+)public [ 초록색 동그라미 ] = 어디서나 접근 참조 가능.
>
>   ```java
>   //methodTest01 class내에서 작성.
>   public class methodTest01{
>   	public static void publicTest01(){
>       	System.out.println("static 어디서나 접근 참조 가능");
>   	}
>       public void publicTest02(){
>           System.out.println("non-static 어디서나 접근 참조 가능")
>       }
>       publicTest01();
>       //같은 class 내에서는 메소드명으로만 불러올 수 있다.
>   }
>   ------------------------------------------------------------------------------
>   //어디서든지 가져다 쓸 수 있다.[ 같은 프로젝트 내에서만 ]
>   public class methodTest01Prn{
>   	public static void main(String[] args) {
>   		methodTest01.publicTest01();
>           //클래스명.메소드명();
>           //해당 메소드가 어디에 위치해있는지 먼저 작성하고, 불러올 메소드명을 작성한다.
>           
>           methodTest01 MyNonStatic = new methodTest01();
>           //타입 변수 = 값의 구조와 같다.
>           //class명 변수명 = new class명 / 으로 객체를 생성해준 다음에 불러올 수 있다.
>           MyNonStatic.publicTest01();
>           //변수명.메소드명(); 으로 실행가능.
>   	}
>   }
>   ```
>
>   
>
>   (#)protected [ 노란 다이아 ] = 상속인 경우 상속된 곳에서만, 상속이 아닌 경우 같은 패키지 내에서만 접근, 참조 가능
>
>   ```java
>   public class methodTest01{
>       protected static void protectedTest01(){
>           System.out.println("static");
>           System.out.println("상속인경우 상속된 곳에서만 접근 참조 가능");
>           System.out.println("상속이 아닌 경우 같은 패키지 내에서만 접근 참조 가능");
>       }
>       protected void protectedTest02(){
>           System.out.println("non-static");
>           System.out.println("상속인경우 상속된 곳에서만 접근 참조 가능");
>           System.out.println("상속이 아닌 경우 같은 패키지 내에서만 접근 참조 가능");
>       }
>   }
>   
>   public class methodTest01prn{
>       public static void main(String[] args){
>           //같은 클래스 내에서 불러오기
>           methodTest01.protectedTest01();
>           
>           //다른 클래스에서 불러오기
>           methodTest01 nonstaticprotected = new methodTest01();
>           nonstaticprotected.protectedTest02();
>       }
>   }
>   ```
>
>   
>
>   (~)default [ 파란 삼각형 ] = 같은 패키지 내에서만 접근, 참조 가능
>
>   ```java
>   public class methodTest01{
>       static void defaultTest01(){
>           System.out.println("static 같은 패키지 내에서만 접근 참조 가능");
>       }
>       void defaultTest02(){
>           System.out.println("non-static 같은 패키지 내에서만 접근 참조 가능");
>       }
>   }
>   
>   
>   public class methodTest01prn{
>       public static void main(String[] arg){
>           //static 같은 패키지 내에서 불러올 때
>           methodTest01.defaultTest01();
>           
>           //non-static 같은 패키지 내에서 불러올 때
>           methodTest01 nonstaticdefault = new methodTest01();
>           nonstaticdefault.defaultTest02();
>       }
>   }
>   ```
>
>   
>
>   (-)private [ 빨간 사각형 ] = 같은 클래스 내에서만 접근,참조 가능
>
>   ```java
>   public class methodTest01{
>       static void privateTest01(){
>           System.out.println("static 같은 클래서 내에서만 접근 참조 가능");
>       }
>       private void privateTest02(){
>           System.out.println("non-static 같은 클래스 내에서만 접근 참조 가능");
>       }
>   }
>   
>   
>   public class methodTest01prn{
>       public static void main(String[] arg){
>           //static 같은 패키지 내에서 불러올 때
>           methodTest01.privateTest01();
>           
>           //non-static 같은 패키지 내에서 불러올 때
>           methodTest01 nonstaticprivate = new methodTest01();
>           nonstaticprivate.privateTest02();
>       }
>   }
>   ```
>
>   
>
> - **메모리영역 :** 어디에 저장되는지
>
>   (빨간색s)static = class.methodname 로 바로 실행 가능
>
>   (아무것도 없으면)nonstatic = class(변수) = new class(); 로 객체 생성 후 실행 가능
>
>   ​																		변수.method
>
>   ```java
>   public class staticTest01{
>       public static void main(String args[]){
>           //static 메소드 실행문
>           staticmethod.classvar();
>           //클래스명.메소드명();
>           
>           //non-static 메소드 실행문
>           //객체를 생성한 후에 실행할 수 있다.
>           nonstaticclass classvar = new nonstaticclass();
>           //클래스명 변수명 = new 클래스명(); -> 객체생성
>           classvar.nonstaticmethod();
>           //변수명.메소드명();
>       }
>   }
>   ```
>
>   
>
>   
>
> - **리턴타입 :** 메소드를 호출하면 반환해주는 값의 타입을 의미.
>
>   반환값이 없을 때에는 void, 있을 때에는 해당 타입의 명칭을 써준다.
>
>   ```java
>   //리턴타입이 void
>   public static void test(){
>       //명령문 작성
>   }
>   
>   //리턴타입이 int
>   public static int test(){
>     //int이기 때문에 정수형으로 리턴을 해줘야한다.
>       return 0;
>   }
>   ```
>   
>
>  
>
> non-static은 static에 접근가능하지만 안하는게 좋다.
>
> static은 non-static에 접근 불가능하다.
>
> **non-static :** 만들어진 애들 각각에 적용.
>
> **static :** 만들어진 전부에 적용
>
> ex ) 마린 두마리의 공격력은 각각 다르다 [ non-static ]
>
> ​		마린 두마리의 체력은 모두 같다 [ static ]

