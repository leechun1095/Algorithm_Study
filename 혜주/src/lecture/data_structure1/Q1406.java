package lecture.data_structure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;
public class Q1406 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		String str = br.readLine();
		int N = Integer.parseInt(br.readLine());
		
		Stack<Character> right = new Stack<Character>();
		Stack<Character> left = new Stack<Character>();
		
		// init
		for(int i=str.length(); i>0; i++) {
			left.push(str.charAt(i-1));
		}
				
		// command
		for(int i=0; i<N; i++) {
			// TODO
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
