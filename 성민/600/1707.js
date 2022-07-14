const input = `1
6 6
1 3
3 4
4 2
2 5
5 6
6 1`.split('\n').map(val=>val.split(' ').map(Number));

// const fs = require("fs");
// const input = fs.readFileSync("dev/stdin").toString().trim().split('\n').map(val=>val.split(' ').map(Number));

const [K] = input.shift();

for(let i =0; i<input.length; ){
    const [V,E] = input[i++];
    let tmp = [];
    for(let j =0; j<E; j++,i++){
        tmp.push(input[i])
    }
    main(V,E,tmp)
}

function main(V,E,Arr){
    let count = 0;

    const graph = [];
    const visited = new Array(V+1).fill(0);

    for(let i =0; i<=V; i++){
        graph[i] = [];
    }
    for(let i =0; i<Arr.length; i++){
        const [from,to] = Arr[i];
        graph[from].push(to);
        graph[to].push(from);
    }

    let flag = false;

    const bfs = (start) =>{
        let needVisit = [...graph[start]];
        let token = 1;
        visited[start] = token;
    
        while(needVisit.length){
            token *= -1;
            let tmp = []
            for(let i =0; i<needVisit.length; i++){
                if(visited[needVisit[i]] === 0){
                    visited[needVisit[i]] = token;
                    tmp.push(...graph[needVisit[i]]);
                }else if(visited[needVisit[i]] !== token){
                    flag = true;
                    return;
                }
            }
            needVisit = tmp
        }
    }
    
    for(let i =1; i<=V; i++){
        if(!visited[i] && !flag){
            bfs(i)
        }
    }

    console.log(flag? 'NO':'YES')
}