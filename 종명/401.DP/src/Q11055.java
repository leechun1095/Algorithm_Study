
import java.util.*;

// ���� ū �����ϴ� �κ� ����
// D[i] = i��°���� ������ LIS�� ���� 
// ~ A[j] ���� / ������ A[i] 
// max(D[j]+��) 
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
        	// ó������ �Ҵ� 
            d[i] = a[i];
            
            // ū ���� d[i]�� �Ҵ� : max(D[j]+��) 
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