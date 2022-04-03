package D_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2562_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int[] numArray = new int[9];
			
			for(int idx=0; idx < 9; idx++) {
				numArray[idx] = Integer.parseInt(br.readLine());
			}
			
			int[] copyArray = Arrays.copyOf(numArray, 9);
			Arrays.sort(copyArray);
			
			int max = copyArray[8];
			
			System.out.println(max);
			System.out.println(Arrays.binarySearch(numArray, max) + 1);
			
		} catch (Exception e) {
			
		} finally {
			br.close();
		}

	}

}
