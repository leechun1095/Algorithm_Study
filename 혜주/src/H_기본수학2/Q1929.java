package H_기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q1929 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		boolean[] primeNumberArr = getPrimeNumberArr(N);
		for(int i=M; i<=N; i++) {
			if(!primeNumberArr[i]) {
				sb.append(i + "").append("\n");
			}
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}

	private static boolean[] getPrimeNumberArr(int num) {
		boolean[] arr = new boolean[num+1];
		arr[0] = true;
		arr[1] = true;
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(arr[i]) {
				continue;
			}
			
			for(int k = i * i; k < num+1; k+=i) {
				arr[k] = true;
			}
		}
		
		return arr;
	}

}
