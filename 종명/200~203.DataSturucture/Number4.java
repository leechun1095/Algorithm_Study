package hellow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		String input = br.readLine();
		Stack<Integer> svLst = new Stack<Integer>();
		Stack<Integer> svLst2 = new Stack<Integer>();
		
		for(String tmpStr : input.split(" "))
			svLst.push(Integer.parseInt(tmpStr));
		
		String ss = "";
		for(int tmp : svLst)
		{
			i++;
			if(i%2 == 1) //È¦¼ö 
				ss = Integer.toString(tmp);
			else
			{
				ss += Integer.toString(tmp);
				svLst2.push(Integer.parseInt(ss));
			}
		}
		
		int iVal = 0;
		String rtVal = "";
		for(int tmp2 : svLst2)
			iVal += tmp2;
		
		System.out.println(iVal);
	}

}
