const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const [N, M] = input()
  .split(" ")
  .map((x) => parseInt(x));
const selected = new Array(M);
const used = new Array(N);

function recFunc(k) {
  let answer = "";
  if (k == M) {
    let sol = "";
    for (let i = 0; i < M; i++) {
      sol += selected[i].toString() + " ";
    }
    return sol + "\n";
  }
  for (let cand = 0; cand < N; cand++) {
    if (used[cand] == 1) {
      continue;
    }
    selected[k] = cand + 1;
    used[cand] = 1;
    answer += recFunc(k + 1);
    selected[k] = "";
    used[cand] = 0;
  }
  return answer;
}

const solution = () => {
  const answer = recFunc(0);
  console.log(answer);
};

solution();
