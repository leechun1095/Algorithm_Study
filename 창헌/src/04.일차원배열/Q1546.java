package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 두번째 풀이(배열 사용 X) : 14,348KB		128ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 시험본 과목 수
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int maxVal = -1;
		double sum = 0;
		
		for(int i=0; i<N; i++) {
			int value = Integer.parseInt(st.nextToken());
			
			if(value > maxVal) {
				maxVal = value;
			}
			sum += value;
		}
		br.close();
		System.out.println(((sum / maxVal) * 100) / N);
		
		
		/* 첫번째 풀이(배열 이용) : 15,036KB	136ms 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 시험본 과목 수
		double[] arr = new double[N];
		
		// 한줄에 점수가 몇개가 올지 모르고, 담을 변수도 생성하기가 애매함. 고로 StringTokenizer을 사용
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		br.close();
		
		Arrays.sort(arr);
		double M = arr[N-1];  // 최고 점수
		double sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i] / M * 100; 
		}
		System.out.println(sum / N;);
		*/
	}
}
