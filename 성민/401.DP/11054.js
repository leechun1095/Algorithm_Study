const input = `10
1 5 2 1 4 3 4 5 2 1`.split('\n').map(val=>val.split(' ').map(Number))
// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(val=>val.split(' ').map(Number))
main(input[1])
function main(Arr){
    if(Arr.length<3){
        console.log(Arr.length)
        return;
    }
    let memo = [];
    for(let i =0; i<Arr.length; i++){
        memo.push([1,1])
    }

    for(let i = 1; i<Arr.length; i++){
        let leftCandi = 0;
        for(let j = i-1 ; j>= 0; j--){
            if(Arr[i] > Arr[j] && memo[j][0] > leftCandi){
                leftCandi = memo[j][0];
            }
        }
        memo[i][0] = leftCandi+1
    }

    for(let i = Arr.length-2; i>=0; i--){
        let rightCandi = 0;
        for(let j = i+1; j < Arr.length; j++){
            if(Arr[i] > Arr[j] && memo[j][1] > rightCandi){
                rightCandi = memo[j][1];
            }
        }
        memo[i][1] = rightCandi+1
    }

    console.log(Math.max(...memo.map(val=>val[0]+val[1]))-1)
}