// https://www.acmicpc.net/problem/13023
// 실패!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

let [N, M] = Array.from(input.shift().split(' '), Number);
let arr = input.map(row => Array.from(row.split(' '), Number));
// console.log(N, M, arr);

const relations = Array.from(new Array(N), () => []);
for (let i = 0; i < arr.length; i++) {
  const [start, end] = arr[i];
  relations[start].push(end);
  relations[end].push(start);
}
// console.log(relations);

for (let i = 0; i < N; i++) {
  const len = search(i);
  
  
}
function search(i) {
  relations[i]
}