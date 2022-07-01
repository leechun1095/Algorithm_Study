// https://www.acmicpc.net/problem/6603
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

const numberArrs= [];
for (let i = 0; i < input.length - 1; i++) {
  const arr = Array.from(input[i].split(' '), Number);
  arr.shift();
  arr.sort((a, b) => a - b);
  numberArrs.push(arr);
}

numberArrs.forEach((numberArr, i) => {
  const result = combination(numberArr, 6);
  i !== 0 ? console.log() : null;
  result.forEach(r => console.log(r.join(' ')));
})

function combination(array, selectNumber) {
  const results = [];
  if(selectNumber === 1){
      return array.map((element) => [element]);
  }
  array.forEach((fixed, index, origin) => {
      const rest = origin.slice(index + 1);
      const selectedRestArrs = combination(rest, selectNumber - 1);
      const attached = selectedRestArrs.map(selectedRestArr => [fixed, ...selectedRestArr]);
      results.push(...attached);
  });
  return results;
}