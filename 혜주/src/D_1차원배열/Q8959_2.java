package D_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q8959_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int cnt = Integer.parseInt(br.readLine());

			for(int idx=0; idx<cnt; idx++) {
				String quizResultStr = br.readLine();
				
				int score = 0;
				int oCnt = 0;
				for(int quizIdx=0; quizIdx<quizResultStr.length(); quizIdx++ ) {
					
					if(quizResultStr.charAt(quizIdx) == 'X') {
						oCnt = 0;
					} else { // "O"
						oCnt++;
						score += oCnt;
					}
				}
				
				bw.write(score + "");
				bw.newLine();
			}
			
			bw.flush();
		} catch (Exception e) {
			
		} finally {
			br.close();
			bw.close();
		}

	}

}
