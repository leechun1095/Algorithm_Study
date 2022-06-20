const [N,M] = `4 2`.split(' ').map(Number);

// const fs = require('fs');
// const [N,M] = fs.readFileSync('dev/stdin').toString().trim().split(' ').map(Number)

main(N,M);

function main(N,M){
    let result = '';
    const pool =[];

    const find = (depth,start) =>{
        if(depth >= M){
            result += pool.join(' ')+ '\n';
            return;
        }

        for(let i = start; i<=N; i++){
            pool.push(i);
            find(depth+1,i);
            pool.pop()
        }
    }

    find(0,1)

    console.log(result)
}