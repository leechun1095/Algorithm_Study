package H_기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q9020_2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			boolean[] primeNumberArr = getPrimeNumberArr(num);
			
			int a = num/2;
			int b = num/2;
			while(a > 0) {
				if(!primeNumberArr[a] && !primeNumberArr[b]) {
					sb.append(String.valueOf(a))
					.append(" ")
					.append(String.valueOf(b))
					.append("\n");
					break;
				}
				a--;
				b++;
			}
			
		}
			
		System.out.println(sb.toString());	
		
		br.close();
	}

	private static boolean[] getPrimeNumberArr(int n) {
		boolean[] arr = new boolean[n+1];
		arr[0] = true;
		arr[1] = true;
		
		for(int i=2; i<= Math.sqrt(arr.length); i++) {
			if(arr[i]) continue;
			
			for(int k=i*i; k <= n; k += i) {
				arr[k] = true;
			}
		}
		
		return arr;
	}

}
