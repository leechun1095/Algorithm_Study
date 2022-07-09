const [N,Arr] = `5
++0+-+-+--+-+--`.split('\n')

const fs = require('fs');
const [N,Arr]= fs.readFileSync('dev/stdin').toString().trim().split('\n')

main(+N,Arr.split(''))

function main(N,Arr){

    const map = [];
    let ii = 0;
    let idx = 0;
    for(let i =0; i<N; i++){

        let tmp = [];
        for(let j =0; j<idx; j++){
            tmp.push(false);
        }
        for(let j = 0; j<N-idx; j++){
            tmp.push(Arr[ii]);
            ii++;
        }
        map.push(tmp)
        idx++;
    }

    const candi = []

    const valid = (arr) =>{
            let token = 0;
            while(token < arr.length){
                let val = 0;
                for(let i = token; i<arr.length; i++){
                    val += arr[i];
                    if(map[token][i] === '0'){
                        if(val !== 0) return false;
                    }else if(map[token][i] === '-'){
                        if(val >= 0 ) return false;
                    }else if(map[token][i] === '+'){
                        if(val <= 0) return false;
                    }
                }
                token++
            }

            return true;
    }

    let end = false
    const find = (depth) =>{
        if(depth === N){
            console.log(candi.join(' '))
            end = true
            return;
        }
        for(let i =0; i<=10; i++){
            candi.push(i)
            if(valid(candi)){
                find(depth+1)
            }
            if(end){
                return
            }
            candi.pop();
            candi.push(-i)
            if(valid(candi)){
                find(depth+1)
            }
            if(end){
                return
            }
            candi.pop();
        }
    }

    find(0)
}