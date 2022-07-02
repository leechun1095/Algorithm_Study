const input = `6
20 1 15 8 4 10`.split('\n').map(val => val.split(' ').map(Number));

const fs = require('fs');
const input= fs.readFileSync('dev/stdin').toString().trim().split('\n').map(val => val.split(' ').map(Number));

main(input[1]);

function main(Arr){
    let max = 0;
    const pool = [];
    const used = new Array(Arr.length).fill(false);

    const find = (depth) =>{
        if(depth === Arr.length){
            let tmp = 0;
            for(let i =0; i<pool.length-1; i++){
                tmp += Math.abs(pool[i]-pool[i+1])
            }
            max = tmp>max?tmp:max;
            return;
        }

        for(let i=0;i<Arr.length; i++){
            if(!used[i]){
                used[i] = true;
                pool.push(Arr[i]);
                find(depth +1);
                pool.pop();
                used[i] = false;
            }
        }
    }

    find(0);

    console.log(max)
}