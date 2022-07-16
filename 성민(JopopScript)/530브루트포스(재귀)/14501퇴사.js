// https://www.acmicpc.net/problem/14501
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

const days = Number(input.shift());
const arr = input.map(row => Array.from(row.split(' '), Number));
// console.log(days, arr);

const daySets = combination(arr);
console.log('=========================')
console.log(daySets)
let max = 0;
daySets.forEach(daySet => {
  const sum = daySet.reduce((pre, cur) => pre + cur[1], 0);
  // console.log(daySet, sum)
  if(max < sum) {
    // console.log(true)
    max = sum;
  }
})
console.log(max)

function combination(array) {
  const results = [];
  // console.log('===========',array, array[0])
  // if (array.length === 0) { return }
  if(array[0][0] > array.length) {
    console.log(1, array[0][0])
    return [];
  } else if (array[0][0] === array.length) {
    console.log(2, array[0][0])
    return [array[0]];
  }
  array.forEach((fixed, index, origin) => {
      const rest = origin.slice(index + fixed[0]);
      if (rest.length === 0) {
        results.push(fixed);
      } else {
        const selectedRestArrs = combination(rest);
        const attached = selectedRestArrs.map(selectedRestArr => [fixed, ...selectedRestArr]);
        console.log('attached', attached)
        results.push(...attached);
      }
  });
  return results;
}
