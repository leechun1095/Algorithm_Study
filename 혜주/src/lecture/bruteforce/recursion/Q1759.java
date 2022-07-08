package lecture.bruteforce.recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1759 {
// 오류	
	static char[] letters;
//	static char[] vowelLetters = {'a','e','i','o','u'};
	static String vowelLetters = "aeiou";
	
    public static void main(String args[]) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int L = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		letters = new char[C];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<C; i++) {
			letters[i] = st.nextToken().toCharArray()[0];
		}
		Arrays.sort(letters);
		
        System.out.println(recurse(0, 0, 0, L));
    }
	
	// 문자 count개로 goal개 만큼의 암호를 만드는 경우의 수
	private static StringBuilder recurse(int count, int vowelCnt, int now, int goal) {
		
		if(now == letters.length) {
			return new StringBuilder();
		}
		
		if(count == goal) {
			StringBuilder sb = new StringBuilder();
			if(vowelCnt >= 1 && (goal - vowelCnt) >= 2) {
				return sb.append(letters[now]).append("\n");
			} else {
				return sb;
			}
		}
		

		
		// 정답을 찾으러..
		StringBuilder sb = new StringBuilder();
		for(int i=now; i<letters.length; i++) {
			if(vowelLetters.indexOf(letters[i]) > -1) {
				vowelCnt++;
			}
			sb.append(recurse(count+1, vowelCnt, i+1, goal)); 
		}
		return sb;
	}
}
