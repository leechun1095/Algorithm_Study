import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 풀이 보고 품 
public class Q10844_Report {

	static final int mod = 1000000000;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] dp = new int[N+1][10];
		int rtn = 0;
        // int 로 하면 틀리고, long으로 하면 맞네 ★ 
        long rtval = 0;
        // int rtval = 0; 
		
		// D[N][L] : N 개수 / L 마지막수
		// 점화식 D[N][L] = D[N-1][L-1] + D[N-1][L+1];
		
		// 1개  or 맨 끝자리에 1 할 당 
		for(int i = 1; i<=9; i++)
			dp[1][i] = 1;
		
		for(int i = 2; i<= N; i++) // N 까지 
		{
			for(int L = 0; L<=9; L++)
			{
                
				// Solution
				// 위에서 선언할 때 초기화 된거 아닌가?
				dp[i][L] = 0;				
				if(L-1 >= 0) dp[i][L] += dp[i-1][L-1];  
				if(L+1 <= 9) dp[i][L] += dp[i-1][L+1];
                dp[i][L] %= mod;
			}
		}
		
		// 여기도 직관적으로 이해 안 되네  
		// [2][2]는 2개
		// [2][3]는 2개
		// .......
        
		for(int i = 0; i <= 9; i++)
			rtval += dp[N][i];
		rtval %= mod;
		System.out.println(rtval);
	}
}
