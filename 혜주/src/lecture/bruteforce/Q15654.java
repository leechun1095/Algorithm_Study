package lecture.bruteforce;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15654 {
	
	static int[] arr; // 뽑힌 수의 배열
	static int[] givenArr; // 주어진 숫자의 배열
	static boolean[] checkArr; // 중복사용 방지 배열
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		givenArr = new int[N];
		checkArr = new boolean[N];

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {
			givenArr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(givenArr);
		
		pick(N, M, 0);
	}
	
	// 수 뽑기(재귀함수)
	static void pick(int N, int M, int index) { 
		if(index == M) {
			printArr();
			return;
		}
		
		for(int i=0; i<N; i++) {
			if(!checkArr[i]) { // 아직 뽑히지 않은 수만 뽑을 수 있음
				checkArr[i] = true; // 사용중
				arr[index] = givenArr[i];
				pick(N, M, index+1);
				checkArr[i] = false; // 사용해제
			}
		}
	}

	private static void printArr() {
		for(int num: arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
}
