package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Q3052 {

	public static void main(String[] args) throws IOException {
		// 두번째 풀이 : 14,152KB	120ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			h.add(Integer.parseInt(br.readLine()) % 42);
		}
		br.close();
		System.out.println(h.size());
		
		
		/* 첫번째 풀이 : 14200KB	120ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 나머지 0 ~ 41 이므로
		boolean[] arr = new boolean[42];
		
		// 나머지값이 속한 배열은 true로 셋팅, 나머지 1이면 arr[1]=true
		for(int i=0; i<10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		}
				
		int count = 0;
				
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == true) {
				count++;
			}
		}
		br.close();
		System.out.println(count);
		*/
	}
}
