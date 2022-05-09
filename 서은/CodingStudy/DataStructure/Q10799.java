package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Q10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        //char [] inputArr = input.toCharArray();

        int total = 0;
        Stack<Character> stack = new Stack<>();

        for(int i =0; i<input.length(); i++) {
            if(input.charAt(i) == '(') {
                stack.push(input.charAt(i));
            } else if(input.charAt(i) == ')') {
                if(input.charAt(i-1) == '(') {
                    stack.pop();
                    if(!stack.empty()) {
                        total += stack.size();
                    }
                } else if(input.charAt(i-1) == ')') {
                    total += 1;
                    stack.pop();
                }
            }
        }
        System.out.println(total);
    }
}
