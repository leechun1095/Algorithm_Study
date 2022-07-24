const input = `1 1
0
2 2
0 1
1 0
3 2
1 1 1
1 1 1
5 4
1 0 1 0 0
1 0 0 0 0
1 0 1 0 1
1 0 0 1 0
5 4
1 1 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 1 1
5 5
1 0 1 0 1
0 0 0 0 0
1 0 1 0 1
0 0 0 0 0
1 0 1 0 1
0 0`.split('\n').map(val=>val.split(' ').map(Number));

// const fs = require("fs");
// const input = fs.readFileSync("dev/stdin").toString().trim().split('\n').map(val=>val.split(' ').map(Number));

let i = 0
while(true){
    const [W,H] = input[i++];
    if(!W && !H){
        break;
    }
    let tmp = [];
    for(let j =0; j<H; j++){
        tmp.push(input[i++])
    }
    main(W,H,tmp)
}

function main(W,H,Board){
    let count = 0;

    const bfs = (start) =>{
        const needVisit = [start];
        const direction =[[1,0],[0,1],[-1,0],[0,-1],[1,1],[1,-1],[-1,1],[-1,-1]]
        while(needVisit.length){
            let [row,col] = needVisit.shift();
            if(Board[row][col] === -1) continue;
            Board[row][col] = -1;
            for(let i =0; i<direction.length; i++){
                let nrow = row + direction[i][0];
                let ncol = col + direction[i][1];
                if(nrow>=0 && nrow<H && ncol>=0 && ncol<W && Board[nrow][ncol] === 1){
                    needVisit.push([nrow,ncol]);
                }
            }
        }
    }

    for(let i=0; i<H; i++){
        for(let j=0; j<W; j++){
            if(Board[i][j] === 1){
                count++
                bfs([i,j])
            }
        }
    }

    console.log(count)
}