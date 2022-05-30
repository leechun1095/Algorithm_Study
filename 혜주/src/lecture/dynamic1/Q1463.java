package lecture.dynamic1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1463 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		while(t != 1) {
			if(t % 3 == 0) {
				t /= 3;
				cnt++;
			} else if(t % 2 == 0) {
				t /= 2;
				cnt++;
			} else {
				t -= 1;
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
