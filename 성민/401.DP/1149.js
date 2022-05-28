/*
집은 최소 두개나옴

N번째 집을 파랑으로 칠하는 최소는 N-1번 집을 빨강,초록 으로 칠한값중 작은것과 더한것
*/


const [_,...input] = `8
71 39 44
32 83 55
51 37 63
89 29 100
83 58 11
65 13 15
47 25 29
60 66 19`.split('\n');
// const fs = require('fs');
// const [_,...input] = fs.readFileSync('dev/stdin').toString().trim().split('\n');
main(input.map(val=>val.split(' ').map(Number)))
function main(map){
    let memo = [map[0]];
    for(let i =1; i<map.length; i++){
        memo[i] = [];
        for(let j = 0; j<3; j++){
            memo[i][j] = map[i][j] + Math.min(memo[i-1][(j+1)%3], memo[i-1][(j+2)%3])
        }
    }

    console.log(Math.min(...memo[memo.length-1]))
}