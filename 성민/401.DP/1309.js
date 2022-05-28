/*
    dp = [ox로 끝나는거, xo로 끝나는거, xx로 끝나는거]
    다음 dp[ox로 끝나는거] = 이전 dp[xo로 끝나는거, xx로 끝나는거]
    다음 dp[xo로 끝나는거] = 이전 dp[ox로 끝나는거, xx로 끝나는거] 
    다음 dp[xx로 끝나는거] = 이전 dp[ox로 끝나는거, xo로 끝나는거, xx로 끝나는거] 
*/

const input = `4`
// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim();

main(+input);

function main(N){
    let memo = [1,1,1];

    //memo가 N = 1부터 시작이라 N-1 까지
    for(let i =0; i<N-1; i++){
        let tmp = [];
        tmp[0] = (memo[1] + memo[2])%9901;
        tmp[1] = (memo[0] + memo[2])%9901;
        tmp[2] = (memo[0] + memo[1] + memo[2])%9901;
        memo = tmp;
    }

    console.log(memo.reduce((prev,now)=>(prev+now)%9901))
}