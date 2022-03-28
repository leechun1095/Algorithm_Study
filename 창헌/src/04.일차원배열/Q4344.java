package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 15,564KB		176ms
		// 생각보다 오래걸림. 
		// 한줄의 처리 로직부터 생각하면 될 듯 (가로)
		// 세로줄은 반복문으로 처리하기 때문
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine()); // 테스트 케이스 수
		String[] strArr = new String[C];
		int[] arr;	
		
		StringTokenizer st;
		
		for(int z=0; z<C; z++) {
			strArr[z] = br.readLine();
		}
		
		for(int i=0; i<C; i++) {
			st = new StringTokenizer(strArr[i], " ");
			
//			System.out.println(st.nextToken());   // 5 50 50 70 80 100 입력한 경우 5가 나온다.
			int N = Integer.parseInt(st.nextToken()); // 각 라인의 학생수
			arr = new int[N]; // 각 줄의 배열
			
			double sum = 0; // 누적 성적 합계
			
			for(int k=0; k<arr.length; k++) {
				 int value = Integer.parseInt(st.nextToken()); // 각 라인의 성적 저장
				 arr[k] = value;
				 sum += value;
			}
			double avgVal = sum / N;  // 각 라인의 평균
			double cnt = 0; 		  // 각 라인의 평균 넘는 학생 수
			
			// 평균 넘는 학생수 찾기
			for(int j=0; j<N; j++) {
				if(avgVal < arr[j]) {
					cnt++;
				}
			}
			System.out.println(String.format("%.3f", (cnt/N)*100) +"%");
		}
		br.close();
	}
}