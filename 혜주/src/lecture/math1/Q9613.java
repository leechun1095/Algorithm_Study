package lecture.math1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9613 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int k=0; k<t; k++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int numCnt = Integer.parseInt(st.nextToken());
			int[] arr = new int[numCnt];
			for(int i=0; i<numCnt; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			long sumGCD = 0;
			for(int i=0; i<numCnt-1; i++) {
				for(int m=i+1; m<numCnt; m++) {
					sumGCD += getGCD(arr[i],arr[m]);
				}
			}
			
			sb.append(sumGCD).append("\n");
		}
		
		System.out.println(sb);
	}

	private static int getGCD(int A, int B) {
		// 최대공약수 찾기
		int maxDivNum = 0;
		for(int i=Math.min(A,B); i>=1; i--) {
			if(A % i == 0 && B % i == 0) {
				maxDivNum = i;
				break;
			}
		}
		return maxDivNum;
	}
}
