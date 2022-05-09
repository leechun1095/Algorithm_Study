package DataStructure;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Q1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine(); // 입력

        int num = Integer.parseInt(bf.readLine()); // 명령어 개수

        Stack<Character> rightStack = new Stack<>();
        Stack<Character> leftStack = new Stack<>();

        for(int i = 0; i<input.length(); i++) {
            leftStack.push(input.charAt(i));
        }

        for(int i = 0; i < num; i++) {
            String order = bf.readLine(); // 명령문 입력

            switch(order.charAt(0)) {
                case 'L' :
                    if(leftStack.empty()) break; // switch 문을 빠져 나감
                    rightStack.push(leftStack.pop());
                    break;
                case 'D' :
                    if(rightStack.empty()) break;
                    leftStack.push(rightStack.pop());
                    break;
                case 'B' :
                    if(leftStack.empty()) break;
                    leftStack.pop();
                    break;
                case 'P' :
                    leftStack.push(order.charAt(2));
                    break;
            }
        }
        // System.out.println(leftStack.toString() + rightStack.toString()); // Stack 그대로  출력 시 [] 있음

        while(!leftStack.empty()) {
            rightStack.push(leftStack.pop());
        }
        StringBuilder sb = new StringBuilder();

        while (!rightStack.empty()) {
            sb.append(rightStack.pop());
        }
        System.out.println(sb);
    }
}
