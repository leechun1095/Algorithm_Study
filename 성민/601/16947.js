const input = `38
1 2
2 3
3 4
4 5
5 6
6 1
1 7
7 8
8 9
9 10
10 11
11 12
12 13
13 14
14 15
15 16
16 17
17 18
18 19
19 20
20 21
21 22
22 23
23 24
24 25
25 26
26 27
27 28
28 29
29 30
30 31
31 32
32 33
33 34
34 35
35 36
36 37
37 38`.split('\n')

// const fs = require("fs");
// const input = fs.readFileSync("dev/stdin").toString().trim().split('\n')

const N = +input.shift()
main(N,input.map(val=>val.split(' ').map(Number)))
function main (N,Arr){
    const graph = [];
    let dfsVisit = []
    let result = [];
    for(let i =0; i<N+1; i++){
        graph.push([])
        dfsVisit.push(false)
    }

    for(let i =0; i<Arr.length; i++){
        let [from,to] = Arr[i];

        graph[from].push(to);
        graph[to].push(from)
    }

    let dfsDone = false;
    let circular = [];

    const dfs = (now,prev) =>{
        if(dfsDone) return;

        for(let i =0; i<graph[now].length; i++){
            let val = graph[now][i]
            if(!dfsVisit[val]){
                dfsVisit[val] = true;
                pool.push(val);
                dfs(val,now);
                pool.pop();
                dfsVisit[val] = false;
            }else if(val !== prev){
                circular = pool.slice(pool.indexOf(val),pool.length)
                dfsDone = true;
                return;
            }
        }
    }

    const pool = [1];
    dfsVisit[1] = true;
    dfs(1)

    const bfs = (needVisit,visited) =>{
        while(needVisit.length){
            let [now,count] = needVisit.shift();
            if(circular.includes(now)){
                result.push(count);
                return;
            }
            visited[now] = true;
            for(let item of graph[now]){
                if(!visited[item]){
                    needVisit.push([item,count+1])
                }
            }
        }
    }

    for(let i =1; i<=N; i++){
        bfs([[i,0]],[])
    }

    console.log(result.join(' '))
}