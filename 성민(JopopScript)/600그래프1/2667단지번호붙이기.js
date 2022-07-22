// https://www.acmicpc.net/problem/2667
// 틀렸습니다!!!!!!!!!!!!!!!!!!!!!!!!!!
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

const N = Number(input.shift());
let arr = input.map(row => Array.from(row.split(''), Number));
// console.log(N, arr);

const visit = arr.map(row => row.map(ele => ele === 0 ? true : false));
// console.log(visit);

const bfs = (i, j, result) => {
    const newresult = [];
    //위
    if (i - 1 > -1 && visit[i - 1][j] === false) {
        visit[i - 1][j] = true;
        newresult.push(`${i - 1}${j}`);
        newresult.push(...bfs(i - 1, j, result));
    }
    //아래
    if (i + 1 < N && visit[i + 1][j] === false) {
        visit[i + 1][j] = true;
        newresult.push(`${i + 1}${j}`);
        newresult.push(...bfs(i + 1, j, result));
    }
    //왼쪽
    if (j - 1 > -1 && visit[i][j - 1] === false) {
        visit[i][j - 1] = true;
        newresult.push(`${i}${j - 1}`);
        newresult.push(...bfs(i, j - 1,  result));
    }
    //오른쪽
    if (j + 1 < N && visit[i][j + 1] === false) {
        visit[i][j + 1] = true;
        newresult.push(`${i}${j + 1}`);
        newresult.push(...bfs(i, j + 1,  result));
    }
    return [...result, ...newresult];
}

const result = []; 
for (let i = 0; i < N; i++) {
    for (let j = 0; j < N; j++) {
        if (!visit[i][j]) {
            const loopResult = bfs(i, j, []);
            result.push(loopResult);
            // console.log(loopResult);
        }
    }
}
console.log(result.length);
const sortresult = result.map(r => r.length);
sortresult.sort((a, b) => a - b);
sortresult.forEach(r => console.log(r));

