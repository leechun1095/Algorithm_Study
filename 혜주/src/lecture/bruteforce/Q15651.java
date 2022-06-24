package lecture.bruteforce;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15651 {
	
	static int[] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		
		System.out.println(pick(N, M, 0));
	}
	
	// StringBuilder 미사용으로 인한 시간초과
	// 사용
	static StringBuilder pick(int N, int M, int index) {
		if(index == M) {
			StringBuilder sb = new StringBuilder();
			for(int num: arr) {
				sb.append(num).append(" ");
			}
			return sb.append("\n");
		}
		
		StringBuilder ans = new StringBuilder();

		for(int i=1; i<= N; i++) {
			arr[index] = i; 
			ans.append(pick(N, M, index+1));
		}
		
		return ans;
	}
}
