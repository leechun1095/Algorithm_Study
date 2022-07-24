// https://www.acmicpc.net/problem/11724
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

let [nodeCount, M] = Array.from(input.shift().split(' '), Number);
let arr = input.map(row => Array.from(row.split(' '), Number));
// console.log(nodeCount, arr);

const relations = Array.from(new Array(nodeCount + 1), () => []);
for (let i = 0; i < arr.length; i++) {
  const [start, end] = arr[i];
  relations[start].push(end);
  relations[end].push(start);
}
// console.log(relations);

const dfsVisited = Array.from(new Array(nodeCount + 1), () => false);
dfsVisited[0] = true;

let result = 0;
for (let i = 1; i < relations.length; i++) {
  if (dfsVisited.includes(false) && !dfsVisited[i]) {
    result++;
    dfsVisited[i] = true;
    dfs(relations[i]);
  }
}

// console.log(dfsVisited);
console.log(result)

function dfs(arr) {
  arr.forEach(node => {
    if (!dfsVisited[node]) {
      dfsVisited[node] = true;
      dfs(relations[node]);
    }
  });
}
