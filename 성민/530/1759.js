const input = `4 6
a t c i s w`.split('\n')

const fs = require('fs');
const input= fs.readFileSync('dev/stdin').toString().trim().split('\n')

const [L,C] = input.shift().split(' ').map(Number);
const arr = input[0].split(' ')

main(L,C,arr);

function main(L,C,Arr){
    const alpha = {
        'a': 1, 'b':2, 'c':3, 'd':4, 'e':5, 'f':6, 'g':7, 'h':8, 'i':9, 'j':10, 'k':11, 'l':12, 'm':13,
        'n': 14, 'o':15, 'p':16, 'q':17, 'r':18, 's':19, 't':20, 'u':21, 'v':22, 'w':23, 'x':24, 'y':25, 'z':26
    }
    Arr.sort((a,b)=>alpha[a]-alpha[b]);
    const mm = ['a','e','i','o','u'];
    const pool = [];
    const used = new Array(C).fill(false);
    let result = ''
    const find = (depth,start, m, z) =>{
        if(depth === L && m >0 && z > 1){
            result += pool.join('') + '\n';
            return;
        }

        for(let i =start; i<C; i++){
            if(!used[i]){
                used[i] = true;
                pool.push(Arr[i]);
                let [nm,nz] = mm.includes(Arr[i])? [m+1,z] : [m,z+1]
                find(depth+1,i,nm,nz);
                pool.pop();
                used[i] = false;
            }
        }
    }

    find(0,0,0,0);

    console.log(result)
}