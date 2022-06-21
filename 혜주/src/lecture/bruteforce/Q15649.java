package lecture.bruteforce;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15649 {
	
	static int[] arr; // 뽑힌 수의 배열
	static boolean[] check; // 수의 사용여부
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		check = new boolean[N+1];
		
		pick(N, M, 0);
	}
	
	// 수 뽑기(재귀함수)
	static void pick(int N, int M, int index) {
		
		if(index == M) { // M개 만큼 다 뽑았으면 return
			printArr();
			return;
		}
		
		for(int i=1; i<=N; i++) {
			if(!check[i]) { // 이미 뽑힌 수(i)는 사용하지 않는다.
				check[i] = true; // 사용중
				arr[index] = i;
				
				pick(N, M, index+1); // 재귀
				
				check[i] = false; // 사용해제
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
