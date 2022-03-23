# if문

|no|문제|풀이|
|---|----|----|
|1|[두 수 비교하기](https://www.acmicpc.net/problem/1330)|[1330.js](src/1330.js)|
|2|[시험 성적](https://www.acmicpc.net/problem/9498)|[9498.js](src/9498.js)|
|3|[윤년](https://www.acmicpc.net/problem/2753)|[2753.js](src/2753.js)|
|4|[사분면 고르기](https://www.acmicpc.net/problem/14681)|[14681.js](src/14681.js)|
|5|[알람 시계](https://www.acmicpc.net/problem/2884)|[2884.js](src/2884.js)|
|6|[오븐 시계](https://www.acmicpc.net/problem/2525)|[2525.js](src/2525.js)|
|7|[주사위 세개](https://www.acmicpc.net/problem/2480)|[2480.js](src/2480.js)|

## 새롭게 알게 된 것
### js의 if문

```javascript
const A = 1
const B = 2

if (A>B) {
    console.log('>')
} else if(A<B) {
    console.log('<')
} else {
    console.log('==')
}
```


### js의 논리연산자
- `&&` : AND
- `||` : OR
- `!` : NOT

### js 변수 선언 (var vs const)
#### var
- 재할당 **가능**
- 재선언 **가능**

```javascript
var a = 'js'
console.log(a) // 'js'

a = 'javascript' // 재할당
console.log(a) // 'javascript'

var a = 'javascript' // 재선언
console.log(a) // 'javascript'
```

#### let
- 재할당 **가능**
- 재선언 **불가**

```javascript
let a = 'js'
console.log(a) // 'js'

a = 'javascript' // 재할당
console.log(a) // 'javascript'

let a = 'javascript' // 재선언
console.log(a) // Error!
```

#### const
- 재할당 **불가**
- 재선언 **불가**

```javascript
let a = 'js'
console.log(a) // 'js'

a = 'javascript' // 재할당
console.log(a) // Error!

let a = 'javascript' // 재선언
console.log(a) // Error!
```

### 최댓값 구하기
```javascript
let max_num = Math.max(A,B,C)
```