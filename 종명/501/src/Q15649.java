import java.util.*;

// 수 n 까지 m 개 
public class Q15649 {
    
	static boolean[] c = new boolean[10]; //사용 여부
    static int[] a = new int[10]; // 결과 
    
    static StringBuilder sb = new StringBuilder();
    
    static void go(int index, int n, int m) {
        if (index == m) { // 수열을 출력 
            for (int i=0; i<m; i++) {
                sb.append(a[i]);
                if (i != m-1) sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for (int i=1; i<=n; i++) {
            if (c[i]) continue;
            
            // index번째 수 i를 넣음 
            c[i] = true;
            a[index] = i;
            go(index+1, n, m);
            c[i] = false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        go(0,n,m);
        System.out.print(sb.toString());
    }
}
