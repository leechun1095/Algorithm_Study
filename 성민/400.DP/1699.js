const input = `43`;
// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim()
main(+input);
function main(N){
    let arr = [0,1];
    let pow = 1;
    let nextpow = 2;
    for(let i =1; i<= N; i++){
        if(nextpow * nextpow === i){
            arr[i] = 1;
            nextpow++;
            pow = i;
        }else{
            let candi = [];
            for(let j = 1; j*j<=i; j++){
                candi.push(arr[j*j] + arr[i-j*j])
            }
            arr[i] = Math.min(...candi)
            //arr[i] = arr[pow] + arr[i-pow];
        }
    }

    console.log(arr[N])
}