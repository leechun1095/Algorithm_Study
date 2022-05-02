package 자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9093 {
	public static char[] stackArr;
	public static int size = -1;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
				
		for(int i=0; i<T; i++) {
			String[] str = br.readLine().split(" ");
			
			// str[0], str[1], str[2] ... ... ...
			for(int k=0; k<str.length; k++) {
							
				size = -1;
				stackArr = new char[str[k].length()];
				
				for(int j=0; j<stackArr.length; j++) {
					push(str[k].charAt(j));		
				}
				

				for(int q=0; q<stackArr.length; q++) {
					sb.append(pop());
				}
				sb.append(" ");
			}
			sb.append('\n');
		}
		br.close();
		System.out.println(sb);
	}

	public static void push(char item) {
		stackArr[++size] = item;
	}

	public static char pop() {
		if (size == -1) {
			return ' ';
		} else {
			return stackArr[size--];
		}
	}

	public static int size() {
		return size + 1;
	}
}
