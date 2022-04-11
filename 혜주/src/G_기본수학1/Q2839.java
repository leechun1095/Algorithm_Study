package G_기본수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2839 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int totalSugar = Integer.parseInt(br.readLine());
		
//		3x + 5y = 18;
//		5y = 18 - 3x;
//		y = (18 - 3x) / 5;
		
		int x=0;
		int y=0;
		int last = 0;
		
		
		while(true) {
			y = (totalSugar-3*x) / 5;
			last = (totalSugar-3*x) % 5;
			if(last == 0) break;
			if(y <= 0 && last % 3 != 0) {
				System.out.println(-1);
				return;
			}
			x++;
		}
		
		System.out.println(x+y);
		
		br.close();
	}

}
