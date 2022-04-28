package step.H_기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Q1002 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int result = getResult(Integer.parseInt(st.nextToken()),
									Integer.parseInt(st.nextToken()),
									Integer.parseInt(st.nextToken()),
									Integer.parseInt(st.nextToken()),
									Integer.parseInt(st.nextToken()),
									Integer.parseInt(st.nextToken()));
			
			sb.append(String.valueOf(result)).append("\n");
		}

		System.out.println(sb.toString());
		
		br.close();
	}

	private static int getResult(int x1,int y1,int r1,int x2,int y2,int r2) {
		int distance = (int)Math.pow(x2-x1, 2) + (int)Math.pow(y2-y1, 2);
		
		int result = 2;	
		
		// 1. 원이 완벽히 겹칠 때
		if(x1==x2 && y1==y2 && r1==r2) {
			result = -1;
		}
		// 2. 접점이 없을 때
		else if(distance > Math.pow(r1+r2, 2)) {
			result = 0;
		}
		else if(distance < Math.pow(r1-r2, 2)) {
			result = 0;
		}
		// 3. 접점이 1개 일 때
		else if(distance == Math.pow(r1-r2, 2)) {
			result = 1;
		}
		else if(distance == Math.pow(r1+r2, 2)) {
			result = 1;
		}
		
		return result;
	}
}
