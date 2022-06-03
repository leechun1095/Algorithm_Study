import java.util.*;

// �������� ��
// ��ȭ�� : .... + i^2 = N 
// N - i^2   + i^2 = N  
public class Q1699 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n+1];
        
        for (int i=1; i<=n; i++) {
            d[i] = i; // ������ 1�� �� �Ҵ� 

            // i = 4 
            // d[i(4)] = 4
            for (int j=1; j*j <= i; j++) {
            	
            	System.out.println(d[i] + " " + d[i-j*j]);
            	
            	// d[0]�� ���� 0 �ʱ�ȭ ���ݾ�
            	// j�� 2�� �� - d[4] : 4 > d[0] + 1  
                if (d[i] > d[i-j*j] + 1) {
                    d[i] = d[i-j*j] + 1;
                }
            }
        }
        
        System.out.println(d[n]);
    }
}