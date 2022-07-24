const input = `5
11000
00000
00111
00000
10000`.split('\n').map(val=>val.split('').map(Number));

// const fs = require("fs");
// const input = fs.readFileSync("dev/stdin").toString().trim().split('\n').map(val=>val.split('').map(Number));

const N = +input.shift().join('');

main(N,input);

function main(N,Board){
    const village = [];

    const bfs = (start) =>{
        let count = 0;
        let needVisit = [start];
        const direction = [[1,0],[0,1],[-1,0],[0,-1]]
        while(needVisit.length){
            let [row,col] = needVisit.shift();
            if(Board[row][col] < 0) continue;

            Board[row][col] = -1;
            count++;
            for(let i =0; i<direction.length; i++){
                let nrow = row + direction[i][0];
                let ncol = col + direction[i][1];
                if(nrow>=0 && nrow<N && ncol>=0 && ncol<N && Board[nrow][ncol] === 1){
                    needVisit.push([nrow,ncol]);
                }
            }
        }
        village.push(count)
    }

    for(let i =0; i<N; i++){
        for(let j =0; j<N; j++){
            if(Board[i][j] === 1){
                bfs([i,j])
            }
        }
    }

    console.log(village.length)
    console.log(village.sort((a,b)=>a-b).join('\n'))
}