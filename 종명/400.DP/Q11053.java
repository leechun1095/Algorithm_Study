import java.util.*;

// 400.LIS(가장 긴 증가하는 부분수열) - 풀이 
public class Q11053 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        
        int[] d = new int[n];
        
        for (int i=0; i<n; i++) {
            d[i] = 1; //하나는 1
            // 10, 20, 10, 30, 20, 50 
            for (int j=0; j<i; j++) {
            	// 앞에 수 보다 커야 하고 && ★ d[i] < d[j]+1)  
                if (a[j] < a[i] && d[i] < d[j]+1) {
                    d[i] = d[j]+1;
                }
            }
        }
        int ans = d[0];
        for (int i=0; i<n; i++) {
            if (ans < d[i]) {
                ans = d[i];
            }
        }
        System.out.println(ans);
    }
}
