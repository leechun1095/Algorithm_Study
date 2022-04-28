package step.D_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2562 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int max = -1;
			int maxIdx = -1;
			for(int idx=0; idx < 9; idx++) {
				int num = Integer.parseInt(br.readLine());
				if(num > max) {
					max = num;
					maxIdx = idx;
				}
			}
			
			System.out.println(max);
			System.out.println(maxIdx + 1);
			
		} catch (Exception e) {
			
		} finally {
			br.close();
		}

	}

}
