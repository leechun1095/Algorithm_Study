const input = `7 1 2 3 4 5 6 7
8 1 2 3 5 8 13 21 34
0`.split('\n').map(val=>val.split(' ').map(Number));
// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(val=>val.split(' ').map(Number));

const consoleRes = [];
for(let i =0; i<input.length-1; i++){
    main(input[i])
}
console.log(consoleRes.join('\n\n'))


function main(Arr){
    const res = [];
    Arr.shift();

    const make = (idx, now) =>{
        if(now.length >= 6){
            res.push(now.join(' '));
            return;
        }
        for(let i =idx; i<Arr.length; i++){
            make(i +1, [...now,Arr[i]]);
        }
    }

    make(0,[])
    consoleRes.push(res.join('\n'));
}
