package step.H_기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q2581 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int min = -1;
		int sum = 0;
		for(int i=M; i <= N; i++) {
			if(isPrimeNumber(i)) {
				sum += i;
				if(min == -1) {
					min = i;
				}
			}
		}
		
		if(min == -1) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		
		br.close();
	}

	private static boolean isPrimeNumber(int num) {
		Boolean result = true;
		
		if(num == 1) {
			return false;
		}
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num % i ==0) {
				result = false;
				break;
			}
		}
		
		return result;
	}

}
