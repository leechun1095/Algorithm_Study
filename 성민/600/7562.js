const input = `3
8
0 0
7 0
100
0 0
30 50
10
1 1
1 1`.split('\n').map(val=>val.split(' ').map(Number));

// const fs = require("fs");
// const input = fs.readFileSync("dev/stdin").toString().trim().split('\n').map(val=>val.split(' ').map(Number));

const [N] = input.shift();
const result = [];
for(let i =0; i<input.length; ){
    const [I] = input[i++];
    const start = input[i++];
    const target = input[i++];
    result.push(main(I,start,target));
}

console.log(result.join('\n'))

function main(I,Start,Target){
    const direction =[[-2,-1],[-1,-2],[-2,1],[-1,2],[1,2],[2,1],[2,-1],[1,-2]];
    const visited = [];
    for(let i =0; i<I; i++){
        visited.push(new Array(I).fill(-1));
    }

    const needVisit = [Start];
    visited[Start[0]][Start[1]] = 0;

    while(needVisit.length){
        const [row,col] = needVisit.shift();
        if(row===Target[0] && col===Target[1]){
            return visited[row][col]
        }

        for(let i =0; i<direction.length; i++){
            let nrow = row + direction[i][0];
            let ncol = col + direction[i][1];
            if(nrow>=0 && nrow<I && ncol>=0 && ncol<I && visited[nrow][ncol]<0){
                visited[nrow][ncol] = visited[row][col] +1;
                needVisit.push([nrow,ncol])
            }
        }
    }
}