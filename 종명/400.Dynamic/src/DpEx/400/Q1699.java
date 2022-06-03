import java.util.*;

// 제곱수의 합
public class Q1699 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n+1];
        
        for (int i=1; i<=n; i++) {
            d[i] = i; // 각각에 1개 씩 할당 

            // 제곱이   
            for (int j=1; j*j <= i; j++) {
                if (d[i] > d[i-j*j] + 1) {
                    d[i] = d[i-j*j] + 1;
                }
            }
        }
        
        System.out.println(d[n]);
    }
}