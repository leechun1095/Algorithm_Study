const input = `6
10 30 10 20 20 10`.split('\n').map(val=>val.split(' ').map(Number));
// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(val=>val.split(' ').map(Number))
main(input[1])
function main(Arr){
    let memo = new Array(Arr.length).fill(1);
    for(let i = 1; i<Arr.length; i++){
        let candi = 0;
        for(let j = i-1; j >= 0; j--){
            if(Arr[i] < Arr[j] && candi < memo[j]){
                candi = memo[j];
            }
        }
        memo[i] = candi +1;
    }

    console.log(Math.max(...memo))
}