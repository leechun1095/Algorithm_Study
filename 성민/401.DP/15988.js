/*
1 : 1
2 : 1+1, 2
3 : 1+1+1, 2+1, 1+2, 3


4 : 3 + 1, 2 + 2, 1 + 3
*/

const [_,...input] = `3
4
7
10`.split('\n').map(Number)
// const fs = require('fs');
// const [_,...input] = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(Number);

main(input)
function main(Arr){
    const N = Math.max(...Arr);
    let result = [];
    const memo = [0,1,2,4];
    for(let i = 4; i<=N; i++){
        memo[i] = (memo[i-1] + memo[i-2] + memo[i-3])%1000000009;
    }

    for(let i = 0; i<Arr.length; i++){
        result.push(memo[Arr[i]])
    }


    console.log(result.join('\n'))
}


