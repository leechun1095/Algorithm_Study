import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmmnLeastNumberEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inArr = new String[4];
		int lines = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= lines; i++)
		{
			String input = br.readLine();
			String[] arr = input.split(" ");
			int no1 = Integer.parseInt(arr[0]);
			int no2 = Integer.parseInt(arr[1]);

			int cmmnMultiple = 0;
			
			for(int j = 2; j <= 45000; j++)
			{
				if(j % no1 == 0 && j % no2 == 0)
				{
					cmmnMultiple = j;
					break;
				}				
			}		

			System.out.println(cmmnMultiple);
		}
		
		System.out.println("Complete");
	}

}
