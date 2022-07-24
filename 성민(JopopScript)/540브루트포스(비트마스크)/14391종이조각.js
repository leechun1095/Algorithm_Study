// https://www.acmicpc.net/problem/14391
// 아직 못풀었음
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

const [row, column] = Array.from(input.shift().split(' '), Number);
let numberMap = input.map(row => Array.from(row.split(''), Number));
// console.log(numberMap);

const concatMaps = [];
for (let i = 0; i < row; i++) {
  for (let j = 0; j < column; j++) {
    
  }
}


const rowSum = numberMap.map(numberRow => Number(numberRow.join('')))
                          .reduce((pre, cur) => pre + cur, 0);
let columnSum = 0;
for (let i = 0; i < column; i++) {
  let numberStr = '';
  for (let j = 0; j < row; j++) {
    numberStr = numberStr + `${numberMap[j][i]}`;
  }
  columnSum = columnSum + Number(numberStr);
}

console.log(Math.max(rowSum, columnSum));

// 4 3
// 000
// 000
// 999
// 999