package lecture.bruteforce.recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q14501 {
    static int[] t;
    static int[] p;
    static int n;
    static int ans = 0;
    
    public static void main(String args[]) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    	n = Integer.parseInt(br.readLine());
		t = new int[n+1];
		p = new int[n+1];

		StringTokenizer st;
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			t[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(st.nextToken());
		}
		
        recurse(1, 0);
        
        System.out.println(ans);
    }
	
    // 재귀
    public static void recurse(int day, int sum) {
        if (day == n+1) {
        	ans = Math.max(ans, sum);
            return;
        }
        if (day > n+1) {
        	return;
        }
        
        recurse(day+1, sum); // 포함안될 때
        recurse(day + t[day], sum + p[day]); // 포함될 때
    }
}
