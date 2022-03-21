package for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10871 {

	public static void main(String[] args) throws IOException {
		// 16,944KB		208ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int X = Integer.parseInt(str[1]);
		int[] arr = new int[N];
		
		StringBuilder sb = new StringBuilder();
		
		String str2[] = br.readLine().split(" ");
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(str2[i]);
			if(arr[i] < X) {
				sb.append(arr[i] + " ");
			}
		}
		br.close();
		System.out.println(sb);
	}
}
