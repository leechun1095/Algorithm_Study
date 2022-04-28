package step.D_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q1546 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int num = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			double[] scoreArr = new double[num];
			for(int idx=0; idx<num; idx++) {
				scoreArr[idx] = Integer.parseInt(st.nextToken(" "));
			}
			
			Arrays.sort(scoreArr);
			
			double sum = 0;
			
			for(double score: scoreArr) {
				sum += ((score / scoreArr[num-1]) * 100);
			}
			
			System.out.println(sum/num);
			
		} catch (Exception e) {
			
		} finally {
			br.close();
		}

	}

}
