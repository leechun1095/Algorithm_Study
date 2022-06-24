package lecture.bruteforce;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15655 {
	
	static int[] arr; // 뽑힌 수의 배열
	static int[] givenArr; // 주어진 숫자의 배열
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		givenArr = new int[N];

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {
			givenArr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(givenArr);
		
		pick(N, M, 0, 0);
	}
	
	// 수 뽑기(재귀함수)
	static void pick(int N, int M, int index, int currentIndex) { 
		// currentIndex: 현재 선택된 자연수 배열의 인덱스
		if(index == M) {
			printArr();
			return;
		}
		
		if(currentIndex > N-1) {
			return;
		}
		
		// currentIndex를 뽑는다.
		arr[index] = givenArr[currentIndex];
		pick(N, M, index+1, currentIndex+1);
		
		// 또는
		
		// currentIndex를 뽑지않는다.
		pick(N, M, index, currentIndex+1);
	}

	private static void printArr() {
		for(int num: arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
}
