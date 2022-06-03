import java.util.*;

// ������ - Ǯ��  
public class Q1912 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        
        int[] d = new int[n];
        for (int i=0; i<n; i++) {
            d[i] = a[i]; // �ڽŰ��� �Ҵ� �ϰ� 
            if (i == 0) continue;
            // ���� ���� ���� ���� �� Ŭ ��츸 ���� 
            if (d[i] < d[i-1] + a[i])
                d[i] = d[i-1] + a[i];
        }
        
        int ans = d[0];
        for (int i=0; i<n; i++) {
            if (ans < d[i]) { 
                ans = d[i]; // ���� ū ���� ���� 
            }
        }
        
        System.out.println(ans);
    }
}