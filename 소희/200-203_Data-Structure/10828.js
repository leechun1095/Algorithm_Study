const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

class Node {
  constructor(value) {
    this.value = value;
    this.next = null;
  }
}

class Stack {
  constructor() {
    this.first = null;
    this.last = null;
    this.size = 0;
  }
  push(value) {
    let node = new Node(value);
    if (!this.first) {
      this.first = this.last = node;
    } else {
      let temp = this.first;
      this.first = node;
      this.first.next = temp;
    }
    this.size++;
    return null;
  }
  pop() {
    if (!this.first) return -1;
    let node = this.first;
    if (this.first == this.last) {
      this.first = null;
    } else this.first = this.first.next;
    this.size--;
    return node.value;
  }
  getSize() {
    return this.size;
  }
  isEmpty() {
    return this.size == 0 ? 1 : 0;
  }
  top() {
    if (!this.first) return -1;
    return this.first.value;
  }
}

let cnt = 0;
const input = () => stdin[cnt++];

function getCommand(command, num) {
  switch (command) {
    case "push":
      return stack.push(num);
    case "pop":
      return stack.pop();
    case "size":
      return stack.getSize();
    case "empty":
      return stack.isEmpty();
    case "top":
      return stack.top();
  }
}

const N = Number(input());
const stack = new Stack();
let results = [];
for (let i = 0; i < N; i++) {
  let [command, num] = input().split(" ");
  results.push(getCommand(command, num));
}
console.log(results.filter((elem) => elem != null).join("\n"));
