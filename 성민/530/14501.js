const input = `10
5 50
4 40
3 30
2 20
1 10
1 10
2 20
3 30
4 40
5 50`.split('\n').map(val=>val.split(' ').map(Number));

const fs = require('fs');
const input = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(val=>val.split(' ').map(Number));

const [N] = input.shift()
main(N,input)

function main(N,Arr){
    const used = new Array(N).fill(false);
    let max = 0;
    const find = (start,val) =>{
        for(let i =start; i<N; i++){
            if(!used[i] && i+Arr[i][0] <= N){
                for(let j=0; j<Arr[i][0]; j++){
                    used[i+j] = true
                }
                find(i,val+Arr[i][1]);
                for(let j=0; j<Arr[i][0]; j++){
                    used[i+j] = false
                }
            }
        }
        max = max > val? max : val
    }
    find(0,0)

    console.log(max)
}