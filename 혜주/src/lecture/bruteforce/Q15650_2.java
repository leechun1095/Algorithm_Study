package lecture.bruteforce;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15650_2 {
	
	static int[] arr; // 뽑힌 수의 배열
	static boolean[] check; // 수의 사용여부
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		check = new boolean[N+1];
		
		pick(N, M, 0, 1);
	}
	
	// 수 뽑기(재귀함수)
	// 오름차순: 다음에 올 수는 현재 수보다 커야한다.
	static void pick(int N, int M, int selectedCnt, int index) { 
		// selectedCnt: 지금까지 선택한 수의 갯수
		// index: 자연수
		if(selectedCnt == M) {
			printArr();
			return;
		}
		
		if(index > N) {
			return;
		}
		
		// index를 결과에 추가한다.
		arr[selectedCnt] = index;
		pick(N, M, selectedCnt+1, index+1);
		
		// 또는
		
		// index를 결과에 추가하지 않는다.
		arr[selectedCnt] = 0;
		pick(N, M, selectedCnt, index+1);
	}

	private static void printArr() {
		for(int num: arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
}
