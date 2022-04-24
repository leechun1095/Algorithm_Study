# 11. 정렬  
> 보통 빠르다는 정렬 알고리즘으로는 대표적으로,  
> 퀵 정렬(Quick Sort), 힙 정렬(Heap Sort), 합병 정렬(Merge Sort) 등이 있는데,  
> 이들의 평균 시간복잡도는 𝚶(nlogn) 이다.  

<br/>

## 정렬 알고리즘  
### 1️⃣ 선택정렬  
* 시간복잡도가 O(n2) 으로 그리 좋은 성능의 알고리즘은 아니다.  
* temp 변수 선언해서 두 숫자를 비교하여 변경하는 방식  

### 2️⃣ Arrays.sort()  
* dual-pivot Quicksort 알고리즘을 쓰고 있기 때문에 시간복잡도는 평균 O(nlogn) 으로 좋은 성능을 내고 있다.  
* 물론 최악의 경우에는 O(n2)  이기 때문에 저격 데이터를 넣을 경우 효율은 떨어질 수 있다.  

### 3️⃣ Collections.sort()  
* ArrayList 메소드 알고리즘  
* Collections.sort() 은 Timsort이다.  
* Timsort 의 경우 합병 및 삽입정렬 알고리즘을 사용한다.  
* 두 가지가 섞여있는 정렬 알고리즘을 hybrid sorting algorithm 이라고 함.  
  * 합병정렬(Merge Sort)의 경우 최선, 최악 모두 O(nlogn)을 보장함.  
  * 삽입정렬(Insertion sort)의 경우 최선의 경우는 O(n) , 최악의 경우는 O(n2) 이다.  
* 실제로 파이썬이나 기타 정렬 알고리즘에서 가장 많이 쓰이는 알고리즘이기도 하다.  
* 시간복잡도 O(n) ~ O(nlogn) 을 보장한다는 장점이 있다.  

### 4️⃣ Counting Sort 정렬  
* 코딩테스트 시간 제한이 빡빡할 떄 주로 사용, 실무에서는 숫자 범위가 큰 경우 배열의 크기가 그만큼 커지므로 메모리 확보 문제로 잘 사용안함.  
* 값을 비교하면서 정렬하는 것이 아니라 각 입력받은 값을 index 으로 하여 해당 값의 출현 빈도수를 체크하고, 출력하는 방법을 사용하는 것이다.  
* 이 경우에는 시간복잡도가 O(n)으로 매우 빠른 알고리즘에 속한다.  

### 과정 (https://st-lab.tistory.com/104)  
#### 1. array 를 한 번 순회하면서 각 값이 나올 때마다 해당 값을 index 로 하는 새로운 배열(counting)의 값을 1 증가시킨다.  
* array 배열  
* counting 배열  

#### 2. counting 배열의 각 값을 누적합으로 변환시킨다.  

#### 3. counting 배열의 각 값은 (시작점 - 1)을 알려준다고 했다. 즉, 해당 값에 대응되는 위치에 배정하면 된다는 의미다.  
* counting 배열  
* result 배열 : 정렬된 결과의 배열이 완성됨.  
<br/>

## Collections.sort(list); (Q2108)
Collections.sort의 메소드를 이용해서 정렬할 수 있다.  
기본 자료형의 wrapper 클래스의 객체들은 전부 이 Collections.sort를 통해서 알아서 정렬이 가능하다.  
```java
List<Integer> intList=new ArrayList<>();
		
intList.add(4);
intList.add(5);
intList.add(1);
intList.add(8);
intList.add(3);

printList("정수 정렬 전",intList);

Collections.sort(intList);

printList("정수 정렬 후",intList);

System.out.println("==============================");

List<String> strList=new ArrayList<>();

strList.add("de");
strList.add("dc");
strList.add("ci");
strList.add("ad");
strList.add("aa");

printList("문자열 정렬 전",strList);

Collections.sort(strList);

printList("문자열 정렬 후",strList);
```
```java

실행결과

정수 정렬 전
[4, 5, 1, 8, 3]
정수 정렬 후
[1, 3, 4, 5, 8]
==============================
문자열 정렬 전
[de, dc, ci, ad, aa]
문자열 정렬 후
[aa, ad, ci, dc, de]
```

## Collections와 ArrayList를 이용한 객체 정렬  
기본 자료형을 정렬하는 것이 아닌 우리가 만든 클래스의 객체를 정렬하려는 상황이 발생할 때 사용한다.  

https://reakwon.tistory.com/91
<br/>

## getOrDefault(Object key, V DefaultValue) (Q2108)
찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드  
* 매개 변수 : 이 메서드는 두 개의 매개 변수를 허용합니다.  
* key : 값을 가져와야 하는 요소의 키입니다.  
* defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값입니다.  
* 반환 값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환됩니다.  
 
```java
import java.util.HashMap; 

public class MapGetOrDefaultEx { public static void main(String arg[]) { 
  String [] alphabet = { "A", "B", "C" ,"A"}; 
  HashMap<String, Integer> hm = new HashMap<>(); 
  for(String key : alphabet) {
    hm.put(key, hm.getOrDefault(key, 0) + 1);
  }
  System.out.println("결과 : " + hm); // 결과 : {A=2, B=1, C=1} 
  
  // hashmap.values() : hashmap의 value값만 출력
  // hashmap.keySet() : hashmap의 key값만 출력
} 
```
