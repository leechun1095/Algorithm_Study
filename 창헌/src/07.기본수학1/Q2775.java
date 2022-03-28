package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2775 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int[][] arr = new int[15][15];
	
	public static void main(String[] args) throws IOException {
		// 14,116KB		124ms
		/* T : 테스트 케이스 수
		   k : 층수
		   n : 호수
		   
		   		1호	2호	3호	4호	5호	6호 	 7호	  8호     9호 
		   6층	1	8	36	120	330	792  1716 3432 6435
		   5층	1	7	28	84	210	462  924  1716 3003	
		   4층	1	6	21	56	126	252	 462  792  1287
		   3층	1	5	15	35	70	126	 210  330  495
		   2층	1	4	10	20	35	56	 84	  120  165
		   1층	1	3	6	10	15	21	 28	  36   45
		   0층	1	2	3	4	5	6	 7	  8	   9
		   
		   k=1, n=3  -> 6명
		   (k-1)층 1호 + (k-1)층 2호 + (k-1)층 3호 = 6명
		   
		   k=2, n=3	 -> 10명
		   1층 1호 + 1층 2호 + 1층 3호 = 10명
		 */
		// 몇층까지라고 문제에 안나온 것 같은데.. 뭐지?
		int T = Integer.parseInt(br.readLine());
		String[] strArr = new String[T];
		
		for(int i=0; i<T; i++) {
			strArr[i] = Integer.toString(whatNumber());
		}
		for(String val : strArr) {
			System.out.println(val);
		}
		
	}
	public static int whatNumber() throws IOException {
		int k = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<15; i++) {
			arr[i][1] = 1; // i층 1호
			arr[0][i] = i; // 1층 i호
		}
		for(int i=1; i<15; i++) { //1층~14층까지
			for(int j=2; j<15; j++) { //2호~14호까지
				arr[i][j] = arr[i][j-1] + arr[i-1][j];
			}
		}
		int result = arr[k][n];
		return result;
	}
}
