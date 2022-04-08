package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1085 {

	public static void main(String[] args) throws IOException {
		/* x 축 : x, w-x
		   y 축 : y, h-y
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		
		int x = Integer.parseInt(arr[0]);
		int y = Integer.parseInt(arr[1]);
		int w = Integer.parseInt(arr[2]);
		int h = Integer.parseInt(arr[3]);
		
		int x_min = Math.min(x, w-x);
		int y_min = Math.min(y, h-y);
		
		System.out.println(Math.min(x_min, y_min));
	}

}
