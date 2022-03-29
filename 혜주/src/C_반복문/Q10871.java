package C_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q10871 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");

			for(int i=0; i<N; i++) {
				int value = Integer.parseInt(st.nextToken());
				if(X > value) {
					bw.write(value + " ");
				}
			}
			
			bw.flush();
		} catch (Exception e) {
			
		} finally {
			br.close();
			bw.close();
		}
	}
}
