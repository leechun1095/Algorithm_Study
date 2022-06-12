const [E,S,M] = `1 16 16`.split(' ').map(Number);

// const fs = require('fs');
// const [E,S,M] = fs.readFileSync('dev/stdin').toString().trim().split(' ').map(Number);

main(E,S,M);

function main(E,S,M){
    let year = 1;
    if(E === 15) E = 0;
    if(S === 28) S = 0;
    if(M === 19) M = 0
    while(true){
        if(E === year%15 && S === year%28 && M === year%19){
            console.log(year);
            return;
        }
        year++;
    }
}