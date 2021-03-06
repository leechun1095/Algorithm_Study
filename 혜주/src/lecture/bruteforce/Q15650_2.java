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
	static void pick(int N, int M, int index, int current) { 
		// current: 현재 선택된 자연수
		if(index == M) {
			printArr();
			return;
		}
		
		if(current > N) {
			return;
		}
		
		// current를 결과에 추가한다.
		arr[index] = current;
		pick(N, M, index+1, current+1);
		
		// 또는
		
		// current를 결과에 추가하지 않는다.
//		arr[index] = 0; // 불필요한 로직인듯
		pick(N, M, index, current+1);
	}

	private static void printArr() {
		for(int current: arr) {
			System.out.print(current + " ");
		}
		System.out.println();
	}
	
}
