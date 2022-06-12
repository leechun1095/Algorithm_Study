const input = `3
CCP
CCP
PPC`.split('\n').map(val=>val.split(''));
// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(val=>val.split(''));

const [N] = input.shift();

main(N,input)

function main(N,Board){
    let max = 1;

    const seqMax = (row,col,dir) =>{
        let token = Board[row][col];
        let tmpMax = 1;
        let srow = row;
        let scol = col;
        while(true){
            let nRow = row+dir[0];
            let nCol = col+dir[1];
            if(nRow>=0 && nRow<N && nCol>=0 && nCol<N && Board[nRow][nCol] === token){
                tmpMax++
                row = nRow;
                col = nCol;
            }else{
                break;
            }
        }
        row = srow;
        col = scol;
        let ndir0 = dir[0] * (-1);
        let ndir1 = dir[1] * (-1)
        while(true){
            let nRow = row+ndir0;
            let nCol = col+ndir1;
            if(nRow>=0 && nRow<N && nCol>=0 && nCol<N && Board[nRow][nCol] === token){
                tmpMax++
                row = nRow;
                col = nCol;
            }else{
                break;
            }
        }
        if(tmpMax> max) max = tmpMax;
    }

    const swap = (row,col,dir) =>{
        let nRow = row + dir[0];
        let nCol = dir[1];
        if(nRow>=0 && nRow<N && nCol>=0 && nCol<N ){
            let tmp = Board[row][col];
            Board[row][col] = Board[nRow][nCol]
            Board[nRow][nCol] = tmp;
            return true;
        }
        return false;
    }
    const find = (row,col) =>{
        const dir = [[1,0],[0,1],[-1,0],[0,-1]];
        for(let i =0; i<4; i++){
            seqMax(row,col,dir[i]);
            if(swap(row,col,dir[i])){
                for(let j =0; j<4; j++){
                    seqMax(row,col,dir[j]);
                }
                swap(row,col,dir[i])
            }
        }
    }

    for(let i=0; i<N; i++){
        for(let j =0; j<N; j++){
            find(i,j);
        }
    }

    console.log(max)
}