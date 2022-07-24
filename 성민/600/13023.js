const input = `5 4
0 1
1 2
2 3
3 4`.split('\n').map(val=>val.split(' ').map(Number));

// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim().split('\n').map(val=>val.split(' ').map(Number));

const [N,M] = input.shift();

main(N,M,input);

function main(N,M,Arr){
    const graph = [];
    
    for(let i =0; i<N; i++){
        graph[i] = [];
    
    }

    for(let i=0; i<Arr.length; i++){
        graph[Arr[i][0]].push(Arr[i][1]);
        graph[Arr[i][1]].push(Arr[i][0]);
    }

    let max = 0;

    const dfs = (now,count,visited) =>{
        if(max>=4) return;
        visited[now] = true;
        for(let i =0; i<graph[now].length; i++){
            if(!visited[graph[now][i]]){
                dfs(graph[now][i],count+1,visited)
            }
        }
        max = max>count? max:count
        visited[now] = false
    }

    for(let i =0; i<N; i++){
        dfs(i,0,[])
        if(max>=4){
            console.log(1)
            return;
        }
    }

    console.log(0)
}