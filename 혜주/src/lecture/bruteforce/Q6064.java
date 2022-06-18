package lecture.bruteforce;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q6064 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.valueOf(br.readLine());
        while (t-- > 0) {
            String[] line = br.readLine().split(" ");
            int m = Integer.valueOf(line[0]);
            int n = Integer.valueOf(line[1]);
            int x = Integer.valueOf(line[2])-1;
            int y = Integer.valueOf(line[3])-1;
            boolean ok = false;
            for (int k=x; k<(n*m); k+=m) {
                if (k%n == y) {
                    System.out.println(k+1);
                    ok = true;
                    break;
                }
            }
            if (!ok) {
                System.out.println(-1);
            }
        }
	}
	
}
