import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10844_EasyStairNo {

	static final int mod = 1000000000;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] dp = new int[N+1][10];
		int rtn = 0;
		
		// D[N][L] : N 개수 / L 마지막수
		// 점화식 D[N][L] = D[N-1][L-1] + D[N-1][L+1];
		
		// 1개  or 맨 끝자리에 1 할 당 
		for(int i = 1; i<=9; i++)
			dp[1][i] = 1;
		
		for(int i = 2; i<= N; i++) // N 까지 
		{
			for(int L = 0; L<=9; L++)
			{
				// System.out.println("i: " + i + " L: "+ L);
				
				// By myself
				// Solution처럼 분리를 해 줘야, 
				// L+1>9 알땨 L-1 더하고, L-1<0 알땨 L+1 더한다.  
				// if(L+1 > 9 || L-1 < 0) continue;
				if(L+1 > 9)
					dp[i][L] += dp[i-1][L-1];
				else if(L-1 < 0)
					dp[i][L] += dp[i-1][L+1];
				else
					dp[i][L] = dp[i-1][L+1] + dp[i-1][L-1];
				
				// Solution
				// 위에서 선언할 때 초기화 된거 아닌가?
//				dp[i][L] = 0;				
//				if(L-1 >= 0) dp[i][L] += dp[i-1][L-1];  
//				if(L+1 <= 9) dp[i][L] += dp[i-1][L+1];
			}
		}
		
		// 여기도 직관적으로 이해 안 되네  
		// [2][2]는 2개
		// [2][3]는 2개
		// .......
		for(int i = 0; i <= 9; i++)
			rtn += dp[N][i];
		
		System.out.println(rtn % mod);
	}
}
