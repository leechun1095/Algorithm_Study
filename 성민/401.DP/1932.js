/*
    위층 둘중 큰것 + 지금 값
 */

const input = `5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5`.split('\n').map(val => val.split(' ').map(Number));
// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(val => val.split(' ').map(Number));
main(input)
function main(Arr){
    let memo = [0,[Arr[1][0]]]

    for(let i =2; i<Arr.length; i++){
        memo[i] = [];
        for(let j = 0; j<Arr[i].length; j++){
            memo[i][j] = Math.max(memo[i-1][j-1] || 0, memo[i-1][j] || 0) + Arr[i][j]
        }
    }

    console.log(Math.max(...memo.pop()))
}
