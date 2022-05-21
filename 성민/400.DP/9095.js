const input = `3
4
7
10`.split('\n').map(Number);

// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(Number);
input.shift();
main(input);

function main(Arr){
    let res = [];

    const arr = [0,1,2,4]
    const find = (num) =>{
        if(arr[num]){
            res.push(arr[num]);
            return;
        }

        for(let i = arr.length; i<= num; i++){
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
        res.push(arr[num]);
    }

    for(let i =0; i<Arr.length; i++){
        find(Arr[i])
    }

    console.log(res.join('\n'))
}