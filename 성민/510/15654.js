const input = `4 2
9 8 7 1`.split('\n').map(val=>val.split(' ').map(Number));

// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(val=>val.split(' ').map(Number));

const [N,M] = input.shift();
main(N,M,input[0]);

function main(N,M,Arr){
    Arr.sort((a,b)=>a-b);
    const used = {};
    const pool = [];
    let result = '';
    const find = (depth) =>{
        if(depth>=M){
            result += pool.join(' ') + '\n';
            return;
        }

        for(let i =0; i<N; i++){
            if(!used[Arr[i]]){
                used[Arr[i]] = true;
                pool.push(Arr[i]);
                find(depth +1);
                pool.pop();
                used[Arr[i]] = false;
            }
        }
    }
    find(0)

    console.log(result)
}