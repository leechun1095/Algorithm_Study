package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11726_2xnTiling {
	public static int[] memo;
	
	public static void tiling(int num) {
		memo[num] = memo[num-1]+memo[num-2];
		if(memo[num]>10007) memo[num]=memo[num]%10007;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		memo = new int[num+1];
		memo[0]=0;
		memo[1]=1;
		if(num>1) memo[2]=2;
		if(num>2) {
			for(int i=3; i<=num; i++) {
				tiling(i);
			}
		}
		
		System.out.println(memo[num]);
	}
}
