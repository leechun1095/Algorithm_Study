const input = `10`;
// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim();
main(+input)
function main(num){
    const arr = [0,0];

    let idx = 2;
    while(idx <= num){
        let candi1 = idx%3 === 0? arr[idx/3] +1 : Infinity;
        let candi2 = idx%2 === 0? arr[idx/2] +1 : Infinity;
        let candi3 = arr[idx-1]+1;
        arr[idx] = Math.min(candi1,candi2,candi3);
        idx++; 
    }
    console.log(arr[num])
}