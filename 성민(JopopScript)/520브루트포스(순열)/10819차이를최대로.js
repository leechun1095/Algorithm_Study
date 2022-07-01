// https://www.acmicpc.net/problem/10819
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

const N = Number(input[0]);
const numberArr = Array.from(input[1].split(' '), Number).sort((a, b) => a - b);

const case1 = getArr(numberArr, N, -2);
const case2 = getArr(numberArr, N, 2);
// console.log(case1, case2)
const sum1 = getSum(case1);
const sum2 = getSum(case2);
console.log(Math.max(sum1, sum2))
function getSum(arr) {
  let sum = 0;
  for (let j = 0; j < arr.length - 1; j++) {
    sum = sum + Math.abs(arr[j] - arr[j + 1]);
  }
  return sum;
}
function getArr(Arr, N, max) {
  const numberArr = [...Arr];
  let maxPop = max;
  let newArr = max === -2 ? [numberArr.shift()] : [numberArr.pop()];
  // console.log(newArr, numberArr)
  for (let i = 0; i < N - 1; i++) {
    if (maxPop === -2) {
      newArr.push(numberArr.pop());
      maxPop = 1;
    } else if (maxPop === 1) {
      newArr.unshift(numberArr.pop());
      maxPop++;
    } else if (maxPop === 2) {
      newArr.push(numberArr.shift());
      maxPop = -1;
    } else if (maxPop === -1) {
      newArr.unshift(numberArr.shift());
      maxPop--;
    }
  }
  return newArr;
}


// // https://www.acmicpc.net/problem/10819
// const fs = require('fs');
// let input;
// (process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

// const N = Number(input[0]);
// const numberArr = Array.from(input[1].split(' '), Number).sort((a, b) => a - b);
// console.log(N, numberArr);

// const arrays = combination(numberArr, N);
// // console.log(arrays)
// let max = 0;
// for (let i = 0; i < arrays.length; i++) {
//   let sum = 0;
//   for (let j = 0; j < arrays[i].length - 1; j++) {
//     sum = sum + Math.abs(arrays[i][j] - arrays[i][j + 1]);
//   }

//   if (max < sum) {
//     max = sum;
//     console.log(sum, arrays[i])
//   }
// }
// console.log(max)


// function combination(array, selectNumber) {
//   const results = [];
//   if(selectNumber === 1){
//       //array로 들어온 배열 원소 중에 한개만 뽑는경우에 하나를 배열로 만들어서 return
//       return array.map((element) => [element]);
//   }
//   array.forEach((fixed, index, origin) => {
//       //자기자신을 fixed로 삭제한 rest 배열을 만든다
//       const rest = [...origin.slice(0, index), ...origin.slice(index + 1)];
//       //3개를 뽑아야했다면 fixed를 한개 뽑았음으로 rest배열에서 2개만 뽑는다
//       const selectedRestArrs = combination(rest, selectNumber - 1);
//       //fixed와 combination으로 추출한 배열을 합쳐서 답으로 내보냄
//       const attached = selectedRestArrs.map(selectedRestArr => [fixed, ...selectedRestArr]);
//       results.push(...attached);
//   });
//   return results;
// }