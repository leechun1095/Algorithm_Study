const input = `5
YCPZY
CYZZP
CCPPP
YCYZC
CPPZZ`.split('\n').map(val=>val.split(''));
// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(val=>val.split(''));

const [N] = input.shift();

main(N,input)

function main(N,Board){
    let max = 1;

    const swap = (row,col,nRow,nCol) =>{
        let tmp = Board[row][col];
        Board[row][col] = Board[nRow][nCol];
        Board[nRow][nCol] = tmp;
    }

    const maxSeq = (row,col) =>{
        const token = Board[row][col];
        let vertical = 0;
        let horizontal = 0;
        let up = 1;
        let down = 1;
        let left = 1;
        let right = 1;
        while(up || down || left || right){
            if(up && row - up >= 0 && Board[row-up][col] === token){
                vertical++;
                up++
            }else{
                up = 0;
            }

            if(down && row + down < N && Board[row+down][col] === token){
                vertical++
                down++
            }else{
                down = 0
            }

            if(left && col - left >= 0 && Board[row][col-left] === token){
                horizontal++;
                left++
            }else{
                left = 0
            }

            if(right && col + right < N && Board[row][col+right] === token){
                horizontal++;
                right++
            }else{
                right = 0
            }
        }

        let count = vertical > horizontal? vertical+1 : horizontal+1;
        max = count > max? count : max;
    }

    const maxSeq2 = () =>{

        for(let i =0; i<N; i++){
            let vertical = 1;
            let horizontal = 1;
            for(let j =0; j<N-1; j++){
                if(Board[i][j] === Board[i][j+1]){
                    horizontal++
                }
                if(Board[j][i] === Board[j+1][i]){
                    vertical++
                }
            }
            let big = vertical>horizontal? vertical:horizontal;
            max = big>max? big:max;
        }
    }

    const find = (row,col) => {
        const dir = [[1,0],[0,1],[-1,0],[0,-1]];

        maxSeq(row,col);
        for(let i =0; i<dir.length; i++){
            let nRow = row + dir[i][0];
            let nCol = col + dir[i][1];
            if(nRow >= 0 && nRow < N && nCol >= 0 && nCol < N && Board[row][col] !== Board[nRow][nCol]){
                swap(row,col,nRow,nCol);
                maxSeq(row,col);
                //maxSeq2()
                swap(row,col,nRow,nCol);
            }
        }
    }
    //maxSeq2()
    for(let i =0; i<N; i++){
        for(let j =0; j<N; j++){
            find(i,j)
        }
    }

    console.log(max)
}