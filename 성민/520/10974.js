const input = '3'

const fs = require('fs');
const input= fs.readFileSync('dev/stdin').toString().trim()

main(+input)
function main(N){
    const pool = []
    const used = new Array(N+1).fill(false);
    let result = ''
    const find = (depth) =>{
        if(depth === N){
            result += pool.join(' ') + '\n';
            return;
        }
        for(let i =1; i<=N; i++){
            if(!used[i]){
                used[i] = true;
                pool.push(i);
                find(depth+1);
                pool.pop();
                used[i] = false;
            }
        }
    }

    find(0);

    console.log(result)
}