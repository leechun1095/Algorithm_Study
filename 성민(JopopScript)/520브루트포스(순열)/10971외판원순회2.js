// https://www.acmicpc.net/problem/10971
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

const N = Number(input.shift());
const map = input.map(row => Array.from(row.split(' '), Number));
const numberArr = Array.from(new Array(N), (x, i) => i);
// console.log(N, map, numberArr);

const allRoute = combination(numberArr, numberArr.length);
// console.log(allRoute)
let min = Number.MAX_SAFE_INTEGER;
allRoute.forEach(route => {
  let distance = 0;
  for (let i = 0; i < route.length; i++) {
    const start = route[i];
    const end = i === route.length - 1 ? route[0] : route[i + 1];
    distance = distance + map[start][end];
  }
  min > distance ? min = distance : null;
});

console.log(min)
function combination(array, selectNumber) {
  const results = [];
  if(selectNumber === 1){
      return array.map((element) => [element]);
  }
  array.forEach((fixed, index, origin) => {
    const rest = [...origin.slice(0, index), ...origin.slice(index + 1)];
      const selectedRestArrs = combination(rest, selectNumber - 1);
      const attached = selectedRestArrs.map(selectedRestArr => [fixed, ...selectedRestArr]);
      results.push(...attached);
  });
  return results;
}
