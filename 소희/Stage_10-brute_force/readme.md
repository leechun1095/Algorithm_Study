# [boj] step 10. brute-force

#### 배운 점

- 완전 탐색 문제 풀이를 위해 재귀함수를 활용하는 것도 좋지만, 문제에서 제시된 시간 복잡도를 확인했을 때 무리가 가지 않는다면! 이중, 삼중 for 문을 활용하는 것이 가장 직관적이고 빠른 풀이법일 때도 있다! (풀이법이 직관적이고 - 시간제한이 넉넉한 경우)

### 2798. 블랙잭

- 카드의 합 최대화하기
- 중복이 허용되지 않는 완전 탐색

#### 핵심 알고리즘

```javascript
function rec(k, sum) {
  if (sum > M) return false;
  if (k + 1 > 3) return sum;
  for (let i = 0; i < N; i++) {
    if (used[i]) continue;
    used[i] = 1;
    let temp = rec(k + 1, sum + arr[i]);
    used[i] = 0;
    if (!temp) continue;
    result = Math.max(temp, result);
  }
}
```

- 재귀 함수 호출, `rec(0, 0)` 조건을 만족하는 경우 답을 갱신
- 중복을 허용하지 않으므로 used 배열을 이용해 사용 여부를 마크

#### 유의

- 재귀 호출의 종료(return) 조건을 2가지로 나눠 볼 수 있다.
  - 1. 합이 M을 넘으면 종료
  - 2. 카드의 개수가 3장을 초과시 종료
- 1번 조건에 의한 종료는 답의 후보가 될 수 없으므로 false를 반환하여 답의 갱신을 막는다.
- 2번 조건에 의한 종료는 1번 조건에 의해 종료되지 않은 값이므로 답의 후보가 될 수 있다.
