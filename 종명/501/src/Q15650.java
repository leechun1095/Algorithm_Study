import java.util.*;

// 오름차순 
// 1~N 중에서 앞에서 사용하지 않은 수 
public class Q15650 {
    static boolean[] c = new boolean[10];
    static int[] a = new int[10];
    static void go(int index, int start, int n, int m) {
        if (index == m) {
            for (int i=0; i<m; i++) {
                System.out.print(a[i]);
                if (i != m-1) System.out.print(' ');
            }
            System.out.println();
            return;
        }
        
        // index번째 수 채움 : start~N까지 
        for (int i=start; i<=n; i++) {
            if (c[i]) continue;
            c[i] = true;
            a[index] = i;
            // i+1 - start 
            go(index+1, i+1, n, m);
            c[i] = false;
        }
    }  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        go(0,1,n,m);
    }
}