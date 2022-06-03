const input = `3
26 40 83
49 60 57
13 89 99`.split('\n').map(val=>val.split(' ').map(Number));
const fs = require('fs');
const input = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(val=>val.split(' ').map(Number));

input.shift();

main(input);

function main(Arr){
    const memo = [
        [[Arr[0][0],Infinity,Infinity]],
        [[Infinity,Arr[0][1],Infinity]],
        [[Infinity,Infinity,Arr[0][2]]]
    ]

    for(let i =1; i<Arr.length; i++){
        for(let k =0; k<3; k++){
            memo[k][i] = [];
            for(let j =0; j<3; j++){
               memo[k][i][j] = Math.min(memo[k][i-1][(j+1)%3], memo[k][i-1][(j+2)%3]) + Arr[i][j];
            }
        }
    }
    console.log(Math.min(...memo.map((val,idx) =>{
        return val[val.length-1].filter((val2,idx2) =>{
            if(idx !== idx2) return val2
        })
    }).reduce((acc,cur)=>acc.concat(cur))))
}