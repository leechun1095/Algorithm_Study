package if문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2884 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int H = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);

		if(M - 45 >= 0) {
			// M 양수
			System.out.println(H + " " + (M-45));
		} else {
			// M 음수
			if(H - 1 >= 0) {
				// H 양수
				System.out.println((H-1) + " " + (M-45+60));				
			} else {
				// H 음수
				System.out.println((H-1+24) + " " + (M-45+60));
			}
		}
	}
}
