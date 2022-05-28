/*
    [1,1,1,1,1,1,1,1,1,1];
    [1,2,3,4,5,6,7,8,9,10]
    
*/

const input = '3';

// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim();

main(+input);

function main(N){
    let memo = [1,1,1,1,1,1,1,1,1,1];
    for(let i =0; i<N-1; i++){
        let tmp = [memo[0]];
        for(let j = 1; j<10; j++){
            tmp[j] = (tmp[j-1] + memo[j])%10007
        }
        memo = tmp
    }

    console.log(memo.reduce((prev,val)=>(prev+val)%10007))
}