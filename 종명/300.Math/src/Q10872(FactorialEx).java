import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// String input = "10";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int in = Integer.parseInt(input);
		int rtVal = 1;
		
		for(int i = 1; i<in; i++)
		{
			rtVal *= i;
		}
		System.out.println(rtVal);
	}

}
