package hellow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Stack;

public class IronBarEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		int opn = 0;
		int totalCnt = 0;
		int cutCnt = 0;
		//String input = "()(((()())(())()))(())";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String rep = input.replace("()", "|");
		char[] chrs = rep.toCharArray();

		// ( 에서 )까지 () 수 + 1
		// "|(((||)(|)|))(|)"
		
		for(i=0;i<chrs.length;i++)
		{
			if(chrs[i] == '|')
				continue;
			
			if(chrs[i] == '(')
			{
				opn += 1;
				
				for(j=i+1;j<chrs.length;j++)
				{
					if(chrs[j] == ')')
						opn -= 1;
					
					if(chrs[j] == '(')
						opn += 1;
					
					if(chrs[j] == '|')
						cutCnt += 1;	
					
					if(opn == 0)
					{
						if(chrs[j] == ')')
						{
							cutCnt += 1; //laserCut +1 → 총 개수 
							break;
						}
					}
				}
				totalCnt += cutCnt;
				// System.out.println(totalCnt + "/" + cutCnt);
				opn = 0;
				cutCnt = 0;
			}
		}

		System.out.println(totalCnt);
	}

}
