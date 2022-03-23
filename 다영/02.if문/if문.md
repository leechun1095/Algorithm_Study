# if문

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