import java.util.*;

// 연속합 - 풀이  
public class Q1912 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        
        int[] d = new int[n];
        for (int i=0; i<n; i++) {
            d[i] = a[i]; // 자신값을 할당 하고 
            if (i == 0) continue;
            // 앞의 수와 더한 값이 더 클 경우만 변경 
            if (d[i] < d[i-1] + a[i])
                d[i] = d[i-1] + a[i];
        }
        
        int ans = d[0];
        for (int i=0; i<n; i++) {
            if (ans < d[i]) { 
                ans = d[i]; // 가장 큰 수를 뽑음 
            }
        }
        
        System.out.println(ans);
    }
}