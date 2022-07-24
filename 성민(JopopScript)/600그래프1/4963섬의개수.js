// https://www.acmicpc.net/problem/4963
// 예전에 풀었었던 코드
const dx = [1, 1, 0, -1, -1, -1, 0, 1];
const dy = [0, 1, 1, 1, 0, -1, -1, -1];

const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');
while(true) {
    const firstLine = Array.from(input.shift().split(' '), Number);
    if (firstLine[0] === 0 && firstLine[1] === 0) break;
    
    const map = [];
    for (let i = 0; i < firstLine[1]; i++) {
        map.push(Array.from(input.shift().split(' '), Number));
    }
    console.log(oneCycle(firstLine, map));
}

// const re = oneCycle(firstLine, map);
// console.log(re)

function oneCycle(firstLine, map) {
    console.log(firstLine, map);
    const lands = [];
    for (let i = 0; i < firstLine[1]; i++) {
        for (let j = 0; j < firstLine[0]; j++) {
            if(map[i][j] === 1) lands.push([i, j]);
        }
    }
    // console.log(map);
    // console.log(lands);

    const visited = [];
    let landCount = 0;
    while(true) {
        if(lands.length === 0) break;
        const land = lands.pop();
        if (visited.some(visit => visit[0] === land[0] && visit[1] === land[1])) continue;
        visited.push(land);
        landCount++;
    
        let queue = [land];
        while(true) {
            if(queue.length === 0) break;
            const popedLand = queue.pop();
            const newQueue = [];
            for (let i = 0; i < 8; i++) {
                const x = popedLand[0] + dx[i];
                const y = popedLand[1] + dy[i];
                    
                if (x > -1 && y > -1 && x < firstLine[1] && y < firstLine[0] && map[x][y] === 1 && !visited.some(visit => visit[0] === x && visit[1] === y)) {
                    visited.push([x, y]);
                    newQueue.push([x, y]);
                }
            }
            queue = [...queue, ...newQueue];
        }
    }
    return landCount;
}