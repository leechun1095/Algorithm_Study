# 자료구조

|no|문제|풀이|
|---|----|----|
|1|[단어 뒤집기2](https://www.acmicpc.net/problem/17413)|[Q17413.java](/lecture/data_structure1/Q17413.java)|
|2|[쇠막대기](https://www.acmicpc.net/problem/10799)|[Q10799.java](/lecture/data_structure1/Q10799.java)|
|3|[오큰수_1](https://www.acmicpc.net/problem/17298)|[Q17298.java](/lecture/data_structure1/Q17298.java)|
|4|[오큰수_2](https://www.acmicpc.net/problem/17298)|[Q17298_2.java](/lecture/data_structure1/Q17298_2.java)|
|5|[오큰수_3](https://www.acmicpc.net/problem/17298)|[Q17298_3.java](/lecture/data_structure1/Q17298_3.java)|
|6|[오등큰수](https://www.acmicpc.net/problem/17299)|[Q17299.java](/lecture/data_structure1/Q17299.java)|
|7|[후위표기식2](https://www.acmicpc.net/problem/1935)|[Q1935.java](/lecture/data_structure1/Q1935.java)|
|8|[후위표기식](https://www.acmicpc.net/problem/1918)|[Q1918.java](/lecture/data_structure1/Q1918.java)|

## 1. 스택 Stack
- 스택: 한쪽 끝에서만 자료를 넣고 뺄 수 있는 자료구조
- LIFO: Last In First Out
### 메소드
- push: 입력
- pop: 출력

## 2. 큐 Queue
- 큐: 한쪽 끝에서만 자료를 넣고 다른 한쪽 끝에서만 뺄 수 있는 자료구조
- FIFO: First In First Out
### 메소드
- push: 입력
- pop: 출력
- front: 가장 앞에 있는 자료
- back: 가장 뒤에 있는 자료
- empty: 비어있는지
- size: 저장되어 있는 자료의 개수
- BFS 알고리즘에서 주로 사용함
### Queue는 왜 LinkedList로 초기화하는가?
- Queue는 interface이고 상속받아 구현한 여러 클래스들이 존재한다.
- 그중에서도 Dequeue 인터페이스를 구현한 LinkedList 클래스가 큐 메모리 구조를 구현하는 데 가장 많이 사용된다.
```java
Queue<Integer> stack = new LinkedList<Integer>();
```

## 3. 덱 Dequeue
- 양 끝에서만 자료를 넣고 양 끝에서 뺄 수 있는 자료구조
- Double Ended Queue


