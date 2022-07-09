const input = `80
0 5 4 5 4 5 4 5
4 0 5 1 2 3 4 5
9 8 0 1 2 3 1 2
9 9 9 0 9 9 9 9
1 1 1 1 0 1 1 1
8 7 6 5 4 0 3 2
9 1 9 1 9 1 0 9
6 5 4 3 2 1 9 0`.split('\n');

const fs = require('fs');
const input = fs.readFileSync('dev/stdin').toString().trim().split('\n')

const N = +input[0];
input.shift()
const board = input.map(val=>val.split(' ').map(Number))


main(N,board);

function main(N,Board){

    const used = new Array(N).fill(false);
    let min = Infinity;

    const calc = () =>{
        const team1 = []
        const team2 = []
        for(let i =0; i<Board.length; i++){
            if(!used[i]) team2.push(i)
            else team1.push(i)
        }
        let val1 = 0;
        let val2 = 0;
        for(let i =0; i<team1.length-1; i++){
            for(let j = i+1; j<team1.length; j++){
                val1 += Board[team1[i]][team1[j]] + Board[team1[j]][team1[i]];
                val2 += Board[team2[i]][team2[j]] + Board[team2[j]][team2[i]];
            }
        }
        let diff = Math.abs(val1-val2);
        min = diff < min? diff : min
    }
    const find = (start,depth) =>{
        if(depth === N/2){
            calc()
            return;
        }
        for(let i =start; i<Board.length; i++){
            if(!used[i]){
                used[i] = true;
                find(i,depth+1);
                used[i] = false;
            }
        }
    }

    find(0,0)

    console.log(min)
}