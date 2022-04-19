package J_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q2231 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(getConstructor(N));
		
		br.close();
	}

	private static int getConstructor(int n) {
		int constructor = 0;
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = 0;
			
			int num = i;
			while(num != 0) {
				sum += num%10;
				num /= 10;
			}
			
			if(sum + i == n) {
				constructor = i;
				break;
			}
		}
		
		return constructor;
	}

}
