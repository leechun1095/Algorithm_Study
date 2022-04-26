const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

class Node {
  constructor(value) {
    this.value = value;
    this.next = null;
  }
}

class Queue {
  constructor() {
    this.first = null;
    this.last = null;
    this.size = 0;
  }

  push(value) {
    let node = new Node(value);
    if (!this.first) {
      this.first = node;
    } else this.last.next = node;
    this.last = node;
    this.size++;
    return null;
  }

  pop() {
    let node = this.first;
    if (!node) return -1;
    if (this.first == this.last) {
      this.first = this.last = null;
    } else this.first = this.first.next;
    this.size--;
    return node.value;
  }

  getSize() {
    return this.size;
  }

  empty() {
    return this.size == 0 ? 1 : 0;
  }

  front() {
    return this.first ? this.first.value : -1;
  }

  back() {
    return this.last ? this.last.value : -1;
  }
}

const solution = () => {
  const N = input();
  let arr = [];
  for (let i = 0; i < N; i++) arr[i] = input().split(" ");

  let queue = new Queue();
  let results = arr.map((elem) => getCommand(...elem));
  console.log(results.filter((elem) => elem != null).join("\n"));

  function getCommand(command, value) {
    switch (command) {
      case "push":
        return queue.push(value);
      case "pop":
        return queue.pop();
      case "size":
        return queue.getSize();
      case "empty":
        return queue.empty();
      case "front":
        return queue.front();
      case "back":
        return queue.back();
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
