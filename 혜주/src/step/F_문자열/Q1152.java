package step.F_문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1152 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String sentence = br.readLine();
		
		StringTokenizer st = new StringTokenizer(sentence, " ");
		System.out.println(st.countTokens());
		
		br.close();
	}

}
