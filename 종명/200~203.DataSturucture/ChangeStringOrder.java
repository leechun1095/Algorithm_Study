package hellow;

public class ChangeStringOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		String[] input = {"2", 
				"I am happy today", 
				"We want to win the first prize"
				};

		String[] tmp1 = new String[] {};
		String[] output = new String[] {"","",""};
		String newStr = "";
		String tmpStr = "";
		int offset = 0;
		int a = 0;
		
		for(i=1;i < Integer.parseInt(input[0])+1; i++)
		{
			tmp1 = input[i].split(" ");
			for(j=0; j<tmp1.length;j++)
			{
				// offset = tmp1[j].length() - 1;
				char[] chars = tmp1[j].toCharArray();
				for(a=chars.length - 1; a >= 0 ;a--)
				{
					newStr += chars[a];
					System.out.println("add newStr : " + newStr);
				}
						
				tmpStr += " " + newStr;
				System.out.println("add tmpStr : " + tmpStr);
				newStr = "";
				// System.out.println(newStr);
			}
			output[i] = tmpStr;
			System.out.println("assign output[i] : " + output[i]);
			tmpStr = "";
		}
		
		for(int k=0;k<input.length;k++)
		{
			System.out.println(output[k]);
		}
	}

}
