# Array

>  **배열이란** 같은 타입의 여러값을 효과적으로 관리하기 위한 객체이다.
>
>  배열은 참조타입이며 참조타입은 mutable하여 주소값으로 변경한다.
>
>  new객체를 사용하지 아낳아도 객체생성이 가능하다.
>
>  
>
>  **일차원 배열** 생성의 3가지 방법.
>
>  ```java
>  //선언, 정의, 초기화를 따로
>  
>  int[] a;		//선언
>  a = new int[5];	//정의
>  a[0] = 1;		//초기화
>  a[1] = 2;
>  a[2] = 3;
>  a[3] = 4;
>  a[4] = 5;
>  ```
>
>  먼저 a라는 배열을 만든다.
>
>  그 후에 []안에 배열의 크기를 입력하여 배열의 정의를 해준다.
>
>  그리고 a[]에 배열의 index를 입력해 index에 해당하는 값을 넣어준다.
>
>  배열의 크기는 1부터 시작을 하지만 index는 0번지부터 시작한다.
>
>  
>
>  ```java
>  //선언,정의,초기화를 한번에
>  
>  int[]b = new int[]{5,3,1,2,4};
>  ```
>
>  ```java
>  //선언하고 바로 초기화
>  int[] c = {6,7,9,0,8};
>  ```
>
>  
>
>  배열의 index값을 불러오는 방법
>
>  ```java
>  System.out.println(a[2]);
>  //실행결과 : 2
>  //a라는 배열에 2번째 인덱스에는 2가 들어가있다.
>  System.out.println(b[3] + c[2]);
>  //실행결과 : 11
>  //b라는 배열의 3번째 인덱스에는 2, c라는 배열의 2번째 인덱스는 9가 들어있다.
>  System.out.println(Arrays.toString(c));
>  //실행결과 : [6, 7, 9, 0, 8]
>  //배열을 주소값을 참조한다.그래서 출력문으로 그냥 배열 c를 입력했을 때에는
>  //주소값이 출력이 된다.
>  //하지만 Arrays.toString()이라는 명령어는 주소값이 아닌 배열을 출력해주는 기능을 한다.
>  ```
>
>  
>
>  배열에 들어있는 값 변경하기
>
>  ```java
>  String[] s = new String[]{"have","a","nice","day"};
>  
>  s[2] = "good";
>  
>  System.out.println(Arrays.toString(s));
>  
>  //실행결과 : [have, a, good, day]
>  
>  //배열의 표시인 []를 제외하고 출력을 하고 싶다면 for문을 이용하자.
>  for(int i = 0; i < s.length; i++){
>   Sysetm.out.print(s[i] + " ");
>  }
>  //위와 같이 작성을하게 된다면 for문이 0부터 배열s가 가지고있는 인덱스의 길이만큼 돌면서
>  //s의 0번지부터 마지막번지까지 출력을해줄 것이다.
>  //실행결과 : have a good day
>  ```
>
>  
>
>  **다차원배열**
>
>  ```java
>  // 행이 3줄, 열이 2줄 이라고 생각하면 된다.
>  
>  //이는 정변배열이라고 한다.
>  //정변배열이란 길이다 전부 정해져있는 배열을 의미한다.
>  int[][] a = new int[3][2];
>  a[0][0] = 1;
>  a[0][1] = 2;
>  a[1][0] = 3;
>  a[1][1] = 4;
>  a[2][0] = 5;
>  a[2][1] = 6;
>  //[ㅇ,ㅇ]
>  //[ㅇ,ㅇ]
>  //[ㅇ,ㅇ]
>  //의 형식 배열이다.
>  ```
>
>  
>
>  ```java
>  //이는 가변배열을 의미한다.
>  //행의 길이는 지정을 해주었지만 열의 길이는 지정을 안해주고 선언을 했다.
>  //초기화 부분에서 열의 길이를 지정해주고 사용자가 길이를 마음대로 지정할 수 있다.
>  int [][] b = new int[3][];
>  b[0] = new int[3];
>  b[1] = new int[5];
>  b[2] = new int[1];
>  //[ㅇ,ㅇ,ㅇ]
>  //[ㅇ,ㅇ,ㅇ,ㅇ,ㅇ]
>  //[ㅇ]
>  //의 형식 배열이다.
>  ```
>
>  
>
>  ```java
>  int[][] c = new int[][]{
>   				   {1, 2},
>                      {3, 4, 5},
>                      {6, 7, 8, 9},
>                      {0}
>  					   };
>  ```
>
>  
>
>  ```java
>  //출력문
>  
>  System.out.println(Arrays.toString(c));
>  //가변배열 또한 주소값을 참조하기 때문에 일반 출력문이 아니라
>  //Arrays.toString()을 사용해주어야 한다.
>  //실행결과 : [[1,2], [3,4,5], [6,7,8,9], [0]]
>  
>  //[]를 제외하고 배열출력하는 방법
>  for(int i = 0; i < c.length; i++){
>   for(int j = 0; j < c[i].length; j++){
>       System.out.print(c[i][j]+" ");
>   }
>  }
>  //첫번째 for문에서 i가 0부터 배열c의 길이만큼 도는데
>  //두번째 이중for문에서 j가0부터 배열c의 i번지의 길이만큼 또 돈다.
>  //이 뜻은 i가(행)이 0번째 인덱스부터 j를 배열c의 0번지 인덱스부터 마지막인덱스까지
>  //찾아서 출력해준다는 의미이다.
>  ```
>
>  
>
>  ### **shallow Copy**
>
>  **주소값만 전달하는 얕은 값복사**라고 할 수 있다.
>
>  복사본을 변경하면 원본도 같이 변경된다.
>
>  ```java
>  int[] original = {10,20,30,40};
>  
>  int[] copy = original;
>  
>  System.out.println(Arrays.toString(original));
>  System.out.println(Arrays.toString(copy));
>  //실행결과 : 둘 다 똑같이 [10,20,30,40] 출력
>  
>  System.out.println(original == copy);
>  //실행결과 : true
>  //orginal과 copy의 주소값은 같기 때문에 true가 나온다.
>  
>  copy[1] = 22;
>  System.out.println(Arrays.toString(original));
>  System.out.println(Arrays.toString(copy));
>  //shallow Copy는 주소값을 복사해서 그대로 가져오기 때문에
>  //복사본의 배열의 숫자를 바꾸게 된다면 원본에게도 영향이간다.
>  //실행결과 : 둘 다 똑같이 [10,22,30,40]
>  		
>  //주소값을 말한다. hasCode();
>  System.out.println(original.hashCode());
>  System.out.println(copy.hashCode());
>  //실행결과 : 둘다 주소값을 출력하는 것이기 때문에 같은 주소값이 나온다.
>  ```
>
>  
>
>  ### **deep Copy**
>
>  deep Copy는 **기존에 있던 배열의 값만 복사**하고 주소값은 **새로운 주소값을 생성**하여 복사한다.
>
>  복사본을 변경해도 원본에는 지장이 없다.
>
>  ```java
>  int[] original = {10,20,30,40};
>  int[] copyone = new int[original.length];
>  //original이라는 배열의 길이만큼 배열의 길이를 입력.
>  for(int i = 0; i < original.length; i++){
>      copyone[i] = original[i];
>      //copyone배열의 i번지 (0번지부터 original의 길이 마지막까지)에 original의 i번지값을
>      //대입한다.
>  }
>  System.out.println(Arrays.toString(original));
>  System.out.println(Arrays.toString(copyone));
>  System.out.println(original == copyone);
>  //실행결과
>  //[10,20,30,40]
>  //[10,20,30,40]
>  //false
>  //deep copy는 새로운 주소값을 생성하여 값을 복사해서 가져오는 것이기 때문에 주소값이 다르다.
>  
>  copyone[1] = 22;
>  System.out.println(Arrays.toString(original));
>  System.out.println(Arrays.toString(copyone));
>  //실행결과
>  //[10,20,30,40]
>  //[10,22,30,40]
>  //deep copy는 복사본을 변경해도 원본에 영향이 없기 때문에 값이 다르다.
>  
>  //clone() 해당 배열을 똑같이 복사해달라는 의미.
>  int[] copyTwo = original.clone();
>  copyTwo[1] = 33;
>  System.out.println(Arrays.toString(original));
>  System.out.println(Arrays.toString(copyTwo));
>  System.out.println(original == copyTwo);
>  		
>  System.out.println("=====================");
>  
>  //System.arraysCopy(
>  //				원본 배열 객체,object src
>  //				원본 시작 위치,int srcOps
>  //				복사 배열 객체,object dest
>  //				복사 시작 위치,int destPos
>  //				복사 갯수,int length
>  //                  )
>  		
>  int[] systemArray = new int[10];
>  //fill은 systemArray라는 배열에 100으로 꽉 채워달라는 얘기. 10개의 수가 100으로.
>  Arrays.fill(systemArray, 100);
>  System.out.println(Arrays.toString(systemArray));
>  System.arraycopy(original, 0, systemArray, 2,3);
>  System.out.println(Arrays.toString(systemArray));
>  		
>  System.out.println("=====================");
>  
>  System.out.println(original.hashCode());
>  System.out.println(copyOne.hashCode());
>  System.out.println(copyTwo);
>  System.out.println(systemArray);
>  ```
>
>  
>
>  
>
>  
>
>  