package G_기본수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10250 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int loop = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int i=0; i<loop; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			if(N % H == 0) {
				bw.write(H*100 + N / H + "");
			} else {
				bw.write((N%H)*100 + (N / H)+1 + "");
			}
			
			bw.newLine();
		}
		
		bw.flush();
		
		br.close();
	}

}
