
import java.util.*;

// �ϰ� ������ 
// 7���� Ű�� ���� 100 �� ���;� �� 
// 9���� �־, 2���� ��¥ 
public class Q2039 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int[] a = new int[n];
        int sum = 0;
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            
            // 9�� Ű�� ���� ��� ���� ���·� �����Ͽ� 2���� �Ÿ� 
            sum += a[i]; 
        }
        
        // ������ ��Ǵ�� ���� 
        Arrays.sort(a);
        
        // 9�� �տ��� 2���� �� ���� 100 ã�� 
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {

            	// 2���� �Ÿ��� 100 (�̷��� �����ϰ� Ǯ ����!)  
                if (sum - a[i] - a[j] == 100) {
                	// 2�� ���� ��� �� �� 
                    for (int k=0; k<n; k++) {
                        if (i == k || j == k) continue;
                        System.out.println(a[k]);
                    }
                    // ���� : �������� ������ �ð� ���� �˸� 
                    System.exit(0);
                }
            }
        }
    }
}
