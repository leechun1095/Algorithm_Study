package G_기본수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q1712 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken()); // 고정비용
		int B = Integer.parseInt(st.nextToken()); // 가변비용
		int C = Integer.parseInt(st.nextToken()); // 노트북가격
		
		int point = -1;
		if(C > B) {
			point = A/(C-B)+1;
		} 
		System.out.println(point);
		
		br.close();
	}

}
