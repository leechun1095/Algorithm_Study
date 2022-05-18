package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9095_123Plus {
	private static int[] arr;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		arr = new int[11];
		
		arr[0]=1;
		arr[1]=1;
		arr[2]=2;
		for(int i=3; i<11; i++) {
			arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for(int i=0; i<testCase; i++) {
			int num=Integer.parseInt(br.readLine());
			
			System.out.println(arr[num]);
		}
	}
}
