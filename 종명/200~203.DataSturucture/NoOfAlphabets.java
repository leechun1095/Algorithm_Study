package hellow;

public class NoOfAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int j = 0;
		int offset = 0;
		String input = "baekjoon";
		String rtn = "";
		
		char[] ch = input.toCharArray();
		int[] cnt = new int[26];
		
		for(i=0;i<ch.length;i++)
		{
			offset = ch[i] - 'a';
			cnt[offset] += 1;
		}
		
		for(j=0;j<cnt.length;j++)
		{
			if(j == 0)
				rtn += cnt[j];
			else
				rtn += " " + cnt[j]; 
		}
		
		System.out.println(rtn);
	}

}
