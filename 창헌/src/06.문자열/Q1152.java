package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1152 {

	public static void main(String[] args) throws IOException {
		// 다섯번째 풀이 : 26,272KB		264ms
		// 결론 => str[0] = "" 값인 경우 str.length 값은 1이 나온다. 이를 예외처리 해야함!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		
		if(str.isEmpty()) {
			System.out.println(0);
		} else {
			String[] arr = str.split(" ");
			System.out.println(arr.length);
		}
		
		/* 네번째 풀이 : 20,008KB	256ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		System.out.println(st.countTokens());
		*/
		
		/* 세번째 풀이 : 틀림 (print 결과는 맞는데 왜 틀림?..
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		String[] arr = str.split(" ");
		
		System.out.println(arr.length);
//		System.out.println("["+str+"]");
//		String[] str = br.readLine().trim().split(" ");

//		System.out.println(str.length);
//		for (String val : str) {
//			System.out.println("["+val+"]");
//		}
		*/
		
		/* 두번째 풀이 : 런타임에러(ArrayIndexOutOfBounds)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		// if(str[0] == "" || str[0] == null) -> 안먹힌다. isEmpty()로 처리
		if(str[0].isEmpty()) {
			System.out.println(str.length -1);
		} else {
			System.out.println(str.length);
		}
		*/
		
		/* 첫번째 풀이 : 틀림 (결과는 정상인데 제출하면 틀렸다고 함)
		 * 틀린 이유 : 문자열의 앞과 뒤에는 공백이 있을 수 있다.
		 * 즉 공백 단위로 처리할 때 그냥 공백의 개수대로 단어를 세면 예외가 발생할 수 있음.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");

		System.out.println(str.length);
		System.out.println("["+str[0]+"]");
		 */		
	}

}
