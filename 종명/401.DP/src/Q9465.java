import java.io.*;
import java.util.*;

// 스티커
public class Q9465 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(br.readLine());
        
        while (t-- > 0) {
            int n = Integer.valueOf(br.readLine());
            // 각각의 값을 a[i][0/1] 에 할당 
            long[][] a = new long[n+1][2];
            {
                String[] line = br.readLine().split(" ");
                for (int i=1; i<=n; i++) {
                    a[i][0] = Long.valueOf(line[i-1]);
                }
            }
            {
                String[] line = br.readLine().split(" ");
                for (int i=1; i<=n; i++) {
                    a[i][1] = Long.valueOf(line[i-1]);
                }
            }
            
            
            long[][] d = new long[n+1][3];
            // d[i][j] = 2 x i 에서  
            for (int i=1; i<=n; i++) {
            	// 스티커 뜯지 않음 
                d[i][0] = Math.max(d[i-1][0],Math.max(d[i-1][1],d[i-1][2]));
                // 위 스티커 뜯음
                d[i][1] = Math.max(d[i-1][0],d[i-1][2])+a[i][0];
                // 아래 스티커 뜯음 
                d[i][2] = Math.max(d[i-1][0],d[i-1][1])+a[i][1];
            }
            long ans = 0;
            ans = Math.max(d[n][0], Math.max(d[n][1], d[n][2]));
            System.out.println(ans);
        }
    }
}