const input = `6 4`.split(' ').map(Number);
// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim().split(' ').map(Number)
main(input[0],input[1])
function main(N,K){
    let map = [new Array(N).fill(1)];
    for(let i = 1; i<K; i++){
        map.push([]);
        for(let j = 0; j<N; j++){
            if(j === 0){
                map[i][j] = i+1;
                continue;
            }
            map[i][j] = (map[i-1][j] + map[i][j-1])%1000000000;
        }
    }

    console.log(map[K-1][N-1])
}