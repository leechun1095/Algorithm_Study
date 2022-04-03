package D_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10818_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			
			int[] numArray = new int[N];
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for(int idx=0; idx < N; idx++) {
				numArray[idx] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(numArray);
			
			System.out.println(numArray[0] + " " + numArray[N-1]);
			
		} catch (Exception e) {
			
		} finally {
			br.close();
			bw.close();
		}

	}

}
