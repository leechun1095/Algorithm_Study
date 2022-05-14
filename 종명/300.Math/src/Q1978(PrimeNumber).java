import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inArr = new String[4];
		int lines = Integer.parseInt(br.readLine());

		String input = br.readLine();
		String[] arr = input.split(" ");
		// int i = 0;
		int cnt = 0;
		boolean flag = true;
		
		for(String sTmp : arr)
		{
			int i = Integer.parseInt(sTmp);
			if(i <= 1)
				continue;
				
			for(int j=2;j<i;j++)
			{
				if(i%j == 0)
				{
					flag = false;
					break;
				}
				else
					continue;
			}
			
			if(flag == true)
				cnt += 1;
			
			flag = true;
		}
		System.out.println(cnt);		
		System.out.println("Complete");
	}

}
