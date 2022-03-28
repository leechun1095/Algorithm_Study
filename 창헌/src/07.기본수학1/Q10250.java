package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10250 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		/* T : 테스트 케이스 수   
		   W : 각 층에 방 개수
		   H : 층 수
		   N : 몇번째 손님
		 */
		int T = Integer.parseInt(br.readLine());
		
		int[] arr = new int[T];
		for(int i=0; i<T; i++) {
			arr[i] = whatNumber();
		}
		for(int val : arr) {
			System.out.println(val);
		}
		
	}
	// 6  12  10 -> 402호
	// 30  50  72 ->  1203호
	
	// 세번째 풀이 : 14,424KB	132ms
	public static int whatNumber() throws IOException {
		int Y;	// 층
		int X;	// 호수
			
		String[] str = br.readLine().split(" ");
		int H = Integer.parseInt(str[0]);	// H : 층 수
		int N = Integer.parseInt(str[2]);	// N : 몇번째 손님
		
		// 층수 구하기
		if(N % H == 0) {
			Y = H * 100;
		} else {
			Y = (N % H) * 100; // 층수			
		}
		
		// 호수 구하기, 예외상황(N=6, H=6이라면)
		if(N % H == 0) {
			X = N / H; // 호수			
		} else {
			X = (N / H) +1; // 호수
		}
		
		int YYXX = Y+X;
		return YYXX;
	}
	
	/* 두번째 풀이 : 틀림.. 
	 * YXX, YYXX 고려 안함.
	public static int whatNumber() throws IOException {
		String HVal ="";
		String WVal ="";
			
		String[] str = br.readLine().split(" ");
		int H = Integer.parseInt(str[0]);	// H : 층 수
		int W = Integer.parseInt(str[1]);	// W : 각 층에 방 개수
		int N = Integer.parseInt(str[2]);	// N : 몇번째 손님
		
		if(N % H == 0) {
			HVal = Integer.toString(H);
		} else {
			HVal = Integer.toString((N % H)); // 층수			
		}
		WVal = Integer.toString((N / H) +1); // 호수
		
		if(WVal.length() == 1) {
			WVal = "0" + WVal;
		}
		
		return Integer.parseInt((HVal+WVal));
	}
	*/
	
	/* 첫번째 풀이(생각나는 대로) : 자바 실행에서는 답은 나오지만 예외상황으로 틀림 처리
	 * H=6, N=6 인 경우 H % N = 0 이 나오는데 6층을 배정해야함..
	 * 
	public static int whatNumber() throws IOException {
		String HVal ="";
		String WVal ="";
			
		String[] str = br.readLine().split(" ");
		int H = Integer.parseInt(str[0]);	// H : 층 수
		int W = Integer.parseInt(str[1]);	// W : 각 층에 방 개수
		int N = Integer.parseInt(str[2]);	// N : 몇번째 손님
		
		
		HVal = Integer.toString((N % H)); // 층수
		WVal = Integer.toString((N / H) +1); // 호수
		
		if(WVal.length() == 1) {
			WVal = "0" + WVal;
		}
		
		return Integer.parseInt((HVal+WVal));
	}
	*/
}
