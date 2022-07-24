// https://www.acmicpc.net/problem/9095
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

const T = Number(input.shift());
const tArr = Array.from(new Array(T), (x, i) => i + 1);
const numberArr = Array.from(input, Number);
// console.log(T, tArr, numberArr)

function recur(init, n) {
  let count = 0;
  tArr.forEach(t => {
    if (t + init < n) {
      count = count + recur(t + init, n);
    } else if (t + init === n) {
      count++;
    }
  });
  return count
}

numberArr.forEach(number => console.log(recur(0, number)));