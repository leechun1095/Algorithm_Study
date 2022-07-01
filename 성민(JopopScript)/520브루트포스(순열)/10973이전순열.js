// https://www.acmicpc.net/problem/10973
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

const N = Number(input[0]);
const numberArr = Array.from(input[1].split(' '), Number);
const startArr = Array.from(input[1].split(' '), Number).sort((a, b) => a - b);
// console.log(N, numberArr, startArr);

// 마지막 케이스인 경우
let samCount = 0;
for (let i = 0; i < N; i++) {
  if(numberArr[i] === startArr[i]) samCount++;
}
if (samCount === N) {
  console.log(-1);
  return;
}

//마지막 두개를 바꾸는게 그다음 케이스인 경우
if (numberArr[N - 1] < numberArr[N - 2]) {
  // console.log(numberArr[N - 1], numberArr[N - 2])
  let last = numberArr[N - 1];
  numberArr[N - 1] = numberArr[N - 2];
  numberArr[N - 2] = last;
  // console.log(numberArr);
  console.log(numberArr.join(' '));
  return;
}

// 그외 왼쪽에서보면 내림차순, 오른쪽에서보면 오름차순, 오름차순 끝에서 뭔짓을 하자
let ascStartIndex;
for (let i = N - 1; i > 0; i--) {
  if (numberArr[i] < numberArr[i - 1]) {
    ascStartIndex = i - 1;
    // console.log('i', i - 1, 'ele', numberArr[i - 1])
    break;
  }
}

const ascArr = numberArr.slice(ascStartIndex + 1);
// 오름차순 부분에서 바꿀 숫자 찾기
let changeNumber = 0;
for (let i = 0; i < ascArr.length; i++) {
  if (numberArr[ascStartIndex] > ascArr[i] && changeNumber < ascArr[i]) {
    changeNumber = ascArr[i];
  }  
}

// 바꿀숫자와 내림차순 시작부분 숫자 교체 후 내림차순 정렬
const restArr = ascArr.filter(e => e != changeNumber);
restArr.push(numberArr[ascStartIndex]);
restArr.sort((a, b) => b - a);

const result = [...numberArr.slice(0, ascStartIndex), changeNumber, ...restArr].join(' ');

console.log(result)
// // console.log(numberArr.slice(0, descStartIndex))
// // console.log(changeNumber)
// // console.log(restArr)