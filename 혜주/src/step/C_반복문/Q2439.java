package step.C_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		for(int i=1; i<=n; i++) {
			for(int k=n; k>0;k--) {
				if(k > i) {
					bw.write(" ");
				} else {
					bw.write("*");
				}
			}
			
//			if(i != n) {
//				bw.write("\n");
//			}
			bw.newLine();
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}

}
