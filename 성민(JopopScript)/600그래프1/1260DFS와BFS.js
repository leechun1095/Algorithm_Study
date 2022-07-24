// https://www.acmicpc.net/problem/1260
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

let [nodeCount, M, start] = Array.from(input.shift().split(' '), Number);
let arr = input.map(row => Array.from(row.split(' '), Number));
// console.log(nodeCount, start, arr);

const relations = Array.from(new Array(nodeCount + 1), () => []);
for (let i = 0; i < arr.length; i++) {
  const [start, end] = arr[i];
  relations[start].push(end);
  relations[end].push(start);
}

relations.forEach(relation => relation.sort((a, b) => a - b));
const startPoint = relations[start];
// console.log('relations');
// console.log(relations, startPoint);

const dfsResult = [start];
const bfsResult = [start];
const dfsVisited = Array.from(new Array(nodeCount + 1), () => false);
const bfsVisited = Array.from(new Array(nodeCount + 1), () => false);
dfsVisited[start] = true;
bfsVisited[start] = true;

dfs(startPoint);
bfs(startPoint);
console.log(dfsResult.join(' '));
console.log(bfsResult.join(' '));


function dfs(arr) {
  arr.forEach(node => {
    if (!dfsVisited[node]) {
      dfsVisited[node] = true;
      dfsResult.push(node);
      dfs(relations[node]);
    }
  });
}

function bfs(arr) {
  while(arr.length > 0) {
    const popedNode = arr.shift();
    if (!bfsVisited[popedNode]) {
      bfsVisited[popedNode] = true;
      bfsResult.push(popedNode);
      arr.push(...relations[popedNode]);
    }
  }
}