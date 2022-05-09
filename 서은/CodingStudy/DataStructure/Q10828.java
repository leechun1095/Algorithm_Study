package DataStructure;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Q10828 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numMethod = in.nextInt(); // 입력 받는 명령 개수

        Stack<String> stack = new Stack<>(); // 스택 선언
        ArrayList<String> total = new ArrayList<>(); //출력을 위한 list 작성

        for (int i = 0; i < numMethod; i++) {
            String method = in.nextLine();
            String[] strAry = method.split(" ");
            String val; // 추가할 값
            if (strAry.length > 1) {
                val = strAry[1];
            } else {
                val = " ";
            }

            switch (strAry[0]) {
                case "push":
                    stack.push(val);
                    break;
                case "pop":
                    if (stack.empty()) {
                        total.add("-1");
                    } else {
                        total.add(stack.pop());
                    }
                    break;
                case "size":
                    int size = stack.size();
                    total.add(Integer.toString(size));
                    break;
                case "empty":
                    if (stack.empty()) {
                        total.add("1");
                    } else {
                        total.add("0");
                    }
                    break;
                case "top":
                    if (stack.empty()) {
                        total.add("-1");
                    } else {
                        total.add(stack.peek());
                    }
            }

            // 출력
            for (String k : total) {
                System.out.println(k);
            }
        }
    }
}
