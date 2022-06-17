const input = `3
10 12 3 9
10 12 7 2
13 11 5 6`.split('\n').map(val => val.split(' ').map(Number));

// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(val => val.split(' ').map(Number));
const [cases] = input.shift();
const result = []
for(let i =0; i<cases; i++){
    const [M,N,x,y] = input[i];
    result.push(main(M,N,x,y))
}
console.log(result.join('\n'))

function main(M,N,x,y){
    let GCD = 0;
    const findGCD = (a,b) =>{
        let c = a%b;
        if(c === 0){
            GCD = b;
            return;
        }
        findGCD(b,c);
    }
    findGCD(M,N)
    let LCM = M*N/GCD
    while(x<=LCM && y<=LCM){
        if(x<y){
            x += M;
        }else if(y<x){
            y += N;
        }else{
            return x;
        }
    }
    return -1
}