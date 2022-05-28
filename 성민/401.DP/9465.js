/*
    0   1   2
    [ox][xo][xx]
    동물원이랑 비슷
 */
// const input = `2
// 5
// 50 10 100 20 40
// 30 50 70 10 60
// 7
// 10 30 10 50 100 20 40
// 20 40 30 50 60 20 80`.split('\n');

const fs = require("fs");
const input = fs.readFileSync("dev/stdin").toString().trim().split("\n");
let cases = Number(input.shift());
let j = 0;
for(let i =0; i<cases; i++){
    let tmp = [];
    let N = +input[j++];
    tmp[0] = input[j++].split(' ').map(Number);
    tmp[1] = input[j++].split(' ').map(Number);
    main(N,tmp);
}
function main(N,Arr){
    let memo = [Arr[0][0],Arr[1][0],0]

    for(let i =1; i<N; i++){
        let tmp = [];
        tmp[0] = Math.max(memo[1],memo[2]) + Arr[0][i];
        tmp[1] = Math.max(memo[0],memo[2]) + Arr[1][i];
        tmp[2] = Math.max(memo[0],memo[1],memo[2]);
        memo = tmp
    }

    console.log(Math.max(...memo))
}