import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inArr = new String[4];
		int lines = Integer.parseInt(br.readLine());

		String input = br.readLine();
		String[] arr = input.split(" ");
		int i = 0;
		int cnt = 0;
		
		for(i : arr)
		{
			for(int j=2;j<i;j++)
			{
				if(i == 1)
					break;
				
				if(i%j == 0)
					break;
				
				if(j-1 == i)
					cnt += 1;
			}
		}

		System.out.println(cmmnMultiple);
		
		System.out.println("Complete");
	}

}
