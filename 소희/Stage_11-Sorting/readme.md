# [boj] step 11. Sorting

### 18870. 좌표 압축 (node.js)

#### 내 풀이

```javascript
const solution = () => {
  const N = Number(input());
  let rank = 0;
  let prevIdx = 0;
  let arr = input()
    .split(" ")
    .map((elem, idx) => [idx, Number(elem)])
    .sort((a, b) => a[1] - b[1]);
  let result = arr
    .map((elem, idx) => {
      if (elem[1] == arr[prevIdx][1]) return [...elem, rank];
      rank++;
      prevIdx = idx;
      return [...elem, rank];
    })
    .sort((a, b) => a[0] - b[0])
    .map((elem) => elem[2]);
  console.log(result.join(" "));
};
```

1. 깂이 입력된 순서(index)를 배열에 저장해 두고,
2. 좌표 값을 기준으로 정렬한다.
3. 정렬 완료된 상태이므로 반복문을 사용해 rank를 매긴다. 이때 이전 값과 현재 값을 비교하여 중복되는 값일 경우 동일한 rank를 할당한다.

#### 개선한 풀이 - 이분탐색

```javascript
const solution = () => {
  const N = Number(input());
  let initArr = input().split(" ").map(Number);
  let rank = {};
  let results = [];
  let arr = Array.from(new Set([...initArr].sort((a, b) => a - b)));
  arr.forEach((value) => {
    rank[value] = binarySearch(0, arr.length, value);
  });
  initArr.forEach((value) => results.push(rank[value]));
  console.log(results.join(" "));

  function binarySearch(L, R, X) {
    let result = R;
    while (L <= R) {
      let mid = Math.floor((L + R) / 2);
      if (arr[mid] < X) {
        L = mid + 1;
      } else {
        result = mid;
        R = mid - 1;
      }
    }
    return result;
  }
};
```

- 정렬이 완료된 상태에서 이분탐색을 수행한다. 특정 좌표를 대상으로 이분탐색을 수행하여, 해당 좌표 보다 작은 좌표의 개수를 알아낼 수 있다.
- new Set()를 이용한 중복제거로 코드를 더 단순화했다. Set 객체 또한 forEach() 메서드를 쓸 수 있다. `forEach((value, key, set) => { /* ... */ } )`
