import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SharedNumberEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String[] arr = input.split(" ");
		
		int no1 = Integer.parseInt(arr[0]);
		int no2 = Integer.parseInt(arr[1]);
		
		// int bigger = no1 > no2 ? no1 : no2;
		int smaller = no1 > no2 ? no2 : no1;

		int cmmnDivisor = 0;
		int cmmnMultiple = 0;
		
		for(int i = smaller; i > 2; i--)
		{
			if(no1 % i == 0 && no2 % i == 0)
			{
				cmmnDivisor = i;
				break;
			}
		}
		
		for(int i = 2; i<10000; i++)
		{
			if(i % no1 == 0 && i % no2 == 0)
			{
				cmmnMultiple = i;
				break;
			}				
		}		

		System.out.println(cmmnDivisor);
		System.out.println(cmmnMultiple);
	}

}
