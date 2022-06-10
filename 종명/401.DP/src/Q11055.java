
import java.util.*;

// 가장 큰 증가하는 부분 수열
// D[i] = i번째에서 끝나는 LIS의 길이 
// ~ A[j] 까지 / 마지막 A[i] 
// max(D[j]+수) 
public class Q11055 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        
        int[] d = new int[n];
        for (int i=0; i<n; i++) {
        	// 처음값들 할당 
            d[i] = a[i];
            
            // 큰 값을 d[i]로 할당 : max(D[j]+수) 
            for (int j=0; j<i; j++) {
                if (a[j] < a[i] && d[i] < d[j]+a[i]) {
                    d[i] = d[j]+a[i];
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