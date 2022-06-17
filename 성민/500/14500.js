const input = `5 5
1 2 3 4 5
5 4 3 2 1
2 3 4 5 6
6 5 4 3 2
1 2 1 2 1`.split('\n').map(val=>val.split(' ').map(Number));

// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(val=>val.split(' ').map(Number));

const [N,M] = input.shift();

main(N,M,input);

function main(N,M,Board){

    const tetris = [
        [[0,1],[0,2],[0,3]],
        [[1,0],[2,0],[3,0]],
        [[0,1],[1,0],[1,1]],
        [[1,0],[2,0],[2,1]],
        [[0,1],[0,2],[-1,2]],
        [[-1,0],[-2,0],[-2,-1]],
        [[0,-1],[0,-2],[1,-2]],
        [[1,0],[2,0],[2,-1]],
        [[0,1],[0,2],[1,2]],
        [[-1,0],[-2,0],[-2,1]],
        [[0,-1],[0,-2],[-1,-2]],
        [[1,0],[1,1],[2,1]],
        [[0,1],[-1,1],[-1,2]],
        [[1,0],[1,-1],[2,-1]],
        [[0,-1],[-1,-1],[-1,-2]],
        [[0,1],[1,1],[0,2]],
        [[-1,0],[-1,1],[-2,0]],
        [[0,-1],[-1,-1],[0,-2]],
        [[1,0],[1,-1],[2,0]]
    ]
    let max = 0;
    const find = (row,col) =>{
        for(let i =0; i<tetris.length; i++){
            let now = Board[row][col];
            for(let j =0; j<3; j++){
                let nRow = row + tetris[i][j][0];
                let nCol = col + tetris[i][j][1];
                if(nRow >=0 && nRow<N && nCol >=0 && nCol<M){
                    now += Board[nRow][nCol]
                }else{
                    now = 0;
                    break;
                }
            }
            max = now>max? now:max;
        }
    }
    for(let i=0;i<N;i++){
        for(let j=0;j<M;j++){
            find(i,j)
        }
    }

    console.log(max)
}