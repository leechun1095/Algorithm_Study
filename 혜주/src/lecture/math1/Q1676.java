package lecture.math1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1676 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		char[] charArr = String.valueOf(factorial(num)).toCharArray();
		
		int cnt = 0;
		for(int i=charArr.length-1; i>= 0; i--) {
			if(charArr[i] == '0') {
				cnt++;
			} else {
				break;
			}
		}
		
		System.out.println(cnt);
	}

	private static int factorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		return num * factorial(num-1);
	}

}
