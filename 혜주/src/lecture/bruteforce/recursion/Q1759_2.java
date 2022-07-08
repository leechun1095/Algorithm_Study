package lecture.bruteforce.recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1759_2 {
    public static void main(String args[]) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int L = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		String[] alpha = new String[C];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<C; i++) {
			alpha[i] = st.nextToken();
		}
		Arrays.sort(alpha);
		
        recurse(L, alpha, "", 0);
    }
	
    // 암호 validation check
    public static boolean check(String password) {
        int ja = 0;
        int mo = 0;
        for (char x : password.toCharArray()) {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                mo += 1;
            } else {
                ja += 1;
            }
        }
        return ja >= 2 && mo >= 1;
    }
    
    // 재귀
    public static void recurse(int n, String[] alpha, String password, int i) {
        if (password.length() == n) {
            if (check(password)) { 
            	// 암호조건을 충족하면, print
                System.out.println(password);
            }
            return;
        }
        if (i >= alpha.length) {
        	return;
        }
        
        recurse(n, alpha, password+alpha[i], i+1); // 포함될 때
        recurse(n, alpha, password, i+1); // 포함안될 때
    }
}
