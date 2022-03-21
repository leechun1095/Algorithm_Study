package while문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10951 {

	public static void main(String[] args) throws IOException {
		// 입력의 종료는 더이상 읽을 수 있는 데이터(EOF)가 없을 때 종료한다.
		// EOF(End Of File)
		// 그냥 엔터쳤을 때 예외 처리 어떻게 할까?..
		
		// 14,088KB		132ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		
		while((str=br.readLine()) != null) {
			int A = str.charAt(0) - 48;
			int B = str.charAt(2) - 48;
			sb.append(A+B).append('\n');
		}
		br.close();
		System.out.println(sb);
	}
}
