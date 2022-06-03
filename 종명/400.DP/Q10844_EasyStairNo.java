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
		
		// D[N][L] : N ���� / L ��������
		// ��ȭ�� D[N][L] = D[N-1][L-1] + D[N-1][L+1];
		
		// 1��  or �� ���ڸ��� 1 �� �� 
		for(int i = 1; i<=9; i++)
			dp[1][i] = 1;
		
		for(int i = 2; i<= N; i++) // N ���� 
		{
			for(int L = 0; L<=9; L++)
			{
				// System.out.println("i: " + i + " L: "+ L);
				
				// By myself
				// Solutionó�� �и��� �� ���, 
				// L+1>9 �ˋx L-1 ���ϰ�, L-1<0 �ˋx L+1 ���Ѵ�.  
				// if(L+1 > 9 || L-1 < 0) continue;
				if(L+1 > 9)
					dp[i][L] += dp[i-1][L-1];
				else if(L-1 < 0)
					dp[i][L] += dp[i-1][L+1];
				else
					dp[i][L] = dp[i-1][L+1] + dp[i-1][L-1];
				
				// Solution
				// ������ ������ �� �ʱ�ȭ �Ȱ� �ƴѰ�?
//				dp[i][L] = 0;				
//				if(L-1 >= 0) dp[i][L] += dp[i-1][L-1];  
//				if(L+1 <= 9) dp[i][L] += dp[i-1][L+1];
			}
		}
		
		// ���⵵ ���������� ���� �� �ǳ�  
		// [2][2]�� 2��
		// [2][3]�� 2��
		// .......
		for(int i = 0; i <= 9; i++)
			rtn += dp[N][i];
		
		System.out.println(rtn % mod);
	}
}
