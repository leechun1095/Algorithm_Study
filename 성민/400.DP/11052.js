let [_,input] = `4
3 5 15 16`.split('\n');
// const fs = require('fs');
// let [_,input]  = fs.readFileSync('dev/stdin').toString().trim().split('\n');
input = input.split(' ').map(Number);
main(+_,[0,...input]);
function main(num, arr){
    for(let i =2; i<arr.length; i++){
        let max = arr[i];
        for(let j = 1; j<=Math.floor(arr[i]/2); j++){
            let now = arr[j] + arr[i-j];
            if(max < now) max = now;
        }
        arr[i] = max;
    }    
    console.log(arr[arr.length-1])
}