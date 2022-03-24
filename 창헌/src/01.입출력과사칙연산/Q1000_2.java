package 입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1000_2 {

	static public void main(String[] args) throws IOException {
		// BufferedReader 사용
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a+b);
		
		/*
		 * BufferedReader 의 경우 문자열을 받는 대표적인 방법은 readLine() 과 read() 이다. 둘의 차이는
		 * readLine() 은 한 행을 읽어오고, read() 는 한 문자만 읽어온다. 그래서 특별한 경우가 없는 한 대부분 readLine()
		 * 을 쓴다. 문자열 분리 방법에는 두 가지가 있다.
		 * 
		 * StringTokenizer 클래스를 이용하여 분리해주는 방법 split() 을 이용하는 방법 이 부분은 나중에 자세히 포스팅 하겠다만
		 * 결론부터 말하자면 StringTokenizer 가 성능면에서 좋다. 그래서 단순 규칙으로 문자열을 분리해줄 때 필자는
		 * StringTokenizer을 애용한다. 
		 * 
		 * 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환해준다.
		 * 이때 반환시킨 문자열은 반환됨과 동시에 해당 객체에서 사라지게 된다.
		 * 그리고 문자열을 반환했으니 Integer.parseInt()로 int 형으로 변환시켜준다.
		 */
	}

}
