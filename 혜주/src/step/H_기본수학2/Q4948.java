package step.H_기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q4948 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = -1;
		
		while(true) {
			n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			
			int cnt = 0;
			
			boolean[] primeNumberArr = getPrimeNumberArr(n);
			for(int i=n+1; i<= 2*n; i++) {
				if(!primeNumberArr[i]) cnt++;
			}

			System.out.println(cnt);
		}
		
		br.close();
	}

	private static boolean[] getPrimeNumberArr(int n) {
		boolean[] arr = new boolean[2*n+1];
		arr[0] = true;
		arr[1] = true;
		
		for(int i=2; i<= Math.sqrt(arr.length); i++) {
			if(arr[i]) continue;
			
			for(int k=i*i; k <= 2*n; k += i) {
				arr[k] = true;
			}
		}
		
		return arr;
	}

}
