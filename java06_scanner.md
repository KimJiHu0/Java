# scanner

> **scanner :** 콘솔에 사용자가 직접 입력할 수 있게 만들어주는 기능이다.
>
> ​					java.util package에 있기 때문에 사용을 하기 위해서는 import를 해주어야 한다.
>
>  ```java
> import java.util.Scanner;
> 
> public class ScannerTest{
>     public static void test01(){
>         Scanner sc = new Scanner(System.in);
>         
>         System.out.prinln("첫번째 숫자를 입력해주세요");
>         int first = sc.nextInt();
>         //사용자가 입력한 숫자를 변수 first에 담아준다.
>         
>         System.out.println("두번째 숫자를 입력해주세요");
>         int second = sc.nextInt();
>         //사용자가 입력한 숫자를 변수 second에 담아준다.
>         
>         int sum = first + second;
>         //sum이라는 변수에는 사용자가 입력한 첫번째 수와 두번째 수의 합을 담아준다.
>         System.out.println("두 숫자의 합은 : " + sum);
>         
>         //실행결과
>         //첫번째 수를 10을 입력하고, 두번째 수를 5를 입력했다면
>         //15출력
>     }
>     public static void test02(){
>         Scanner sc = new Scanner(System.in);
>         System.out.println("문자를 입력해주세요");
>         String s = sc.nextLine();
>         //문자를 변수에 담아주기 위해서 String이라는 변수 타입을 사용했다.
>         //사용자가 입력한 수를 문자로 받기 위해서는
>         //.nextLine()을 사용해야 한다.
>         //문자를 받아오는 속성중에는 .next()와 .nextLine()가 있다.
>         //.nextLine() : 공백까지 포함해서 하나의 문장으로 입력을 해준다.
>         //.next() : 공백을 토큰으로 끊어 공백이 없는 하나의 문장을 입력해준다.
>         System.out.println("입력하신 문자 : " + s);
>         
>         //실행결과
>         //안녕하세요. 자바공부중입니다.를 했으면 있는 그대로 도출
>     }
>     public static void test03() {
> 		//공백으로 token을 나눠줌.
> 		Scanner sc = new Scanner(System.in);
> 		//1token
> 		System.out.print("문자를 입력해 주세요 :");
> 		String s = sc.next();
> 		//2token
> 		System.out.println("입력하신 문자는 : " + s);
> 		String s2 = sc.nextLine();
> 		System.out.println("그리고 : " + s2);
> 		//3token
> 		String s3 = sc.next();
> 		System.out.println("그 다음 : " + s3);
> 	}
>     
>     public static void main(String[] args){
>         
>     }
> }
>  ```
>
> - **nextInt() :** 사용자가 입력한 값을 정수형으로 받아주기 위한 명령어.
> - **nextDouble() :** 사용자가 입력한 값을 실수형으로 받아주기 위한 명령어.
> - **next() :** 사용자가 입력한 값을 문자형으로 받지만 공백이 있는 경우 끊어서 받아주는 명령어.
> - **nextLine() :** 사용자가 입력한 값을 문자형으로 받지만 공백이 있는 경우 하나의 문장으로 받아준다.