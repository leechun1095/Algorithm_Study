// https://www.acmicpc.net/problem/1707
// 실패!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

const K = Number(input.shift());

for (let i = 0; i < K; i++) {
  let [nodeCount, relationCount] = Array.from(input.shift().split(' '), Number);
  let arr = input.slice(0, relationCount).map(row => Array.from(row.split(' '), Number));
  input = input.slice(relationCount);
  loop(nodeCount, relationCount, arr);
}

function loop(nodeCount, relationCount, arr) {
  // console.log(nodeCount, relationCount, arr);
  const relations = Array.from(new Array(nodeCount + 1), () => []);
  for (let i = 0; i < arr.length; i++) {
    const [start, end] = arr[i];
    relations[start].push(end);
    relations[end].push(start);
  }
  console.log('relations', relations);

  let isBynary = true;
  relations.forEach((relation, index) => {
    console.log('relation', relation);
    relation.forEach(r => {
      console.log('r', r, relations[r]);
      // relations[r].includes(r);
        isBynary = false;
    }
    );
  });
  isBynary ? console.log('YES') : console.log('NO');
}