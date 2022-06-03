import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9095 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lines = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= lines; i++)
		{
			int n = Integer.parseInt(br.readLine());
			int[] d = new int[n+1];
			d[n] = n;
			int cnt = plus(d[n]);
			
			System.out.println(cnt);
		}

	}
	
	static int plus(int a)
	{
		if(a == 0)
			return 0;
		else if(a == 1)
			return 1;
		else if(a == 2)
			return 2;
		else if(a == 3)
			return 4;
		else
			return plus(a-1) + plus(a-2) + plus(a-3); 
	}

}
