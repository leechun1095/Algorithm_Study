package D_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2577_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int multipleResult = 1;

			for(int idx=0; idx<3; idx++) {
				multipleResult *= Integer.parseInt(br.readLine());
			}
			
			int[] arr = new int[10];

			while(multipleResult != 0) {
				arr[multipleResult % 10] ++;
				multipleResult /= 10;
			}
			
			for(int num: arr) {
				System.out.println(num);
			}
		} catch (Exception e) {
			
		} finally {
			br.close();
		}

	}

}
