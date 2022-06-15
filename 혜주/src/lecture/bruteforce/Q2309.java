package lecture.bruteforce;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2309 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		int sum = 0;
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		// 브루트포스
		// 9명중 2명을 뺐을 때 합이 100인 경우 찾기
		int[] resultNonItem = getNonItems(arr, sum);
		int a = resultNonItem[0];
		int b = resultNonItem[1];

		for(int i=0; i<arr.length; i++) {
			if(i != a && i != b) {
				System.out.println(arr[i]);
			}
		}
	}
	
	static int[] getNonItems(int[] arr, int sum) {
		
		for(int i=0; i<arr.length-1; i++) {
			for(int k=i+1; k<arr.length; k++) {
				if(sum - arr[i] - arr[k] == 100) {
					return new int[] {i,k};
				}
			}
		}
		
		return null;
	}
}
