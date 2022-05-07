package hellow;

import java.util.LinkedList;
import java.util.Queue;

//push X: ���� X�� ť�� �ִ� �����̴�.
//pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//size: ť�� ����ִ� ������ ������ ����Ѵ�.
//empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
//front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		String[] input = {"15", 
				"push 1", "push 2", 
		"front", "back", "size", "empty",
		"pop","pop", "pop", "size", 
		"empty", "pop", "push 3", "empty", "front"};  
		
		//�ڹٴ� LinkedList�� ���� �ؾ� �� �� 
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
