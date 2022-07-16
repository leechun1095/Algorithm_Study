// https://www.acmicpc.net/problem/1182
// 틀렸습니다!!!!
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

let [N, S] = Array.from(input.shift().split(' '), Number);
let arr = Array.from(input.shift().split(' '), Number);
// console.log(N, S, arr);
const sum = arr => arr.reduce((pre, cur) => pre + cur, 0);

let result = 0;
for (let start = 0; start < N; start++) {
  for (let end = start; end < N; end++) {
    if (sum(arr.slice(start, end + 1)) === S) {
      result++;
    }
  }
}
console.log(result)


// let result = 0;
// if (S < 0) {
//   S = S * (-1);
//   arr = arr.map(i => i * -1).sort((a, b) => a - b);
// }
// // console.log(N, S, arr);

// for (let i = 0; i < N; i++) {
//   // -7 -3 -2 5 8
//   // -3 -2 5 8
//   //--2 5 8 ...
//   // console.log(i, sum(arr.slice(i)))
//   if (sum(arr.slice(i)) < S) {
//     continue;
//   }
//   for (let j = i; j < N; j++) {
//     //-7
//     //-7 -3
//     //-7 -3 -2 ...
//     if (arr[j + 1] < 0) {
//       continue;
//     }
//     const newArr = arr.slice(i, j + 1);
//     if (sum(newArr) === S) {
//       // console.log(newArr)
//       result++;
//       break;
//     } else if (sum(newArr) > S) {
//       break;
//     }
//   }
// }
// console.log(result)
