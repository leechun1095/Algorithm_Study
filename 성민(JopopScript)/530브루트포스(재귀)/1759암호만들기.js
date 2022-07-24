// https://www.acmicpc.net/problem/1759
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

const [L, C] = Array.from(input.shift().split(' '), Number);
const charArr = input.shift().split(' ');
console.log(L, C, charArr);

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