/*
    case 1 : oxoo
    case 2 : oxo
    case 3 : 안마심
 */

const input = `6
6
10
13
9
8
1`.split('\n').map(Number);

// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(Number);
input.shift();

main(input);

function main(Arr){
    if(Arr.length < 3){
        console.log(Arr[0] + (Arr[1] || 0))
        return
    }
    const memo = [Arr[0], Arr[0] + Arr[1]];

    for(let i =2; i<Arr.length; i++){
        let candi1 = (memo[i-3] || 0) + Arr[i-1] + Arr[i];
        let candi2 = memo[i-2] + Arr[i];
        let candi3 = memo[i-1];
        memo[i] = Math.max(candi1,candi2,candi3)
    }

    console.log(memo.pop())
}