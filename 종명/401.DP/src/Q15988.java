import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1,2,3 더하기 3

public class Q15988 {

	static final long mod = 1000000009L;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lines = Integer.parseInt(br.readLine());
		double[] cnt = new double[lines];
				
		for(int i = 1; i <= lines; i++)
		{
			long n =  Long.parseLong(br.readLine());
			// int[] d = new int[n+1];
			long[] d = new long[1000001];
			
			d[(int)n] = n;
			cnt[i-1] = plus(d[(int)n] % mod);
		}

		for(double ct : cnt)
			System.out.println((int)ct);
		
	}
	
	// 시간 초과 
	static double plus(double a)
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