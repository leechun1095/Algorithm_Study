import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPrimeNumberEx_2 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		String[] arr = input.split(" ");
		int fromNo = Integer.parseInt(arr[0]);
		int toNo = Integer.parseInt(arr[1]);
		
		int[] arrNo = new int[toNo];
		
		for(int a = 0; a <= fromNo; a++)
		{
			arrNo[a] = 0;
		}
		
		for(int a = fromNo; a < toNo; a++)
		{
			arrNo[a] = a;
		}
		
		// 아리스토스테네스 체 
		for(int i = 2; i < toNo; i++)
		{
			for(int a = i+i; a < toNo; a += i)
			{
				if(arrNo[a] == 0) continue; 
				
				arrNo[a] = 0;
			}			
		}
		
		for(int i = fromNo; i < toNo; i++)
		{
			if(arrNo[i] != 0) 
				System.out.println(i);
		}
		
	}
}
