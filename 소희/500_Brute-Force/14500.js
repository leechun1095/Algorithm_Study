const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const dir = [
  [-1, 0],
  [0, 1],
  [1, 0],
  [0, -1],
];

const solution = () => {
  const [N, M] = input().split(" ").map(Number);
  const dist = 4;
  const arr = [];
  for (let i = 0; i < N; i++) arr[i] = input().split(" ").map(Number);
  let result = 0;
  let visited = [];

  for (let i = 0; i < N; i++) {
    for (let j = 0; j < M; j++) {
      for (let k = 0; k < N; k++) visited[k] = [];
      visited[i][j] = 1;
      dfs(i, j, 0, arr[i][j]);
      bfs(i, j);
    }
  }
  return result;

  function dfs(r, c, k, sum) {
    if (k + 1 === dist) {
      result = Math.max(result, sum);
      return;
    } else {
      for (let i = 0; i < 4; i++) {
        const nr = r + dir[i][0];
        const nc = c + dir[i][1];
        if (nr < 0 || nc < 0 || nr >= N || nc >= M) continue;
        if (visited[nr] && visited[nr][nc]) continue;
        if (!visited[nr]) visited[nr] = [];
        visited[nr][nc] = 1;
        dfs(nr, nc, k + 1, sum + arr[nr][nc]);
        visited[nr][nc] = 0;
      }
    }
  }

  function bfs(r, c) {
    for (let i = 0; i < 4; i++) {
      let sum = arr[r][c];
      for (let j = 0; j < 4; j++) {
        if (i === j) continue;
        const nr = r + dir[j][0];
        const nc = c + dir[j][1];
        if (nr < 0 || nc < 0 || nr >= N || nc >= M) break;
        sum += arr[nr][nc];
      }
      result = Math.max(result, sum);
    }
  }
};

let _line = 0;
const input = () => stdin[_line++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  console.log(solution());
  process.exit();
});
