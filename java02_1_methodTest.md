# method Test

> 17과 8의 +,-,*,/,% 를 구해보자.
>
> ```java
> public class MyCalc{
>     //덧셈 메소드 생성
>     public static void sum(int i, int j){
>         //리턴타입이 void라서 return이 없고
>         //파라미터 i와 j를 받는데 이는 내가 메인메소드에서 아규먼트로 가져올 값을 표기한다.
>         int sum = i + j;
>         System.out.println(sum);
>     }
>     public static int minus(int i, int j){
>         //파라미터 i와 j를 받는 int형 리턴타입을 가지는 메소드이다.
>         int min = i - j;
>         System.out.println(min);
>         return min;
>     }
>     public static void mul(int i, int j){
>         int mul = i * j;
>         System.out.println(mul);
>     }
>     public static int div(int i, int j){
> 		int div = i / j;
>         
>         return div;
>     }
>     public static int  remainder(int i, int j){
>         int remainder = i % j;
>         
>         return remainder;
>     }
>     public static void main(String args[]){
>         
>     }
> }
> ---------------------------------------------------------------------------------
>     public class Test{
>         public static void main(String args[]){
>             MyCalc.sum(17,8);
>             //Calc 클래스에 있는 sum이라는 메소드를 호출해준다.
>             //sum에서는 파라미터  int i, int j를 받고 있기 때문에
>             //아규먼트로 값을 ( ) 안에 넣어준다.
>             
>             int resmin = MyCalc.min(17,8);
>             System.out.println("10-3 = " + resmin);
>             //1.
>             //resmin이라는 int형 변수에 MyCalc 클래스에 만들어놓은 min메소드의 결과값을 넣				는다.
>             System.out.println("10-3 = " + MyCalc.minus(17,8));
>             //2.
>             //출력문에 바로 불러와서 사용할수도 있다.
>             
>             MyCalc.mul(17,8);
>             
>             System.out.println("17 / 3 = " + MyCalc.div(17,8));
>             
>             MyCalc.remainder(17,8);
>         }
>     }
> ```
>
> 
>
> 