# JAVA 출력과 변수 선언

> 출력문은 간단하다. [ System.out.println(); ] 으로 작성해주면 화면에 출력해줄 수 있다.
>
> ```java
> public class Test01{
>     public static void main(String[] args) {
>         System.out.println("Hellow, World!");
>     }
> }
> ```
>
>  
>
> ### 변수 선언
>
> 일단 변수 선언의 규칙을 먼저 알아보자
>
> type var = 값; 으로 선언해줄 수 있다.
>
> type의 종류를 알아보면서 예시를 보자.
>
> - **정수형**
>
>   byte : 1byte의 크기
>
>   short : 2byte의 크기
>
>   **int** : 4byte의 크기  [ 정수형 중 가장 기본적인 타입이다. ]
>
>   long : 8byte의 크기 [ int타입으로 표기할 수 없는 타입을 long 타입으로 작성한다. ]
>
>   ex ) int a = 10;
>
> - **실수형**
>
>   float : 4byte의 크기
>
>   **double** : 8byte의 크기 [ 실수형 중 가장 기본적인 타입 ]
>
>   ex ) double b = 10.5;
>
> - **문자형**
>
>   char : 2byte의 크기
>
>   ex ) char c =  'c';
>
> - **논리형**
>
>   boolean : 1byte의 크기
>
>   ex ) boolean d = true;
>
>    
>
>   ```java
>   public class Test01{
>       public static void main(String[] args) {
>           int a = 10;
>           double b = 10.5;
>           char c = 'c';
>           boolean d = true;
>       }
>   }
>   ```
>
>    
>
>   #### *2진수, 8진수, 16진수 표기하기
>
>   ```java
>   public class Test01{
>       public static void main(String[] args) {
>           System.out.println(0b10); //2진수 : 0b
>           System.out.println(0010); //8진수 : 00
>           System.out.println(0x10); //16진수 : 0x
>       }
>   }
>   ```



# 참조타입

> 참조타입은 object 타입이다. 메모리에 할당된 주소를 참조한 값을 사용한다.
>
> 모든 클래스는 object를 상속 받는다.
>
> **wrapper class** : 기본타입을 참조타입으로 바꾸어 기능을 주는 것이라고 할 수 있다.
>
> boxing = 기본타입을 참조타입으로
>
> unboxing = 참조타입을 기본타입으로
>
> **[ String 타입은 참조타입인데 기본타입처럼 쓸 수 있다! ]**



# 형변환

> 형변환이란 타입을 변환시켜주는 것을 의미한다.
>
> ex ) int -> double
>
> - 묵시적 형변환
>
>   작은타입에서 큰타입으로 변형할 때에는 굳이 언급해주지 않아도 된다.
>
>   upCasting, promotion 작은타입 - > 큰타입
>
>   ```java
>   byte b1 = 100;	//묵시적 형변환
>   int il = b1;
>   ```
>
>   
>
> - 명시적 형변환
>
>   큰 타입에서 작은타입으로 변형할 때에는 꼭 명시를 해줘야한다.
>
>   downCasting, casting 큰타입 -> 작은타입
>
>   ```java
>   int i2 = 100;
>   byte b2 = (byte)i2;
>   ```
>
>    
>
>   #### char, String 형변환
>
>   ```java
>   int i = 65;
>   char c = (char)i;
>   //숫자 65를 문자열로 형변환을 했다.
>   //이럴 경우에는 char는 아스키코드표를 기준으로 65에 해당하는 문자를 반환한다.
>   //실행결과 : A
>   
>   char c2 = 'B'
>   int i2 = (int)c2;
>   /*
>   B는 아스키코드표를 기준으로 숫자 66에 해당한다.
>   B를 int로 반환하게 되면 숫자 66으로 반환한다.
>   실행결과 : B
>   */
>   
>   char c3_1 = '9'; //57 [ 아스키코드표참고 ]
>   char c3_2 = '1'; //49
>   int i3 = c3_1 + c3_2;
>   System.out.println(i3);
>   //실행결과 : 106
>   
>   String str = "65";
>   System.out.prinln(str + 1);
>   //실행결과 : 651
>   //설명 : 65는 문자형이다. 숫자형아니기 때문에 "65" + 1이라는 뜻이고
>   //이것은 "65"1 이고 따라서 651이 된다
>   ```



# Wrapper class

> wrapper class는 기본타입을 참조타입으로, 참조타입을 기본타입으로 바꿔주는 것이다.
>
> 바로 예시를 보자.
>
> ```java
> String str="65";
> int i4 = Integer.parseInt(str);
> //Integer은 wrapper class이다. ()안에 있는 변수의 타입을 int형으로 변환(Integer)해주는 것이다.
> System.out.println(i4 + 1);
> //실행결과 : 66
> 
> 
> //int 타입을 String타입으로 변환하는 두가지 방법이 있다.
> int i5 = 65;
> //1번 방법
> String str2 = String.valueOf(i5);
> System.out.println(str2 + 1);
> //실행결과 : 651
> 
> //2번방법
> String str3 = Integer.toString(i5);
> System.out.println(str3 + 1);
> //실행결과 : 651
> 
> ```



> ```java
> //boxing
> //기본값을 감싼다.
> String str1 = new String("1000");
> 
> System.out.println(str1 + 1);
> //실행결과 : 10001
> 
> //str1을 숫자로 변환.
> int i1 = Integer.valueOf(str1);
> System.out.println(i1 + 100);
> //실행결과 : 1100
> 
> //i1에 담긴 숫자형을 문자형으로 변환.
> String str = String.valueOf(i1);
> System.out.println(str + 1);
> //실행결과 : 10001
> 
> 
> //unboxing
> //wrapper class에서 값으로..
> Integer i = new Integer(100);
> 
> int j = i.intValue();
> //wrapper class로 감싸져있던 i를 j에 담아서 값으로 만들었다.
> System.out.println(j + 1);
> //실행결과 : 101
> ```
>
> 

