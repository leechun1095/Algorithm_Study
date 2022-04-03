package D_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2577 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int multipleResult = 1;

			for(int idx=0; idx<3; idx++) {
				multipleResult *= Integer.parseInt(br.readLine());
			}
			
			int[] resultArr = new int[10];
			
			String numStr = multipleResult + "";
			for(int idx=0; idx<numStr.length(); idx++) {
				int num = Integer.parseInt(numStr.substring(idx, idx+1));
				resultArr[num] += 1;
			}
			
			for(int idx=0; idx<10; idx++) {
				System.out.println(resultArr[idx]);
			}
			
		} catch (Exception e) {
			
		} finally {
			br.close();
		}

	}

}
