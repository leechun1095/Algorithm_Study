package if문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2753 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		
		if(a % 4 == 0 && a % 100 != 0) {
			System.out.println("1");
		} else if (a % 4 == 0 && a % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
