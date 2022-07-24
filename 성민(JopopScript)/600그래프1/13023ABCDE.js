// https://www.acmicpc.net/problem/13023
// 시간초과!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
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
  // const i = 0;
  const stack = [...relations[i]];
  const visit = Array.from(new Array(N), () => false);
  visit[i] = true;
  // console.log('stack',stack, 'visit', visit);
  const depth = dfs(relations[i], visit, 0);
  // console.log('depth',depth);
  if (depth > 3) {
    console.log(1);
    process.exit();
  }
}
console.log(0);


function dfs(arr, visit, depth) {
  // console.log('loop',depth, 'visit',visit, 'stack', stack)
  if (depth > 3) {
    console.log(1);
    process.exit();
  }

  let maxDepth = depth;
  for (let i = 0; i < arr.length; i++) {
    if (visit[arr[i]]) {
    } else {
      visit[arr[i]] = true;
      const thisloopDepth = dfs(relations[arr[i]], [...visit], depth + 1);
      maxDepth = maxDepth < thisloopDepth ? thisloopDepth : maxDepth;
    }
  }
  return maxDepth;
}