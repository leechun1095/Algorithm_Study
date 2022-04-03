package D_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10818 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			
			int max = -1000000;
			int min = 1000000;
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int idx=0; idx < N; idx++) {
				int number = Integer.parseInt(st.nextToken());
				
				if(number > max) {
					max = number;
				} 
				
				if(number < min) {
					min = number;
				}
			}
			
			System.out.println(min + " " + max);
			
		} catch (Exception e) {
			
		} finally {
			br.close();
			bw.close();
		}

	}

}
