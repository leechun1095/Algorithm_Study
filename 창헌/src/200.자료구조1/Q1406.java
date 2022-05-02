package 자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1406 {

	public static void main(String[] args) throws IOException {
		// 에디터
		// 명령어가 수행되기 전 커서의 위치는 문장의 맨 뒤에 위치한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
        String str = br.readLine();
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        //커서가 문장의 마지막에 있기 때문에 모든 문자열을 왼쪽 스택에 담는다.
        for(int i=0; i<str.length(); i++) {
        	leftStack.push(str.charAt(i));
        }
        
        int N  = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N; i++) {
        	String cmd = br.readLine();
//        	System.out.println("##### chatAt(1) : [" + cmd.charAt(1) + "]");
        	switch(cmd.charAt(0)) {
        		case 'L':
        			if(leftStack.empty()) {
        				break;
        			}
        			rightStack.push(leftStack.pop());
        			break;
        		case 'D':
        			if(rightStack.empty()) {
        				break;
        			}
        			leftStack.push(rightStack.pop());
        			break;
        		case 'B':
        			if(leftStack.empty()) {
        				break;
        			}
        			leftStack.pop();
        			break;
        		case 'P':
        			leftStack.push(cmd.charAt(2)); // 공백이 charAt(1)
        			break;
        	}
        }
        br.close();
        
        // 마무리 작업1 (합치기)
        while(!leftStack.empty()) {
        	rightStack.push(leftStack.pop());
        }
        
        // 마무리 작업2
        while(!rightStack.empty()) {
        	sb.append(rightStack.pop());
        }
        System.out.println(sb);

	}
}
