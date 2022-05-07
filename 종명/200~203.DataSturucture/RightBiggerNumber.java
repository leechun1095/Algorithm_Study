package hellow;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class RightBiggerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int j = 0;
		int a = 0;
		
		String[] input = {"4","3 5 2 7"};
		String[] strArr = new String[] {};
		Stack<String> stk = new Stack<String>();
		Queue<String> qq = new LinkedList<String>();
		String newStr = "";
		
		strArr = input[1].split(" ");

		for(i=0;i <= strArr.length; i++)
		{
			// 맨 마지막 수 처리 
			if(i+1 == strArr.length)
			{
				qq.add("-1");
				break;				
			}
			
			for(j=i+1; j < strArr.length; j++)
			{
				if(Integer.parseInt(strArr[i]) < Integer.parseInt(strArr[j]))
				{
					qq.add(strArr[j]);
					break;	
				}
			}
		}
		
		for(a=0;a<Integer.parseInt(input[0]);a++)
		{
			if(a == 0)
				newStr = qq.poll();
			else
				newStr += " " + qq.poll();
		}
		System.out.println(newStr);
	}

}
