# 200.자료구조1  

## Stack 구현 ([Q10828](Q10828.java)), ([Q9093](Q9093.java))  
### Stack API 사용 ([Q9093_2](Q9093_2.java))  
<br/>

## char[] arr로 받을때 ([Q9012](Q9012.java))  
```java
char[] arr = br.readLine().toCharArray();
```
<br/>

## 에디터 ([Q1406](Q1406.java))  
```java
- a b c | x y z 가 있는 경우
 
 | c |	   | x |	
 | b |	   | y |	
 | a |     | z |	

1) L : 커서를 왼쪽으로 한 칸 옮김	
a b c | x y z  → a b | c x y z  : 왼쪽에서 pop, 오른쪽에서 push

           | c |
           | x |	
 | b |	   | y |	
 | a |     | z |	
 
2) D : 커서를 오른쪽으로 한 칸 옮김
a b c | x y z  → a b c x | y z  : 오른쪽에서 pop, 왼쪽에서 push
 
 | x |			   
 | c |		   
 | b |	   | y |	
 | a |     | z |	 
 
3) B : 커서를 기준으로 왼쪽에 있는 문자를 삭제함
a b c | x y z  → a b | x y z  : 왼쪽에서 pop

           | x |	
 | b |	   | y |	
 | a |     | z |	
 
4) P d(=문자) : '문자'를 커서를 기준으로 오른쪽에 추가하고 커서는 '문자'의 오른쪽에 위치함  
a b c | x y z  → a b c d | x y z  :  왼쪽에서 push
 
 | d | 
 | c |	   | x |	
 | b |	   | y |	
 | a |     | z |	 
 
5) 마지막 처리 : 
 5-1) 왼쪽 있는 문자를 하나씩 모두 pop하여 오른쪽으로 push한다.
 5-2) 오른쪽에서 모든 문자를 하나씩 pop하면 순서대로 문자열 완성.
```
<br/>

## Queue 구현 ([Q10845](Q10845.java))  
### Queue API 사용 ([Q10845_2](Q10845_2.java))  
<br/>

## 조세퍼스 ([Q1158](Q1158.java))  
```java
N = 7명, M = 3번째 일 때

        1 2 3 4 5 6 7
M = 1     2 3 4 5 6 7 1			: 1 pop, 1 push
M = 2       3 4 5 6 7 1 2		: 2 pop, 2 push
M = 3         4 5 6 7 1 2		: 3 pop, 3이 답으로 append

        4 5 6 7 1 2
M = 1     5 6 7 1 2 4  			: 4 pop, 4 push
M = 2       6 7 1 2 4 5			: 5 pop, 5 push
M = 3         7 1 2 4 5			: 6 pop, 6이 답으로 append
```
<br/>

## Deque API ([Q10866](Q10866.java))  
```java
ArrayDeque<Integer> dq = new ArrayDeque<Integer>();

dq.addFirst(i); // 맨 앞에 넣기
dq.addLast(i); // 맨 뒤에 넣기
dq.pollFirst(); // 맨 앞 빼기
dq.pollLast(); // 맨 뒤 빼기
dq.size(); // 사이즈
dq.isEmpty(); // 덱 비었는지 확인
dq.peekFirst(); // 맨 앞 조회
dq.peekLast(); // 맨 뒤 조회
```
<br/>
