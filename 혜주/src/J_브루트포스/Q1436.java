package J_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q1436 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		int num = 666;
		
		while(N>1) {
			num++;
			if(checkSix(num)) {
				N--;
			}
		}
		
		System.out.println(num);
		
		br.close();
	}

	private static boolean checkSix(int num) {
		char[] arr = String.valueOf(num).toCharArray();
		
		int cnt = 0;
		for(int i=0; i<arr.length;i++) {
			if(i > 0 && arr[i-1] != '6') {
				cnt = 0;
			}
			
			if(arr[i] == '6') {
				cnt++;
			}
			
			if(cnt == 3) {
				return true;
			}
		}
		
		return false;
	}


}
