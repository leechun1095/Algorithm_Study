const input = `4 10
1 2 1 2 1 2 1 2 1 2
2 1 2 1 2 1 2 1 2 1
1 2 1 2 1 2 1 2 1 2
2 1 2 1 2 1 2 1 2 1`.split('\n').map(val=>val.split(' ').map(Number));

const [N,M] = input.shift();

main(N,M,input);

function main(N,M,Board){

    let max = 0;

    const _include = (history,row,col) =>{
        for(let item of history){
            if(item[0] === row && item[1] === col) return true;
        }
        return false;
    }

    const find = (history,row,col,acc) =>{
        if(history.length >= 4){
            if(acc > max) max = acc;
            return
        }
        const dir = [[1,0],[0,1],[-1,0],[0,-1]]

        for(let i =0; i<dir.length; i++){
            let nRow = row + dir[i][0];
            let nCol = col + dir[i][1];
            if(nRow >=0 && nRow < N && nCol >=0 && nCol < M && !_include(history,nRow,nCol)){
                find([...history,[nRow,nCol]],nRow,nCol,acc+Board[nRow][nCol]);
            }
        }
    }

    for(let i =0; i< N; i++){
        for(let j =0; j<M; j++){
            find([],i,j,0)
        }
    }

    console.log(max)
}