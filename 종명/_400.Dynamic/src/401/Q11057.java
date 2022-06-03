import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 오르막 수 : 풀이 보고 품 
public class Q11057 {

	static final int mod = 10007;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] dp = new int[N+1][10];
		int rtn = 0;
        // int 로 하면 틀리고, long으로 하면 맞네 ★ 
        long rtval = 0;
        // int rtval = 0; 
		
		// D[N][L] : N 개수 / L 마지막수 / 앞의 수 k 
		// 점화식 D[N][L] += D[N-1][k];
		
		// 1개  or 맨 끝자리에 1 할 당 
        // 0이 앞자리 될 수 있다. 계단수와 다른 점 
		for(int i = 0; i<=9; i++)
			dp[1][i] = 1;
		
		for(int i = 2; i<= N; i++) // N 까지 
		{
			for(int L = 0; L<=9; L++)
			{
                // 3중 for 문
				for(int k = 0; k<=L; k++)
				{
					dp[i][L] += dp[i-1][k];
					dp[i][L] %= mod;
				}
			}
		}
		
		rtval = 0;
        
		for(int i = 0; i <= 9; i++)
			rtval += dp[N][i];
		rtval %= mod;
		System.out.println(rtval);
	}
}

