package F_문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q5622 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int seconds = 0;
		
		String str = br.readLine();
		
		for(char chr: str.toCharArray()) {
			seconds += getDialSeconds(chr);
		}
		
		
		System.out.println(seconds);
		
		br.close();
	}

	private static int getDialSeconds(char chr) {
		int dialSeconds = 0;
		if(chr < 68) {
			dialSeconds = 3;
		} else if(chr < 71) {
			dialSeconds = 4;
		} else if(chr < 74) {
			dialSeconds = 5;
		} else if(chr < 77) {
			dialSeconds = 6;
		} else if(chr < 80) {
			dialSeconds = 7;
		} else if(chr < 84) {
			dialSeconds = 8;
		} else if(chr < 87) {
			dialSeconds = 9;
		} else {
			dialSeconds = 10;
		} 
			
		return dialSeconds;
	}

}
