package H_기본수학2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11653_2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int N = Integer.parseInt(br.readLine());
		
		for(int i=2; i*i <= N; i++) {
			while(N % i == 0) {
				N /= i;
				bw.write(i + "");
				bw.newLine();
			}
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}
