package lecture.bruteforce;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1107 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cnt = Integer.parseInt(br.readLine());
		boolean[] brokenArr = new boolean[10];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<cnt; i++) {
			brokenArr[Integer.parseInt(st.nextToken())] = true;
		}
		
		int result = Math.abs(N - 100); // 최대 이동수로 초기값 설정
		
		for(int i=0; i<= 999999; i++) {
			String str = String.valueOf(i);
			int len = str.length();
			
			boolean isBroken = false;
			for(int k=0; k<len; k++) {
				// 고장난 버튼을 눌러야 한다면
				if(brokenArr[str.charAt(k) - '0']) { 
					isBroken = true;
					break;
				}
			}
			
			if(!isBroken) { // 고장난 버튼이 없는 숫자라면
				int min = Math.abs(N - i) + len;
				result = Math.min(result, min);
			}
		}
		
		System.out.println(result);
	}
	
}
