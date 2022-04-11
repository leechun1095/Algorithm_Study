package G_기본수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Q10757 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String A = st.nextToken();
		String B = st.nextToken();
		
		int aLength = A.length();
		int bLength = B.length();
		if(aLength != bLength) {
			String zeroStr = "";
			if(aLength > bLength) {
				for(int i=0; i<aLength-bLength; i++) {
					zeroStr += "0";
				}
				B = zeroStr + B;
			} else {
				for(int i=0; i<bLength-aLength; i++) {
					zeroStr += "0";
				}
				A = zeroStr + A;
			}
		}
		
		List<Integer> list = new ArrayList<Integer>();
		int up = 0;
		for(int i=A.length(); i > 0; i--) {
			int a = Integer.parseInt(A.substring(i-1, i));
			int b = Integer.parseInt(B.substring(i-1, i));
			
			list.add((a+b+up) % 10);
			
			up = (a+b+up) >= 10 ? 1 : 0;
		}
		
		if(up == 1) {
			list.add(up);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=list.size()-1; i >= 0; i--) {
			sb.append(list.get(i));
		}
		System.out.println(sb.toString());
		
		br.close();
	}

}
