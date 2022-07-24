// https://www.acmicpc.net/problem/1707
// 틀렸습니다!!!!!!!!!!!!!!!!!!!!!!!!!
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

const K = Number(input.shift());

for (let i = 0; i < K; i++) {
// for (let i = 0; i < 1; i++) {
  let [nodeCount, relationCount] = Array.from(input.shift().split(' '), Number);
  let arr = input.slice(0, relationCount).map(row => Array.from(row.split(' '), Number));
  input = input.slice(relationCount);
  const isBinary = loop(nodeCount, relationCount, arr);
  console.log(isBinary);
}

function loop(nodeCount, relationCount, arr) {
  // console.log(nodeCount, relationCount, arr);
  const relations = Array.from(new Array(nodeCount + 1), () => []);
  for (let i = 0; i < arr.length; i++) {
    const [start, end] = arr[i];
    relations[start].push(end);
    relations[end].push(start);
  }
  const binaryArr = Array.from(new Array(nodeCount + 1), () => null);
  binaryArr[0] = true;
  // console.log('relations', relations);
  // console.log('binaryArr', binaryArr);

  for (let i = 0; i < relations.length; i++) {
    const relation = relations[i];
    // console.log('relation', relation);
    const isBinary = bfs(relation, binaryArr, binaryArr[i]);
    if (!isBinary) {
      console.log('isBinary', isBinary)
      return 'NO';
    }
  }
  return 'YES';
  function bfs(relation, binaryArr, preBinary) {
    for (let i = 0; i < relation.length; i++) {
      const element = relation[i];
      if (preBinary === null) {
        return true;
      }
      if (binaryArr[node] === null) {
        binaryArr[node] = !preBinary;
        const isBinary = relations[node].every(relationNode => binaryArr[relationNode] === binaryArr[i]);
        if (!isBinary) {
          return false;
        }
      }
    }
    return true;
  }
}