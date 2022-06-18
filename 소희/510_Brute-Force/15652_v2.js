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

function recFunc(k) {
  let answer = "";
  if (k == M) {
    let sol = "";
    for (let i = 0; i < M; i++) {
      sol += selected[i].toString() + " ";
    }
    return sol + "\n";
  }
  let min = selected[k - 1] - 1;
  if (k < 1) {
    min = 0;
  }
  for (let cand = min; cand < N; cand++) {
    selected[k] = cand + 1;
    answer += recFunc(k + 1);
    selected[k] = "";
  }
  return answer;
}

const solution = () => {
  const answer = recFunc(0);
  console.log(answer);
};

solution();
