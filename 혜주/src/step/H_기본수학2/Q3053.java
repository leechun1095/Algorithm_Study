package step.H_기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Q3053 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		double r = Integer.parseInt(br.readLine());
	
		System.out.println(String.format("%.6f", r*r*Math.PI));
		System.out.println(2*Math.pow(r, 2));
		
		br.close();
	}
}
