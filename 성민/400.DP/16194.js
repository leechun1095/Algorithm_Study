const input = `4
3 5 15 16`.split('\n');

// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim().split('\n')

let arr = input[1].split(' ').map(Number);
main([0,...arr]);
function main(arr){
    for(let i =2; i<arr.length; i++){
        let min = arr[i];
        for(let j =1; j<=i/2; j++){
            let now = arr[j] + arr[i-j];
            if(min > now) min = now;
        }
        arr[i] = min;
    }

    console.log(arr[arr.length-1])
}