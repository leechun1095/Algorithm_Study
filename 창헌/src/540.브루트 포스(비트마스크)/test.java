package 브루트포스_비트마스크;

public class test {

	public static void main(String[] args) {
		// 부분 수열(집합) 모두 구하기
		int[] arr = new int[]{1,2,3};
		int n = arr.length;
		
		System.out.println(1 << n);
		
		for(int i = 0; i < (1<<n); i++) {
			for(int j = 0; j < n; j++) {
				if((i & (1<<j)) != 0) {
					System.out.print(arr[j] + ", ");
				}
			}
			System.out.println();
		}
    }
}