## 520. 브루트 포스(순열)

### 순열 (Permutation)
* 임의의 수열을 다른 순서로 섞는 연산
* arr={1, 5, 6} 인 경우 아래 내용이 순열이다.
  * {1, 5, 6}
  * {1, 6, 5}
  * {5, 1, 6}
  * {5, 6, 1}
  * {6, 1, 5}
  * {6, 5, 1}
</br>  

### 다음 순열(Next Permutation)
#### 1. A[i-1] < A[i]를 만족하는 가장 큰 i를 찾는다.
* arr={7, 2, 3, 6, 5, 4, 1} 인 경우
  * i-1 = 3
  * i=6
#### 2. A[j] > A[i-1] 를 만족하는 가장 작은 j를 찾는다.
* 다음 순열 : 724 6531 인데, i-1=3, j=4, 자리 변경, (i-1 < j && 뒤에 숫자들중 가장 작은 수) 
  * j=6   1 <= 3
  * j=5   4 <= 3	  
#### 3. A[i-1]과 A[j]를 swap 한다.
#### 4. A[i]부터 순열을 뒤집는다.
* i=3, j=6  => 6 54 1 => 1 54 6
* i=4, j=5  =? 1 54 6 => 1 45 6
* i=5, j=4 break;

```java
static boolean next_permutation() {
		// 1. A[i-1] < A[i]를 만족하는 가장 큰 i를 찾는다.
		int i = arr.length-1; // 맨 마지막 인덱스부터 비교하기 위한 설정
		
		while(i>0 && arr[i-1] >= arr[i]) {
			i--;
		}
		if(i<=0) {
			return false;
		}
		
		// 2. A[j] > A[i-1] 를 만족하는 가장 작은 j를 찾는다.
		int j = arr.length-1; // 맨 마지막 인덱스부터 비교하기 위한 설정
		while(arr[j] <= arr[i-1]) {
			j--;
		}
		
		// 3. A[i-1]과 A[j]를 swap 한다.
		swap(i-1, j);
		
		// 4. A[i]부터 순열을 뒤집는다.
		j = arr.length-1;
		while(i<j) {
			swap(i, j);
			i++;
			j--;
		}
		return true;
}
	
private static void swap(int idx1, int idx2) {
  int temp = arr[idx1];
  arr[idx1] = arr[idx2];
  arr[idx2] = temp;
}
```
