const input = `3 1`.split(' ').map(Number)

const fs = require('fs');
const input = fs.readFileSync('dev/stdin').toString().trim().split(' ').map(Number)

main(input[0],input[1]);

function main(N,M){
    const result = [];
    const source = [];

    for(let i =1; i<=N; i++){
        source.push(i);
    }

    const make = (now) =>{
        if(now.length === M){
            result.push(now);
            return;
        }
        for(let i =0; i<source.length; i++){
            if(!now.includes(source[i])){
                make([...now,source[i]])
            }
        }
    }

    make([]);

    console.log(result.map(val=> val.join(' ')).join('\n'))
}