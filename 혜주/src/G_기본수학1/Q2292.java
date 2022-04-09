package G_기본수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q2292 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
		int N = Integer.parseInt(br.readLine());
		int count = 1;
		int range = 2;
		
		if(N == 1) {
			System.out.println(1);
		} else {
			while(range <= N) {
				range += 6 * count;
				count++;
			}
			System.out.println(count);
		}
		
		br.close();
	}

}
