import java.util.*;

// 400.LIS(���� �� �����ϴ� �κм���) - Ǯ�� 
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
            d[i] = 1; //�ϳ��� 1
            // 10, 20, 10, 30, 20, 50 
            for (int j=0; j<i; j++) {
            	// �տ� �� ���� Ŀ�� �ϰ� && �� d[i] < d[j]+1)  
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
