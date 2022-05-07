package hellow;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;

public class DequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		push_front X: ���� X�� ���� �տ� �ִ´�.
//		push_back X: ���� X�� ���� �ڿ� �ִ´�.
//		pop_front: ���� ���� �տ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//		pop_back: ���� ���� �ڿ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//		size: ���� ����ִ� ������ ������ ����Ѵ�.
//		empty: ���� ��������� 1��, �ƴϸ� 0�� ����Ѵ�.
//		front: ���� ���� �տ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//		back: ���� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		
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
