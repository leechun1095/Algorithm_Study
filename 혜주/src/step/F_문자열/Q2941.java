package step.F_문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2941 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] alphabetArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	
		String str = br.readLine();
		
		int cnt = 0;
		int fromIndex = 0;
		
		while(fromIndex != str.length()) {
			
			int minIndex = 100;
			String minAlphabet = "";
			
			for(String alphabet: alphabetArr) {
				int index = str.indexOf(alphabet, fromIndex);
				if(index > -1 && index < minIndex) {
					minIndex = index;
					minAlphabet = alphabet;
				}
			}
			
			if(minIndex < 100) {
				cnt += (minIndex - fromIndex) + 1;
				fromIndex = minIndex + minAlphabet.length();
			} else {
				fromIndex ++;
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		br.close();
	}


}
