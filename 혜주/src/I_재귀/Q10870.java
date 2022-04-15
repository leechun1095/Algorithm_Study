package I_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q10870 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int max = Integer.parseInt(br.readLine());
		
		System.out.println(fnFibonacci(0, max));
		
		br.close();
	}

	private static int fnFibonacci(int n, int max) {
		if(n==max) return n;
		return n + fnFibonacci(n+1, max);
	}

}
