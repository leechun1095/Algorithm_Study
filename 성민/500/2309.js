const input = `20
7
23
19
10
15
25
8
13`.split('\n').map(Number).sort((a,b)=>a-b);

const fs = require('fs');
const input = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(Number).sort((a,b)=>a-b);

main(input)

function main(Arr){
    const sum = Arr.reduce((prev,now)=>prev+now);
    let diff = sum - 100;
    for(let i =0; i<8; i++){
        for(let j = i+1; j<9; j++){
            if(Arr[i] + Arr[j] === diff){
                Arr.map((val,index)=>{
                    if(index !== i && index !== j){
                        console.log(val)
                    }
                })
                return;
            }
        }
    }
}