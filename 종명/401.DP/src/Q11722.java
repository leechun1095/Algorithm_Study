
import java.util.*;

// 가장 긴 감소하는 부분 수열 
// A[i], 다음 수 A[j]
// D[i] = max(D[j]) + 1 
public class Q11722 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] d = new int[n+1];
        for (int i=1; i<=n; i++) {
            a[i] = sc.nextInt();
        }
        
        // LIS와 유사, but 부등호 하나만 다름 a[i] > a[j], a[i] < a[j] 면 LIS 
        for (int i=n; i>=1; i--) {
            d[i] = 1;
            for (int j=i+1; j<=n; j++) {
                if (a[i] > a[j] && d[i] < d[j]+1) {
                    d[i] = d[j]+1;
                }
            }
        }
        
        int ans = d[1];
        for (int i=2; i<=n; i++) {
            if (ans < d[i]) {
                ans = d[i];
            }
        }
        System.out.println(ans);
    }
}