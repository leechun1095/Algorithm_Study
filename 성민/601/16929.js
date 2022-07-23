const input = `2 13
ABCDEFGHIJKLM
NOPQRSTUVWXYZ`.split('\n');

// const fs = require("fs");
// const input = fs.readFileSync("dev/stdin").toString().trim().split('\n')

const [N,M] = input.shift().split(' ').map(Number);

main(N,M,input.map(val=>val.split('')))

function main(N,M,Board){
    const visited = [];

    const direction = [[1,0],[0,1],[-1,0],[0,-1]]

    for(let i =0; i<N; i++){
        visited.push(new Array(M).fill(-1))
    }
    // for(let i =0; i<N; i++){
    //     let tmp = [];
    //     for(let j =0; j<M; j++){
    //         let token = Board[i][j];
    //         let count = 0;
    //         for(let k =0; k<direction.length; k++){
    //             let ni = i + direction[k][0];
    //             let nj = j + direction[k][1];
    //             if(ni>=0 && ni<N && nj>=0 && nj<M && Board[ni][nj] === token){
    //                 count++
    //             }
    //         }
    //         if(count>=2){
    //             tmp.push(0)
    //         }else{
    //             tmp.push(1);
    //         }
    //     }
    //     visited.push(tmp)
    // }
    
    let done = false;

    const dfs = (now,last,token) =>{
        if(done) return;

        let [row,col] = now;
        visited[row][col] = token;
        for(let i =0; i<direction.length; i++){
            let nrow = row + direction[i][0];
            let ncol = col + direction[i][1];
            if(nrow>=0 && nrow<N && ncol>=0 && ncol<M && Board[row][col] === Board[nrow][ncol]){
                if(visited[nrow][ncol]<0){
                    dfs([nrow,ncol],[row,col],token)
                }else if(visited[nrow][ncol] === token){
                    if(nrow===last[0] && ncol === last[1]){
                        continue;
                    }
                    done = true;
                    return;
                }
            }
        }
    }

    let key = 0
    for(let i =0; i<N; i++){
        for(let j =0; j<M; j++){
            if(visited[i][j]<0 && !done){
                last = null;
                dfs([i,j],[],key++)
            }
        }
    }

    console.log(done? 'Yes':'No')
}