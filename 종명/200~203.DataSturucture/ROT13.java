package hellow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROT13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String input = br.readLine();
		
		// A(65) ~ Z(90)
		// a(97) ~ z(122)
		
		// String input = "Baekjoon Online Judge";
		String input = "One is 1";
		
		String rtVal = "";
		int i = 0;
		
		char[] chLst = input.toCharArray();
		
		for(i=0;i<chLst.length;i++)
		{
			if(chLst[i] == ' ')
				rtVal += ' ';
			else if (chLst[i] >= '1' && chLst[i] <= '9')
				rtVal += chLst[i];
			else
			{
				int iTmp = chLst[i] + 13; // + 인지 - 인지 문제가 아리승? 
				rtVal += Character.toString((char)iTmp);
			}
				
		}
		
		System.out.println(rtVal);		
	}
}
