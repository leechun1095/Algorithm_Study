import java.util.*;

// ������ �ý� (similar to ��ģ��)
public class Q2156 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i=1; i<=n; i++) {
            a[i] = sc.nextInt();
        }
        
        int[] d = new int[n+1];
        // d[1] = ù��° ��  
        d[1] = a[1];
        
        // d[2] = 1st + 2nd  
        if (n >= 2)
            d[2] = a[1]+a[2];
        
        // �̰� ����ü ��� ���� ������? 
        for (int i=3; i<=n; i++) {
            d[i] = d[i-1]; 
            // Max(1st + 2nd, 1st + 3rd)
            d[i] = Math.max(d[i], d[i-2]+a[i]);
            // Max(d[i], 0 + 2nd + 3rd)
            d[i] = Math.max(d[i], d[i-3]+a[i-1]+a[i]);
        }
        
        int ans = d[1];
        for (int i=2; i<=n; i++) {
            ans = Math.max(ans, d[i]);
        }
        
        System.out.println(ans);
    }
}