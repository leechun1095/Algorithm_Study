# Java Algorithm 정리

## StringBuffer
### BufferedReader 의 경우 문자열을 받는 대표적인 방법은 readLine() 과 read() 이다. 
- 둘의 차이는 readLine() 은 한 행을 읽어오고, read() 는 한 문자만 읽어온다. 
- 특별한 경우가 없는 한 대부분 readLine() 을 쓴다. 
```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str = br.readLine();

String[] arr = br.readLine().split(" ");
```

### 문자열 분리 방법에는 두 가지가 있다.
- StringTokenizer 클래스를 이용하여 분리해주는 방법 split() 을 이용하는 방법
- 결론부터 말하자면 StringTokenizer 가 성능면에서 좋다. 
- 단순 규칙으로 문자열을 분리해줄 때 StringTokenizer을 애용한다.
  - 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환해준다.
  - 이때 반환시킨 문자열은 반환됨과 동시에 해당 객체에서 사라지게 된다.
  - 그리고 문자열을 반환했으니 Integer.parseInt()로 int 형으로 변환시켜준다. 
```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
String str = br.readLine();
StringTokenizer st = new StringTokenizer(str, " ");
int a = Integer.parseInt(st.nextToken());
int b = Integer.parseInt(st.nextToken());
```

### 변수 타입
```java
StringBuffer sb = new StringBuffer("leechun"); // 최초 "leechun"로 생성

System.out.println(sb); // leechun
System.out.println(sb.getClass().getName()); // java.lang.StringBuffer

System.out.println(sb.toString()); // leechun
System.out.println(sb.toString().getClass().getName()); // java.lang.String
```

## StringBuilder
StringBuilder는 변경가능한 문자열이지만 synchronization이 적용되지 않았다.

### 사용 예시 ([Q10951](03.반복문/Q10951.java))
```java
// 입력의 종료는 더이상 읽을 수 있는 데이터(EOF, End Of File)가 없을 때 종료한다.
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringBuilder sb = new StringBuilder();
String str;

while((str=br.readLine()) != null) {
  int A = str.charAt(0) - 48;
  int B = str.charAt(2) - 48;
  sb.append(A+B).append('\n');
}
br.close();
System.out.println(sb);
```

### StringBuffer와 StringBuilder의 차이
- StringBuffer와 StringBuilder의 차이는 멀티스레드 환경에서 thread-safe 여부가 다르다. 
- StringBuffer는 thread-safe 하므로 여러 쓰레드에서 동시에 해당 문자열에 접근한다면 사용을 고려하고, 
- 그렇지 않다면 StringBuilder를 사용하는 것이 성능에 더 유리하다. (성능과 thread-safe는 반비례라고 생각하면 된다.)

정리하면
1. 문자열 변경이 빈번하지 않는다면 String 사용을 고려
2. 문자열이 빈번하게 변경되면서 멀티쓰레드 환경이라면 StringBuffer 사용을 고려
3. 문자열이 빈번하게 변경되면서 멀티쓰레드 환경이 아니라면 StringBuilder 사용을 고려

## StringTokenizer ([Q10818](04.일차원배열/Q10818.java))
- 문자열 -> 배열로 파싱할 때 유용하다.
- countTokens()로 총토큰의 개수를 구하고, nextToken()으로 한 토큰씩 꺼낼 수 있다.
```java
StringTokenizer st = new StringTokenizer(br.readLine(), " ");
while(st.hasMoreTokens()) {
  int val = Integer.parseInt(st.nextToken());
}
```

## 배열을 사용 안 하고 처리하는 코드가 상대적으로 성능이 좋다. ([Q10818](04.일차원배열/Q10818.java))
배열은 메모리를 사용하기 때문에 

## Arrays.sort(arr);
배열 정렬 사용
```java
arr[0] = 5
arr[1] = 4
arr[2] = 3
arr[3] = 2

Array.sort(arr);
=> 아래와 같이 정렬됨

arr[0] = 2
arr[1] = 3
arr[2] = 4
arr[3] = 5

int[] arr = new int[];
Arrays.sort(arr);
```

## Integer.MIN_VALUE, Integer.MAX_VALUE
```java
int minVal = Integer.MIN_VALUE;
int maxVal = Integer.MAX_VALUE;
```

## HashSet ([Q3052](04.일차원배열/Q3052.java))
- 중복되는 원소를 넣을 경우 하나만 저장한다. 즉, 중복원소를 허용하지 않는다.
- HashSet 은 순서 개념이 없다. 따라서 Collections.sort() 메소드를 사용할 수 없다.
- 만약 정렬을 하고 싶다면 리스트로 변환 후 정렬해야한다.
- HashSet 을 이용하면 자연스럽게 나머지 값이 HashSet 원소에 이미 저장되어있어 중복일 경우 저장이 되지 않고 
HashSet 에 없으면 저장한다.
- 즉, HashSet 에 저장하면서 들어간 원소의 개수가 HashSet 의 사이즈가 되는 것

