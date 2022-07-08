package lecture.bruteforce.recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q9095 {
    public static void main(String args[]) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<t; i++) {
			int goal = Integer.parseInt(br.readLine());
			sb.append(recurse(0, goal)).append("\n");
		}

        System.out.println(sb);
    }
	
	// 숫자 count개로 합 sum을 만드는 경우의 수
	private static int recurse(int sum, int goal) {
		// 불가능한 경우
		if(sum > goal) {
			return 0;
		}
		// 정답을 찾은 경우
		if(sum == goal) {
			return 1;
		}
		
		// 정답을 찾으러..
		int now = 0;
		for(int i=1; i<=3; i++) {
			now += recurse(sum+i, goal);
		}
		return now;
	}
}
