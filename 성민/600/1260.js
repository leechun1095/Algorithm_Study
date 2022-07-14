const input = `1000 1 1000
999 1000`.split('\n').map(val=>val.split(' ').map(Number))

// const fs = require("fs");
// const input = fs.readFileSync("dev/stdin").toString().trim().split('\n').map(val=>val.split(' ').map(Number))

const [N,M,V] = input.shift();

main(N,M,V,input)

function main(N,M,V,Arr){
    const graph = [];

    for(let i =0; i<=N; i++){
        graph.push([]);
    }

    for(let i =0; i<M; i++){
        const [from,to] = Arr[i]
        graph[from].push(to)
        graph[to].push(from)
    }
    graph.map(val=>val.sort((a,b)=>a-b))

    const bfsPool = [];
    const bfs = (now,needVisit,visited) =>{
        visited[now] = true;
        bfsPool.push(now);
        while(needVisit.length){
            let node = needVisit.shift();
            if(!visited[node]){
                visited[node] = true;
                bfsPool.push(node);
                for(let i =0; i<graph[node].length; i++){
                    if(!visited[graph[node][i]]){
                        needVisit.push(graph[node][i]);
                    }
                }
            }
        }
    }

    bfs(V,[...graph[V]],[])
    

    const dfsPool = [];
    const dfs = (now,visited) =>{
        dfsPool.push(now)
        visited[now] = true;
        for(let i =0; i<graph[now].length; i++){
            if(!visited[graph[now][i]]){
                dfs(graph[now][i],visited)
            }
        }
    }
    dfs(V,[])

    console.log(dfsPool.join(' '))
    console.log(bfsPool.join(' '))
}