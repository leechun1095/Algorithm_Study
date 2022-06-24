package lecture.bruteforce;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15652_2 {
	
	static int[] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		
		System.out.println(pick(N, M, 0, 1));
	}
	
	static StringBuilder pick(int N, int M, int index, int current) {
		if(index == M) {
			StringBuilder sb = new StringBuilder();
			for(int num: arr) {
				sb.append(num).append(" ");
			}
			return sb.append("\n");
		}
		
		StringBuilder ans = new StringBuilder();
		
		if(current > N) {
			return ans;
		}
		
		// 해당 숫자가 뽑힐 때
		arr[index] = current;
		ans.append(pick(N, M, index+1, current));
		
		// 해당 숫자가 뽑히지 않을 때
		ans.append(pick(N, M, index, current+1));
		
		return ans;
	}
}
