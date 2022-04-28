package step.F_문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q1316 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		String word;
		int cnt = 0;
		for(int i=0; i<N; i++) {
			word = br.readLine();
			cnt += checkGroupWord(word);
		}
		
		System.out.println(cnt);
		
		br.close();
	}

	// 그룹단어 체커(그룹단어면 1, 아니면 0 반환)
	private static int checkGroupWord(String word) {
		
		Set<Character> wordSet = new HashSet<Character>();
		char[] wordArr = word.toCharArray();
		char prevChr = wordArr[0];
		for(int i=0; i<wordArr.length; i++) {
			char chr = wordArr[i];
			if(prevChr != chr && wordSet.contains(chr)) {
				return 0;
			}
			
			wordSet.add(wordArr[i]);
			prevChr = chr;
		}
		
		return 1;
	}
}
