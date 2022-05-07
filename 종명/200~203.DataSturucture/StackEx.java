package hellow;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

//push X: ���� X�� ���ÿ� �ִ� �����̴�.
//pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
//empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
//top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.

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
