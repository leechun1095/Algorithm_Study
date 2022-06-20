const [N,M] = `4 2`.split(' ').map(Number);

const fs = require('fs');
const [N,M] = fs.readFileSync('dev/stdin').toString().trim().split(' ').map(Number)

main(N,M);

function main(N,M){
    const used = new Array(N+1).fill(0);
    const pool = [];
    let result = '';

    const find = (depth,start) =>{
        if(depth >= M){
            result += pool.join(' ') + '\n'
            return;
        }
        for(let i =start; i<=N; i++){
            if(!used[i]){
                used[i] = 1;
                pool.push(i);
                find(depth+1,i);
                pool.pop();
                used[i] = 0;
            }
        }
    }

    find(0,1)

    console.log(result)
}