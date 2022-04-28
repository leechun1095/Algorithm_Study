package step.I_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q10870_2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fnFibonacci(n));
		
		br.close();
	}

	private static int fnFibonacci(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return fnFibonacci(n-1) + fnFibonacci(n-2);
	}

}
