import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPrimeNumbersEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		String[] arr = input.split(" ");
		int min = Integer.parseInt(arr[0]);
		int max = Integer.parseInt(arr[1]);
		
		for(int i = min; i < max; i++)
		{
			if(i == 1)
				continue;
			
			for(int j = 2; j < i; j++)
			{
				if(i%j == 0)
					break;
				
				if(i - 1 == j)
				{
					System.out.println(i);
				}
			}
		}
	}
}
