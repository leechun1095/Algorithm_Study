const input = `4 2
9 7 9 1`.split('\n').map(val=>val.split(' ').map(Number));

const fs = require('fs');
const input= fs.readFileSync('dev/stdin').toString().trim().split('\n').map(val=>val.split(' ').map(Number));

const [N,M] = input.shift();

main(N,M,input[0]);

function main(N,M,Arr){
    Arr.sort((a,b)=>a-b)
    const result = [];
    const pool = [];
    const used = new Array(N).fill(false);

    const find = (depth) =>{
        if(depth === M){
            result.push(pool.join(' '));
            return;
        }

        for(let i =0; i<N; i++){
            if(!used[i]){
                used[i] = true;
                pool.push(Arr[i]);
                find(depth+1);
                pool.pop();
                used[i] = false;
            }
        }
    }

    find(0);
    console.log([...new Set(result)].join('\n'))
}