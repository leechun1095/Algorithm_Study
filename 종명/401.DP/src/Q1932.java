import java.util.*;

// 정수 삼각형 
public class Q1932 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int[][] d = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        // 첫값 할당 
        d[0][0] = a[0][0];
        
        for (int i=1; i<n; i++) {
            for (int j=0; j<=i; j++) {
            	// 위 왼쪽 수와 자신의 수 더한 값 할당 
                d[i][j] = d[i-1][j] + a[i][j];
                // 위 오른쪽 수와 자신의 수 더한 값이, 왼쪽 수와 자신의 수 더한 값보다 클 경우 d[i][j] 할당 
                // --> 즉, 둘 중 더 큰 수가 들어가는 Max 구현  
                if (j-1 >= 0 && d[i][j] < d[i-1][j-1] + a[i][j]) {
                    d[i][j] = d[i-1][j-1] + a[i][j];
                }
            }
        }
        
        int ans = d[n-1][0];
        // 마지막 행의 각각의 열 중 가장 큰 값 할당 
        for (int i=0; i<n; i++) {
            if (ans < d[n-1][i]) {
                ans = d[n-1][i];
            }
        }
        System.out.println(ans);
    }
}
