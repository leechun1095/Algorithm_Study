package lecture.data_structure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q10820 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String input;
		Map<String, Integer> map = new HashMap<String, Integer>();
		StringBuilder sb = new StringBuilder();
		// 소문자, 대문자, 숫자, 공백
		while((input = br.readLine()) != null) { // EOF
			map.put("SLetter", 0);
			map.put("BLetter", 0);
			map.put("NUMBER", 0);
			map.put("BLANK", 0);
			for(char ch: input.toCharArray()) {
				if(ch >= 'a' && ch <= 'z') {
					map.put("SLetter", map.get("SLetter") + 1);
				} else if(ch >= 'A' && ch <= 'Z') {
					map.put("BLetter", map.get("BLetter") + 1);
				} else if(ch == ' ') {
					map.put("BLANK", map.get("BLANK") + 1);
				} else {
					map.put("NUMBER", map.get("NUMBER") + 1);
				}
			}
			
//			System.out.println(map.get("SLetter") + " " + map.get("BLetter") + " " + map.get("NUMBER") + " " + map.get("BLANK"));
			sb.append(map.get("SLetter") + " ");
			sb.append(map.get("BLetter") + " ");
			sb.append(map.get("NUMBER") + " ");
			sb.append(map.get("BLANK") + "\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
