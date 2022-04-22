package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			// int로 받으면 아스키코드값이 므로 48을 빼서 숫자로 만든다.
			int temp = str.charAt(i) - 48;
			list.add(temp);
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int val : list) {
			System.out.print(val);
		}
	}
}
