package step.I_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q10872 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fnFactorial(n));
		
		br.close();
	}

	private static int fnFactorial(int n) {
		if(n==0) return 1;
		return n * fnFactorial(n-1);
	}

}
