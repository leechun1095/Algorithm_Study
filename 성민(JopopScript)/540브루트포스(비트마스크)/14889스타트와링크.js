// https://www.acmicpc.net/problem/14889
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

const N = Number(input.shift());
let abilityMap = input.map(row => Array.from(row.split(' '), Number));
// console.log(N);
// console.log(abilityMap);

const people = Array.from(new Array(N), (x, i) => i);
const peopleCombinations = combination(people, N / 2);

let result = Number.MAX_SAFE_INTEGER;
peopleCombinations.forEach(peopleCombination => {
  const peopleCombination2 = people.filter(p => !peopleCombination.includes(p));
  // console.log(peopleCombination, getAbility(peopleCombination, abilityMap));
  // console.log(peopleCombination2, getAbility(peopleCombination2, abilityMap));
  const dif = Math.abs(getAbility(peopleCombination, abilityMap) - getAbility(peopleCombination2, abilityMap));
  if (dif < result) {
    result = dif;
  }
})
console.log(result)
function getAbility(people, abilityMap) {
  const duos = combination(people, 2);
  return duos.reduce((preSum, curDuo) => {
    return preSum + abilityMap[curDuo[0]][curDuo[1]] + abilityMap[curDuo[1]][curDuo[0]]
  }, 0)
}

function combination(array, selectNumber) {
  const results = [];
  if(selectNumber === 1) {
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