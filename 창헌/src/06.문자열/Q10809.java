package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10809 {

	public static void main(String[] args) throws IOException {
		// 뭐지 어렵다.
		// 영단어 하나 받아서, a~z 순서대로 세워놓고 영단어에 포함되는 알파벳을 index로 체크한다.
		// baekjoon -> 1  0  -1  -1  2 
		//             a  b   c   d  e 
		// 포함되는 알파벳이 없는 경우 -1
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		int[] arr = new int[26]; // 알파벳 수
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;	// -1로 초기화
		}
		
		// int a = "a".charAt(0); // "a" 의 아스키코드 : 97
		// a - 97 = 0 이므로 arr[0]으로 맞출 수 있음
		
		for(int i=0; i<S.length(); i++) { // 문자열 길이
			char ch = S.charAt(i);
			
			if(arr[ch - 97] == -1) { // 해당 문자가 -1인 경우에만 i(위치)값으로 넣어주기
				arr[ch - 97] = i;
			}
		}
		for(int val : arr) {
			System.out.print(val + " ");
		}
	}

}
