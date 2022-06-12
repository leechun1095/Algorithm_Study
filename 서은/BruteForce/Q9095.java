package DFS_BFS.BruteForce;
import java.util.*;

public class Q9095 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	        int[] nums = new int[11]; // n은 양수이며 11보다 작다
	        nums[1] = 1; // (1) - 1가지
	        nums[2] = 2; // (1+1, 2) - 2가지
	        nums[3] = 4; // (1+1+1, 1+2, 3) - 4가지
	        // nums[4] -> (1+1의 총케이스, 2+2의 총케이스, 3+3의 총케이스) = 7
	        for (int i = 0; i < T; i++) {
	            int n = sc.nextInt();
	            for (int j = 4; j <= n; j++) {
	                nums[j] = nums[j - 1] + nums[j - 2] + nums[j - 3];
	            }
	            System.out.println(nums[n]);
	        }
	}

}
