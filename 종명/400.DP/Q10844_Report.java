import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ǯ�� ���� ǰ 
public class Q10844_Report {

	static final int mod = 1000000000;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] dp = new int[N+1][10];
		int rtn = 0;
        // int �� �ϸ� Ʋ����, long���� �ϸ� �³� �� 
        long rtval = 0;
        // int rtval = 0; 
		
		// D[N][L] : N ���� / L ��������
		// ��ȭ�� D[N][L] = D[N-1][L-1] + D[N-1][L+1];
		
		// 1��  or �� ���ڸ��� 1 �� �� 
		for(int i = 1; i<=9; i++)
			dp[1][i] = 1;
		
		for(int i = 2; i<= N; i++) // N ���� 
		{
			for(int L = 0; L<=9; L++)
			{
                
				// Solution
				// ������ ������ �� �ʱ�ȭ �Ȱ� �ƴѰ�?
				dp[i][L] = 0;				
				if(L-1 >= 0) dp[i][L] += dp[i-1][L-1];  
				if(L+1 <= 9) dp[i][L] += dp[i-1][L+1];
                dp[i][L] %= mod;
			}
		}
		
		// ���⵵ ���������� ���� �� �ǳ�  
		// [2][2]�� 2��
		// [2][3]�� 2��
		// .......
        
		for(int i = 0; i <= 9; i++)
			rtval += dp[N][i];
		rtval %= mod;
		System.out.println(rtval);
	}
}
