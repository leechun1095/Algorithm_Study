package lecture.bruteforce;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15657 {
	
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
		
		System.out.println(pick(N, M, 0, 0));
	}
	
	// 수 뽑기(재귀함수)
	static StringBuilder pick(int N, int M, int index, int currentIndex) { 
		// currentIndex: 현재 선택된 자연수 배열의 인덱스
		if(index == M) {
			return getPrintedArr();
		}
		
		StringBuilder ans = new StringBuilder();
		
		if(currentIndex > N-1) {
			return ans;
		}
		
		// currentIndex를 뽑는다.
		arr[index] = givenArr[currentIndex];
		ans.append(pick(N, M, index+1, currentIndex));
		
		// 또는
		
		// currentIndex를 뽑지않는다.
		ans.append(pick(N, M, index, currentIndex+1));
		
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
