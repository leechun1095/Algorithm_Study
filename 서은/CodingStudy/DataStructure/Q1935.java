package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1935 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Double> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        char[] cmd = br.readLine().toCharArray();

        double [] num = new double[N]; // 소수점 표기를 위해 double 사용

        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < cmd.length; i++) {
            if ( 'A' <= cmd[i] && cmd[i] <= 'Z') {
                int index = (int)cmd[i] - 65;
                stack.push(num[index]);
            } else {
                double answer1 = stack.pop();
                double answer2 = stack.pop();

                switch (cmd[i]) {
                    case '+':
                        stack.push(answer2 + answer1);
                        break;
                    case '-':
                        stack.push(answer2 - answer1);
                        break;
                    case '*':
                        stack.push(answer2 * answer1);
                        break;
                    case '/':
                        stack.push(answer2 / answer1);
                        break;
                }
            }
        }
//        for(char k : cmd) {
//            switch (k) {
//                case '+':
//                    stack.push(stack.pop()+stack.pop());
//                    break;
//                case '-':
//                    int temp1 = stack.pop();
//                    int temp2 = stack.pop();
//                    stack.push(temp2-temp1);
//                    break;
//                case '*':
//                    stack.push(stack.pop()*stack.pop());
//                    break;
//                case '/':
//                    int temp3 = stack.pop();
//                    int temp4 = stack.pop();
//                    stack.push(temp4/temp3);
//                    break;
//                default:
//                    break;
//            }
//            stack.push(num[((int)k-64)]);
//        }
        System.out.println(String.format("%.2f", stack.pop()));
    }
}
