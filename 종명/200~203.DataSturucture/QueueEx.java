package hellow;

import java.util.LinkedList;
import java.util.Queue;

//push X: 정수 X를 큐에 넣는 연산이다.
//pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 큐에 들어있는 정수의 개수를 출력한다.
//empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		String[] input = {"15", 
				"push 1", "push 2", 
		"front", "back", "size", "empty",
		"pop","pop", "pop", "size", 
		"empty", "pop", "push 3", "empty", "front"};  
		
		//자바는 LinkedList로 생성 해야 함 ★ 
		Queue<String> qq = new LinkedList<String>(); 
		
		for(i=1;i < Integer.parseInt(input[0])+1; i++)
		{
			if(input[i].contains("push"))
				qq.add(input[i].split(" ")[1]);
			
			if(input[i] == "front")
			{
				if(qq == null)
					System.out.println("-1");
				else
					System.out.println("toppest No. : " + qq.peek());
			}
			
			if(input[i] == "size")
				System.out.println("size : " + qq.size());
			
			if(input[i] == "pop")
			{
				if(qq.isEmpty())
					System.out.println("-1");
				else
					System.out.println("pop : " + qq.poll());
			}
				
			
			if(input[i] == "empty")
			{
				if(qq.isEmpty())
					System.out.println("1");
				else
					System.out.println("0");
			}
		}
		
		
	}

}
