import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ÀÌÄ£¼ö(PinaryNumber) 
public class Q2193 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int n = Integer.parseInt(input);
		int cnt = recursive(n);
		
		System.out.println(cnt);
	}
	
	static int recursive(int i)
	{
		if(i == 0)
			return 0;
		else if(i==1 || i==2)
			return 1;
		else
			return recursive(i-1) + recursive(i-2);
	}

}
