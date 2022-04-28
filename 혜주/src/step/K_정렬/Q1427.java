package step.K_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
public class Q1427 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		char[] charArr = br.readLine().toCharArray();
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<charArr.length;i++){
			list.add(Integer.parseInt(String.valueOf(charArr[i])));
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		for(int i=list.size()-1; i>=0; i--) {
			sb.append(list.get(i));
		}
		System.out.println(sb);
		
		br.close();
	}
}
