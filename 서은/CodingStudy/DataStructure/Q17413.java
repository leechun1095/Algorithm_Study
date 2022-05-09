package DataStructure;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Stack;
// 무엇인가 문제
public class Q17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        boolean inout = true;
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '<') {
                inout = false;
                sb.append('<');
            } else if (input.charAt(i) == '>') {
                inout = true;
                sb.append('>');
            } else {
                // <> 안에 있는 경우
                if (!inout) {
                    sb.append(input.charAt(i));
                } else if (inout) { // <> 밖에 있는 경우
                    if (input.charAt(i) != ' ') {
                        stack.push(input.charAt(i));
                    } else {
                        //sb에 stack에서 꺼내온 값 추가 - stack이 empty할때까지
                        //공백 추가
                        while (!stack.empty()) {
                            sb.append(stack.pop());
                        }
                        sb.append(' ');
                    }
                }
                // 마지막 단어 stack에서 출력
                while (!stack.empty()) {
                    sb.append(stack.pop());
                }
            }
        }
        System.out.println(sb);
    }
}
