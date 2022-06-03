import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ������ �� : Ǯ�� ���� ǰ 
public class Q11057 {

	static final int mod = 10007;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] dp = new int[N+1][10];
		int rtn = 0;
        // int �� �ϸ� Ʋ����, long���� �ϸ� �³� �� 
        long rtval = 0;
        // int rtval = 0; 
		
		// D[N][L] : N ���� / L �������� / ���� �� k 
		// ��ȭ�� D[N][L] += D[N-1][k];
		
		// 1��  or �� ���ڸ��� 1 �� �� 
        // 0�� ���ڸ� �� �� �ִ�. ��ܼ��� �ٸ� �� 
		for(int i = 0; i<=9; i++)
			dp[1][i] = 1;
		
		for(int i = 2; i<= N; i++) // N ���� 
		{
			for(int L = 0; L<=9; L++)
			{
                // 3�� for ��
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

