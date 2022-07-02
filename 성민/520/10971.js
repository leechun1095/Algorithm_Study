const input = `4
0 10 15 20
5 0 9 10
6 13 0 12
8 8 9 0`.split('\n');

const fs = require('fs');
const input= fs.readFileSync('dev/stdin').toString().trim().split('\n')
input.shift();
main(input.map(val=>val.split(' ').map(Number)));

function main(Board){
    const used = new Array(Board.length).fill(false);
    let min = Infinity;

    const find = (depth,start,last,now)=>{
        if(depth === Board.length){
            if(Board[last][start]>0){
                now+=Board[last][start]
                min = now<min? now:min
            }
            return;
        }
        for(let i =0; i<Board.length; i++){
            if(!used[i] && Board[last][i] > 0){
                used[i] = true;
                find(depth+1,start,i,now + Board[last][i]);
                used[i] = false;
            }
        }
    }

    for(let i =0; i<Board.length; i++){
        used[i] = true;
        find(1,i,i,0)
        used[i] = false;
    }

    console.log(min)
}