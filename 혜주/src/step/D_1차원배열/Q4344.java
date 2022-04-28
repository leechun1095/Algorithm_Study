package step.D_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q4344 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int testCaseCnt = Integer.parseInt(br.readLine());

			StringTokenizer st;
			for(int i=0; i<testCaseCnt; i++) {
				
				double result = 0;
				
				st = new StringTokenizer(br.readLine(), " ");
				
				int studentCnt = Integer.parseInt(st.nextToken());
				int[] studentScoreArr = new int[studentCnt];
				int sumScore = 0;
				for(int k=0; k<studentCnt; k++) {
					int score = Integer.parseInt(st.nextToken());
					studentScoreArr[k] = score;
					sumScore += score;
				}
				int avg = sumScore / studentCnt;
				
				double aboveAvgCnt = 0;
				for(int studentScore: studentScoreArr) {
					if(studentScore > avg) {
						aboveAvgCnt++;
					}
				}
				
				result = aboveAvgCnt / studentCnt * 100;
				
				bw.write(String.format("%.3f", result) + "%");
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
