// https://www.acmicpc.net/problem/2529
// Maximum call stack size exceeded
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

const count = Number(input.shift());
const arr = input.shift().split(' ');
// console.log(count, arr);

const initNumber = Array.from(new Array(count + 1), (x, i) => i);
// console.log(initNumber)
const numberCombinations = combination(initNumber, count + 1);
// console.log(numberCombinations)
const filteredCombinations = numberCombinations.filter(numberCombination => {
  for (let i = 0; i < arr.length; i++) {
    // console.log(numberCombination[i], arr[i], numberCombination[i + 1])
    if (arr[i] === '>' && (numberCombination[i] < numberCombination[i + 1])) {
      // console.log(false)
      return false;
    } else if (arr[i] === '<' && (numberCombination[i] > numberCombination[i + 1])) {
      // console.log(false)
      return false;
    }
  }
  // console.log(true)
  return true;
})
// console.log(filteredCombinations)
// console.log(count, '==========')
const result = []
for (let i = 0; i < 10 - count; i++) {
  result.push(filteredCombinations.map(filteredCombination => filteredCombination.map(ele => ele + i)));
}
// 0
// 10 - 1 - count
const numbers = result.flat().map(i => i.join(''))
let max = 0;
let min = Number.MAX_SAFE_INTEGER;
for (let i = 0; i < numbers.length; i++) {
  if(max < numbers[i]) {
    max = numbers[i];
  }
  if(min > numbers[i]) {
    min = numbers[i];
  }
}
// console.log(numbers)
console.log(max)
console.log(min)

function combination(array, selectNumber) {
  const results = [];
  if(selectNumber === 1) {
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