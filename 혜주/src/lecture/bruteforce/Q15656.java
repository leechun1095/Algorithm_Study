package lecture.bruteforce;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15656 {
	
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
		
		System.out.println(pick(N, M, 0));;
	}
	
	// 수 뽑기(재귀함수)
	static StringBuilder pick(int N, int M, int index) { 
		if(index == M) {
			return getPrintedArr();
		}
		
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<N; i++) {
			arr[index] = givenArr[i];
			ans.append(pick(N, M, index+1));
		}
		return ans;
	}

	private static StringBuilder getPrintedArr() {
		StringBuilder sb = new StringBuilder();
		for(int num: arr) {
			sb.append(num + " ");
		}
		return sb.append("\n");
	}
	
}
