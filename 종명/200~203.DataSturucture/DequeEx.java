package hellow;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;

public class DequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		push_front X: 정수 X를 덱의 앞에 넣는다.
//		push_back X: 정수 X를 덱의 뒤에 넣는다.
//		pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		size: 덱에 들어있는 정수의 개수를 출력한다.
//		empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
//		front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		
		int i = 0;
		String[] input = {"15", "push_back 1", "push_front 2", 
		"front", "back", "size", "empty",
		"pop_front","pop_back", "pop_front", 
		"size", "empty", "pop_back", "push_front 3", "empty", "front"};  
		
		Deque<String> deq = new LinkedList<String>();
		
		for(i=1;i < Integer.parseInt(input[0])+1; i++)
		{
			if(input[i].contains("push_front"))
				deq.addFirst(input[i].split(" ")[1]);
			
			if(input[i].contains("push_back"))
				deq.addLast(input[i].split(" ")[1]);
			
			if(input[i].contains("pop_front"))
				System.out.println(deq.pollFirst());
			
			if(input[i].contains("pop_back"))
				System.out.println(deq.pollLast());
			
			if(input[i].contains("front"))
				System.out.println(deq.peekFirst());
			
			if(input[i].contains("back"))
				System.out.println(deq.peekLast());			
			
			if(input[i] == "size")
				System.out.println("size : " + deq.size());
			
			if(input[i] == "empty")
			{
				if(deq.isEmpty())
					System.out.println("1");
				else
					System.out.println("0");
			}
			
			if(input[i] == "pop")
			{
				if(deq.isEmpty())
					System.out.println("-1");
				else
					System.out.println("pop : " + deq.pop());
			}			
		}		
		
	}

}
