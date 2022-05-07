package hellow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnalyzeStrings {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		int i = 0;
		
		// char[] chLst = new char[];
		// 소문자, 대문자, 숫자, 공백 수 
		while((input = br.readLine()) != null)
		{
			int upper = 0;
			int lower = 0;
			int number = 0;
			int space = 0;
			
			// System.out.println(input);
			
			char[] chLst = input.toCharArray();
			
			for(i=0;i<chLst.length;i++)
			{
				if(chLst[i] >= 'a' && chLst[i] <= 'z')
					lower += 1;
				
				if(chLst[i] >= 'A' && chLst[i] <= 'Z')
					upper += 1;
				
				// if(chLst[i] >= '1' && chLst[i] <= '9')
				if(chLst[i] >= '0' && chLst[i] <= '9')
					number += 1;
				
				if(chLst[i] == ' ')
					space += 1;
			}
			
			System.out.println(lower + " " + upper + " " + number + " " + space);
		}
		
		// System.out.println("Complete");
		
	}

}
