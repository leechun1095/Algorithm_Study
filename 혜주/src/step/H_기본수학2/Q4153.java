package step.H_기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Q4153 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			int[] xyz = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
			if(xyz[0] == 0 && xyz[1] == 0 && xyz[2] == 0) {
				break;
			}
			
			sb.append(getRightTriangle(xyz)).append("\n");
		}

		System.out.println(sb.toString());
		
		br.close();
	}

	private static String getRightTriangle(int[] xyz) {
		Arrays.sort(xyz);
		
		if(Math.pow(xyz[0], 2) + Math.pow(xyz[1], 2) == Math.pow(xyz[2], 2)) {
			return "right";
		} else {
			return "wrong";
		}
	}
}
