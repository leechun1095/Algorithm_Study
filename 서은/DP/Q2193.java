package DP;
import java.io.*;
import java.util.*;

public class Q2193 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long[][] arr = new long[n+1][2];
		
		arr[1][0] = 1;
		arr[1][1] = 1;
		
		for (int i = 2; i <= n; i++) {
			arr[i][0] = arr[i-1][0] + arr[i-1][1];
			arr[i][1] = arr[i-1][0];		
		}
		
		System.out.print(arr[n][1]);
		
	}

}
