package hellow;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

//push X: 정수 X를 스택에 넣는 연산이다.
//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 스택에 들어있는 정수의 개수를 출력한다.
//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner scan = new Scanner(System.in);
		int i = 0;
		String[] input = {"14", "push 1", "push 2", "top", "size", "empty","pop","pop", "pop", "size", "empty", "pop", "push 3", "empty", "top"};  
		Stack<String> stk = new Stack<String>();
		
		for(i=1;i < Integer.parseInt(input[0])+1; i++)
		{
			if(input[i].contains("push"))
				stk.push(input[i].split(" ")[1]);
			
			if(input[i] == "top")
			{
				if(stk == null)
					System.out.println("-1");
				else
					System.out.println("toppest No. : " + stk.peek());
			}
			
			if(input[i] == "size")
				System.out.println("size : " + stk.size());
			
			if(input[i] == "pop")
			{
				if(stk.empty())
					System.out.println("-1");
				else
					System.out.println("pop : " + stk.pop());
			}
				
			
			if(input[i] == "empty")
			{
				if(stk.empty())
					System.out.println("1");
				else
					System.out.println("0");
			}
		}
	}
}
