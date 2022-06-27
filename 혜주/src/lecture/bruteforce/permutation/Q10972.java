package lecture.bruteforce.permutation;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10972 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		if(next_permutaion(arr)) {
			for(int i=0; i<N; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		} else {
			System.out.println(-1);
		}
		
		System.out.println();
	}

	// 다음 순열 구하기
	private static boolean next_permutaion(int[] arr) {
		
		int i = arr.length-1; // 배열의 마지막 index
		// 1. 뒷자리부터 시작해서 오름차순인지 체크
		while(i > 0 && arr[i-1] >= arr[i]) {
			i-=1;
		}
		// 2. 작은수를 만나면, 멈춘다
		
		if(i <= 0) {
			// 맨앞자리 까지 오름차순이면, 마지막 순열이다.
			return false;
		}
		
		int k = arr.length - 1;
		while(arr[i-1] >= arr[k]) {
			k -= 1;
		}
		
		// 3. swap
		int temp = arr[i-1];
		arr[i-1] = arr[k];
		arr[k] = temp;
		
		// 4. 뒤짚는다.
		k = arr.length - 1;
		while(i < k) {
			temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
			i += 1;
			k -= 1;
		}
		
		return true;
	}
	
}
