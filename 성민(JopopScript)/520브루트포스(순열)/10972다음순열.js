// https://www.acmicpc.net/problem/10972
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

const N = Number(input[0]);
const numberArr = Array.from(input[1].split(' '), Number);
const lastArr = Array.from(input[1].split(' '), Number).sort((a, b) => b - a);
// console.log(N, numberArr, lastArr);

// 마지막 케이스인 경우
let samCount = 0;
for (let i = 0; i < N; i++) {
  if(numberArr[i] === lastArr[i]) samCount++;
}
if (samCount === N) {
  console.log(-1);
  return;
}

//마지막 두개를 바꾸는게 그다음 케이스인 경우
if (numberArr[N - 1] > numberArr[N - 2]) {
  // console.log(numberArr[N - 1], numberArr[N - 2])
  let last = numberArr[N - 1];
  numberArr[N - 1] = numberArr[N - 2];
  numberArr[N - 2] = last;
  // console.log(numberArr);
  console.log(numberArr.join(' '));
  return;
}

// 그외 왼쪽에서보면 오름차순, 오른쪽에서보면 내림차순, 내림차순 끝에서 뭔짓을 하자
let descStartIndex;
for (let i = N - 1; i > 0; i--) {
  if (numberArr[i] > numberArr[i - 1]) {
    descStartIndex = i - 1;
    // console.log('i', i - 1, 'ele', numberArr[i - 1])
    break;
  }
}

const descArr = numberArr.slice(descStartIndex + 1);
// 내림차순 부분에서 바꿀 숫자 찾기
let changeNumber = Number.MAX_SAFE_INTEGER;
for (let i = 0; i < descArr.length; i++) {
  if (numberArr[descStartIndex] < descArr[i] && changeNumber > descArr[i]) {
    changeNumber = descArr[i];
  }  
}

// 바꿀숫자와 내림차순 시작부분 숫자 교체 후 오름차순 정렬
const restArr = descArr.filter(e => e != changeNumber);
restArr.push(numberArr[descStartIndex]);
restArr.sort((a, b) => a - b);

const result = [...numberArr.slice(0, descStartIndex), changeNumber, ...restArr].join(' ');

console.log(result)
// console.log(numberArr.slice(0, descStartIndex))
// console.log(changeNumber)
// console.log(restArr)