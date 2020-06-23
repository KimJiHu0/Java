# String

>  문자형들의 집합이다.
>
> 문자열을 관리하는 클래스이다.
>
> char[]대신 ""상수를 관리한다.
>
> 문자열 리터럴을 관리해주는 것이 String class이다.
>
> 한번에 생성된 문자열은 [ create, read, update, delete ] 불가하다.
>
>  
>
> **[ 특징 ]**
>
>  참조타입 중에 유일하게 기본타입의 특징을 가진다.
>
> immutable하다. 대입하기 전에는 값이 변하지 않는다.
>
> mutable하다. 대입하지 않아도 값이 변한다.
>
> 값을 변경해도 hasCode[주소값]은 변하지 않는다.
>
> 하나의 각자 객체를 말한다.
>
> 값이 변하면 새로운 객체가 생성된다.
>
> hash코드가 변하는걸 볼 수 있다.
>
> String Concatenation 문자열을 만나면 문자열이 된다.
>
> String s = "Hello";
>
> s = s + 1 + 2 s 하면
>
> 3Hello가 된다.
>
> String은 참조타입이다. 오브젝트를 상속받은 모든 클래스 주소값을 가지고 있다.
>
>  ![](https://postfiles.pstatic.net/MjAyMDA2MjNfMjY5/MDAxNTkyODk0MDk2ODgy.VQnI_sotPR62LNmY5lxvaIAafJ9L5Q2u96upEe5dQI4g.SNKKPTvAlMgKt0doLUzam6BB8M33fFZWlB6zFcyZfTcg.PNG.rgusqls/image.png?type=w773)
>
>  String 값들은 String pool이라는 곳에 저장이되고, String a = new String("");으로 작성된 참조타입 형식은
>
> heap 영역에 저장된다.
>
> String a = "a"; , String b = "b"; 이 둘은 같은 주소값을 쓴다.
>
> 만일 String a = a + "b";를 한다면 기존에 있던 a라는 값은 String pool에 남아있고 "ab"라는 새로운 객체가
>
> 생성이 된다.그렇게 남아있는 값은 시간이 지나면 garbage Collection에 자동으로 담기게 되고, 그 전에
>
> 새로운 변수가 a라는 값을 가져다 사용할 수 있다.
>
> a == c 는 주소값이 같기 때문에 true이고, a == c 는 저장영역이 다르고 주소값이 다르기 때문에 false이다.
>
>  
>
> 
>
> ###  [ String의 여러가지 기능 ]
>
> - **변수.length() :** 변수의 인덱스 길이를 공백 포함해서 리턴.
> - **변수.toUpperCase() :** 변수의 문자를 대문자로 변환해서 리턴.
> - **변수.toLowerCase() :** 변수의 문자를 소문자로 변환해서 리턴.
> - **변수.indexOf() :** 변수의 해당 문자의 인덱스 위치를 리턴.
> - **변수.replace("","") :** 변수의 기존에 있던 문자를 새로운 문자로 변환해서 리턴.
> - **변수.substring(?,?) :** 변수의 ?indext부터 ?index까지의 문자를 리턴.
>
>  
>
> ###  [ StringBuffer ]
>
>  문자열을 추가하거나 변경할때 주로 사용하는 자료형이다.
>
> String과 다르게 mutable하여 한번 생성된 값을 언제든지 변경할 수 있고 객체는 단 한번만 생성된다.
>
> **특징 :** 
>
> String보다 메모리 사용량이 더 많고 속도가 느리다.
>
> StringBuffer은 buffer이라는 독립적인 공간을 가지며 buffer의 크기에 기본값을 16개 문자를 저장할 수
>
> 있는 크기. 그리고 생성자를 통해 크기를 별도로 설정해줄 수 있다.
>
> **StringBuffer str = new StringBuffer();** // 객체생성
> **str.append("Hello Java!");**  //문자열 추가.
> **str.insert(0, "Everybody");** // 0의 위치에 문자열을 추가.
> **str.delete(0,1);** // 0 index와 1 index 사이의 문자를 삭제한다.
> **str.deleteCharAt(1);** // 특정 위치의 문자 하나만 삭제를 한다.
> **str.capacity();** // StringBuffer 인스턴스의 현재 크기를 알려준다.
> **str.subString(4,8);** // String에서 사용하는 방법과 동일.
>
>  
>
> ###  [ StringTokenizer ]
>
>  java.util package에 속해있다.
>
> 하나의 문자열을 여러 개의 문자열로 분리하기 위해 사용한다.
>
> 문자열 분리하기 위해 사용되는 기준문자 = 구분문자.
>
> 구분문자로 분리된 문자열 = 토큰
>
> **int countTokens()** = 분리한 토큰의 개수.
> **boolena hasMoreTokens()** = 남아있는 토큰이 존재하면 True를 리턴. 없으면 false 리턴.
> **String nextToken()** = 존재하는 토큰 리턴.