```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
HashSet<Integer> h = new HashSet<Integer>();

for(int i=0; i<10; i++) {
  h.add(Integer.parseInt(br.readLine()) % 42);
}
br.close();
System.out.println(h.size());
```

## String.format ([Q4344](04.일차원배열/Q4344.java))
- String클래스의 format 메소드는 리턴되는 문자열 형태를 지정하는 함수
- 이 함수를 활용하면 Math.round() 함수와 같이 소수점 n번째 자리까지 반올림하여 나타낼 수 있음

```java
System.out.println(String.format("%.3f", (cnt/N)*100));

double pie = 3.14159265358979;
double money = 4424.243423;
System.out.println(String.format("%.2f", pie)); //결과 : 3.14
System.out.println(String.format("%.3f", pie)); //결과 : 3.142
System.out.println(String.format("%,.3f", money)); //결과 : 4,424.243
```

## Math.round와 String.format 차이점 ([Q4344](04.일차원배열/Q4344.java))
Math.round()함수는 소수점아래가 0일경우 절삭하지만 String.format은 절삭하지 않고 그대로 리턴합니다.

```java
double money = 5000.000;
System.out.println(Math.round(money*1000)/1000); //결과 5000
System.out.println(String.format("%.3f", money)); //결과 : 5000.000
```

## 아스키코드 값 구하기
int로 받으면 아키스코드 값이 되고, char로 받으면 문자가 된다.
```java
int ch = str.charAt(0);
char ch = str.charAt(0);
System.out.println(ch);
```
#### str.charAt(0) -'0' ([Q2577](04.일차원배열/Q2577.java))
- str.charAt(0) 은 문자가 출력된다.
- 문자 '1'은 int형으로 형변환을 하면 아스키코드 값으로 변환되는데 49이다.

#### 문자형을 숫자로 변환 방법
1. -'0'을 빼준다. ('0'은 아스키코드 48)
2. -48 을 빼준다

## 대문자로 변환, 소문자로 변환 메소드 ([Q1157](06.문자열/Q1157.java))
```java
String str = str.toUpperCase();
String str1 = str.toLowerCase();
```

## BigInteger ([Q10757](07.기본수학1/Q10757.java))
각 타입의 숫자 범위를 넘어서는 경우 0으로 출력된다.
무한의 정수가 들어갈 수 있는 가능성이 있다면 BigInteger 를 사용해야 한다.
문자열 형태로 이루어져 있어 숫자의 범위가 무한하기에 어떠한 숫자든지 담을 수 있음

#### int 
- 메모리 크기는 4byte로 표현 범위 : -2,147,483,648 ~ 2,147,483,647

#### Long
- 메모리 크기는 8byte로 표현 범위 : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

#### BigInteger 선언
BigInteger을 초기화하기 위해서는 문자열을 인자 값으로 넘겨주어야 한다는 점

```java
BigInteger bigNumber = new BigInteger("10000");
```

#### BigInteger 계산
BigInteger은 문자열이기에 사칙연산이 안된다.
BigIntger 내부의 숫자를 계산하기 위해서는 BigIntger 클래스 내부에 있는 메서드를 사용해야 합니다.

```java
BigInteger A = new BigInteger("100000");
BigInteger B = new BigInteger("10000");
		
System.out.println("덧셈(+) :" +A.add(B));
System.out.println("뺄셈(-) :" +A.subtract(B));
System.out.println("곱셈(*) :" +A.multiply(B));
System.out.println("나눗셈(/) :" +A.divide(B));
System.out.println("나머지(%) :" +A.remainder(B));
```

#### BigInteger 형 변환

```java
BigInteger bigNumber = BigInteger.valueOf(100000); //int -> BigIntger

int int_bigNum = bigNumber.intValue(); //BigIntger -> int
long long_bigNum = bigNumber.longValue(); //BigIntger -> long
float float_bigNum = bigNumber.floatValue(); //BigIntger -> float
double double_bigNum = bigNumber.doubleValue(); //BigIntger -> double
String String_bigNum = bigNumber.toString(); //BigIntger -> String
```

#### BigInteger 두 수 비교
```java
BigInteger A = new BigInteger("100000");
BigInteger B = new BigInteger("1000000");
		
//두 수 비교 compareTo 맞으면 0   틀리면 -1
int compare = A.compareTo(B);
System.out.println(compare);
```
