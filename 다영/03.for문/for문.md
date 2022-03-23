# for문

|no|문제|풀이|
|---|----|----|
|1|[구구단](https://www.acmicpc.net/problem/2739)|[2739.js](src/2739.js)|
|2|[A+B-3](https://www.acmicpc.net/problem/10950)|[10950.js](src/10950.js)|
|3|[합](https://www.acmicpc.net/problem/8393)|[8393.js](src/8393.js)|
|4|[빠른 A+B](https://www.acmicpc.net/problem/15552)|[15552.js](src/15552.js)|
|5|[N 찍기](https://www.acmicpc.net/problem/2741)|[2741.js](src/2741.js)|
|6|[기찍 N](https://www.acmicpc.net/problem/2742)|[2742.js](src/2742.js)|
|7|[A+B-7](https://www.acmicpc.net/problem/11021)|[11021.js](src/11021.js)|
|8|[A+B-8](https://www.acmicpc.net/problem/11022)|[11022.js](src/11022.js)|
|9|[별 찍기-1](https://www.acmicpc.net/problem/2438)|[2438.js](src/2438.js)|
|10|[별 찍기-2](https://www.acmicpc.net/problem/2439)|[2439.js](src/2439.js)|
|11|[X보다 작은 수](https://www.acmicpc.net/problem/10871)|[10871.js](src/10871.js)|


## 새롭게 알게 된 것
### js의 for문

```javascript
let n = parseInt(inputData[0])

for (let i = 1; i < 10; i++) {
    console.log('%d * %d = %d', n, i, n*i)
}
```

### js string 반복 출력
```javascript
"*".repeat(3) // "***"

Array(5).join("*") // "*****"

```

### 15552. 빠른 A+B

#### 시도했으나 실패한 코드
```javascript
const fs = require('fs')
let inputData = fs.readFileSync('/dev/stdin').toString().split('\n')

let t = parseInt(inputData[0])
let a, b
for (let i=1; i<=t; i++) {
    a = parseInt(inputData[i].split(' ')[0])
    b = parseInt(inputData[i].split(' ')[1])

    console.log('%d', a+b)
}
```
- 시간 초과 실패

#### 문제를 해결한 코드
```javascript
const fs = require('fs')
let inputData = fs.readFileSync('/dev/stdin').toString().split('\n')

let t = parseInt(inputData[0])
let a, b
for (let i=1; i<=t; i++) {
    a = parseInt(inputData[i].split(' ')[0])
    b = parseInt(inputData[i].split(' ')[1])

    console.log('%d', a+b)
}
```
- [참고한 블로그](https://laycoder.tistory.com/160)
- 매 번 console.log로 출력하면 시간초과를 받으나 하나의 문자열에 결과값과 개행문자를 저장하고 출력하면 통과.
