const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  let results = [];
  let arr = input().split(" ").map(Number);
  NGE();
  console.log(results.join(" "));

  function NGE() {
    // 스택: LIFO
    let stack = [];
    let curIdx = 0;

    while (true) {
      let len = stack.length;
      // 스택이 비었거나 스택에 마지막으로 넣은 숫자보다 작거나 같은 수면
      // 그 수의 인덱스를 스택에 넣기
      if (curIdx == N) {
        popStack();
        results[N - 1] = -1;
        if (stack.length) stack.forEach((idxElem) => (results[idxElem] = -1));
        return;
      }
      if (len == 0 || arr[curIdx] <= arr[stack[len - 1]]) {
        stack.push(curIdx);
        curIdx++;
      } else {
        popStack(); // 스택에 들어있는 수를 확인해서 조건에 맞으면 뽑아낸다
      }

      function popStack() {
        // 스택에 있던 수가 curIdx 번째 수보다 작으면 추출
        while (arr[stack[stack.length - 1]] < arr[curIdx]) {
          let idx = stack.pop();
          // 추출된 수의 NGE는 curIdx번째 값
          results[idx] = arr[curIdx];
        }
      }
    }
  }
};

let _line = 0;
const input = () => stdin[_line++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  solution();
  process.exit();
});
