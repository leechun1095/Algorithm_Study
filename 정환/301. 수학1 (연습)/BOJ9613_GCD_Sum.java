package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9613_GCD_Sum {
	//유클리드 호제법
	//두수의 최대공약수를 구하는 알고리즘
	public static long gcd(long a, long b) {
		while(b>0) {
			long tmp=a;
			a=b;
			b=tmp%b;
		}
		return a;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader
		           (new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<testCase; i++) {
			String[] s = br.readLine().split(" ");
			int size = Integer.parseInt(s[0]);
			long[] arr = new long[size];
			for(int j=1; j<s.length; j++) {
				arr[j-1] = Integer.parseInt(s[j]);
			}
			
			long sum=0;
			for(int j=0; j<arr.length-1; j++) {
				for(int k=j+1; k<arr.length; k++) {
					sum += gcd(arr[j],arr[k]);
				}
			}
			System.out.println(sum);
		}
	}
}
