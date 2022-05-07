package hellow;

public class ParenthesisEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		int val = 0;
		String[] input = {"3", "((", "))", "())(()"};
		
		for(i=1;i < Integer.parseInt(input[0])+1; i++)
		{
			char[] chs = input[i].toCharArray();
			for(j=0; j<chs.length; j++)
			{
				if(chs[j] == '(')
					val += 1;
				else if(chs[j] == ')')
					val -= 1;
				
				// ´ÝÈûÀÌ ¸ÕÀú ¿­¸° ÄÉÀÌ½º 
				if(val < 0) 
					break;
			}
			if(val == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
			val = 0;
		}
	}
}
