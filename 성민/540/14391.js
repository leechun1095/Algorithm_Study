/*
접근법
선택하는 방향을 고려하지 않는다
입력받은 보드의 모든 used 경우의 수를 구함
used 가 false 라면 세로로 선택된거라 생각하고
true 면 가로로 선택된 거라 생각함
모든 경우에 대해 계산을 진행

 */

const input = `4 3
001
010
111
100`.split('\n')

// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim().split('\n')

const [N,M] = input[0].split(' ');
input.shift();
const board = input.map(val=>val.split('').map(Number))

main(+N,+M,board);

function main(N,M,Board){

    let max = 0;
    const used = [];
    for(let i =0; i<N; i++){
        used.push(new Array(M).fill(false))
    }
    const calc = () =>{
        const calcVisit = []
        for(let i =0; i<N; i++){
            calcVisit.push(new Array(M).fill(false))
        }
        const v = []
        const h =[]
        for(let i =0; i<N; i++){
            for(let j =0; j<M; j++){
                //세로 추가
                if(!used[i][j] && !calcVisit[i][j]){
                    let ti = i;
                    let tj = j;
                    let tmp = []
                    while(ti<N && !used[ti][tj] && !calcVisit[ti][tj]){
                        tmp.push(Board[ti][tj]);
                        calcVisit[ti][tj] = true;
                        ti++
                    }
                    v.push(+tmp.join(''))
                }else if(used[i][j] && !calcVisit[i][j]){ //가로 추가
                    let ti = i;
                    let tj = j;
                    let tmp = [];
                    while(tj < M && used[ti][tj] && !calcVisit[ti][tj]){
                        tmp.push(Board[ti][tj]);
                        calcVisit[ti][tj] = true;
                        tj++
                    }
                    h.push(+tmp.join(''))
                }
            }
        }
        let sum = v.reduce((prev,now)=>prev+now,0) + h.reduce((prev,now)=>prev+now,0)
        max = max > sum? max:sum
    }
    const find = (row,col) =>{
        // if(depth === N*M){
        //     return;
        // }
        calc()
        for(let i = row; i<N; i++){
            for(let j =col; j<M; j++){
                if(!used[i][j]){
                    used[i][j] = true;
                    find(i,j);
                    used[i][j] = false;
                }
            }
            col = 0
        }
    }

    find(0,0)

    console.log(max)
}