/*
    첫 dp = 전체 경우
    두번째 dp = 내가 안들어간 경우(즉 첫 dp[i-1]), 이전값 + 지금
 */

const input = `10
10 -4 3 1 5 6 -35 12 21 -1`.split('\n').map(val=>val.split(' ').map(Number))
const fs = require('fs');
const input = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(val=>val.split(' ').map(Number))
main(input[1])
function main(Arr){
    let memo1 = [Arr[0]];
    let memo2 = [Arr[0]];
    for(let i =1; i<Arr.length; i++){
        memo1[i] = Math.max(memo1[i-1] + Arr[i],Arr[i])
        memo2[i] = Math.max(memo1[i-1],memo2[i-1] + Arr[i])
    }
    console.log(Math.max(...memo1,...memo2))
}