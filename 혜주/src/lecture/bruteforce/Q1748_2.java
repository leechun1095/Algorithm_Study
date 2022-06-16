package lecture.bruteforce;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1748_2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 1;
		int temp = 0;
		int length = 10;
		
		for(int i=1; i<=N; i++) {
			if(i == length) {
				cnt++;
				length *= 10;
			}
			temp += cnt;
		}
		
		System.out.println(temp);
	}
	
}
