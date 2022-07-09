const input = `5 0
-7 -3 -2 5 8`.split('\n').map(val=>val.split(' ').map(Number));

// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(val=>val.split(' ').map(Number));

const [N,S] = input[0]
main(N,S,input[1])

function main(N,S,Arr){
    let count = 0;
    const used = new Array(N).fill(false)
    const find = (depth,t_depth,start,val) =>{
        if(depth === t_depth){
            return
        }
        if(val === S){
            count++;
        }
        for(let i = start; i<Arr.length; i++){
            if(!used[i]){
                used[i] = true;
                find(depth +1, t_depth, i, val+Arr[i]);
                used[i] = false
            }
        }
    }

    for(let i =0; i<Arr.length; i++){
        used[i] = true
        find(0,N-i,i,Arr[i])
        used[i] = false
    }

    console.log(count)
}