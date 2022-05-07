package hellow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SuffixArr {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int j = 0;
		int k = 0;
		int lngth = 0;
		// String input = "baekjoon";
		String str1 = "";
		String str2 = "";
		Queue<String> lst = new LinkedList<String>();
		ArrayList<String> arr = new ArrayList<String>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String[] sArr = new String[input.length()];
		
		for(int i=0;i<input.length();i++) {
			sArr[i] = input.substring(i);
			// arr.add(input.substring(i)); 
			// lst.add(input.substring(i));
		}
		
		Arrays.sort(sArr);
		
		for(String arrStr : sArr)
		{
			System.out.println(arrStr);
		}		
		
		//for(j=0;j<iSz;j++)
//		//for(j=0;j<lst.size();j++)
//		while(!lst.isEmpty())
//		{
//			if(j==0)
//			{
//				str1 = lst.poll();
//				j += 1;
//			}
//			
//			str2 = lst.poll();
//			
//			lngth = str1.length() > str2.length() ? str2.length() : str1.length();
//			
//			char[] ch1 = str1.toCharArray();
//			char[] ch2 = str2.toCharArray();
//			
//			for(k=0;k<lngth;k++)
//			{
//				if(ch1[k] > ch2[k])
//				{
//					arr.add(str2);
//					break;
//				}
//				else if(ch1[k] < ch2[k])
//				{
//					arr.add(str1);
//					str1 = str2;
//					break;
//				}
//				// 같은 경우는 for문으로 돌아가서 다음 char 검사
//			}
//		}
	}

}
