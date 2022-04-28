package step.F_문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Q1157 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String word = br.readLine().toUpperCase();
		
		// 1. 각 문자 별 사용횟수 담기
		HashMap<Character, Integer> wordCntMap = new HashMap<Character, Integer>();
		
		for(char character: word.toCharArray()) {
			wordCntMap.put(character, wordCntMap.getOrDefault(character, 0)+1);
		}
		
		// 2. 가장 많이 사용된 문자 찾기
		char result = 0;
		int max = 0;
		for(Entry<Character, Integer> wordEntry: wordCntMap.entrySet()) {
			char entryKey = wordEntry.getKey();
			int entryValue = wordEntry.getValue();
			if(entryValue > max) {
				result = entryKey;
				max = entryValue;
			} else if(entryValue == max) {
				// 가장 많이 사용된 문자가 여러개 존재하는 경우 -> ? 출력
				result = '?';
			}
		}
		
		System.out.println(Character.toString(result));
		
		
		br.close();
	}

}
