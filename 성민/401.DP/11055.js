/*
    이중 for
    이전 값이 더 작은것들중 최대 memo값이랑 현재 값 더한게 지금까지 만들수 있는 최대값
 */
const input = `10
1 100 2 50 60 3 5 6 7 8`.split('\n').map(val=>val.split(' ').map(Number))
// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(val=>val.split(' ').map(Number))
main(input[1])
function main(Arr){
    let memo = [...Arr];

    for(let i = 1; i<Arr.length; i++){
        let candi = 0;
        for(let j = i-1; j >= 0; j--){
            if(Arr[i] > Arr[j] && memo[j] > candi){
                candi = memo[j];
            }
        }
        memo[i] = candi + Arr[i];
    }

    console.log(Math.max(...memo))
}