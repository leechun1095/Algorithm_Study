package F_문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2675 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		String str;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int cnt = Integer.parseInt(st.nextToken());
			str = st.nextToken();
			for(char chr: str.toCharArray()) {
				for(int k=0; k<cnt; k++) {
					bw.append(chr);
				}
			}
			bw.newLine();
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}

}
