const [N,M] = `3 3`.split(' ').map(Number);

// const fs = require('fs');
// const [N,M] = fs.readFileSync('dev/stdin').toString().trim().split(' ').map(Number)

main(N,M);

function main(N,M){
    let result = '';
    const pool = []
    const find = (depth) =>{
        if(depth >= M){
            result += pool.join(' ')+'\n';
            return;
        }

        for(let i =1; i<=N; i++){
            pool.push(i);
            find(depth +1);
            pool.pop();
        }
    }

    find(0)

    console.log(result)
}
