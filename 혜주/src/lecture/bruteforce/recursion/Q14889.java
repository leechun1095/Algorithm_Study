package lecture.bruteforce.recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q14889 {
    static int[][] t;
    static int n;
    
    static int reverse(int index, ArrayList<Integer> first, ArrayList<Integer> second) {
        if (index == n) { // 모든 인원을 조에 포함시키면,
            if (first.size() != n/2) return -1;
            if (second.size() != n/2) return -1;
            
            int t1 = 0;
            int t2 = 0;
            for (int i=0; i<n/2; i++) {
                for (int j=0; j<n/2; j++) {
                    if (i == j) continue;
                    t1 += t[first.get(i)][first.get(j)];
                    t2 += t[second.get(i)][second.get(j)];
                }
            }
            int diff = Math.abs(t1-t2);
            return diff;
        }
        
        int ans = -1;
        // 1. 1조에 포함하는 경우
        first.add(index); // 1조에 넣는다.
        int t1 = reverse(index+1, first, second); // 재귀
        if (ans == -1 || (t1 != -1 && ans > t1)) { 
        	// 조 능력차가 기존 ans보다 작으면,
            ans = t1;
        }
        first.remove(first.size()-1); // 1조에서 뺀다.
        
        // 2. 2조에 포함하는 경우
        second.add(index); // 2조에 넣는다.
        int t2 = reverse(index+1, first, second); // 재귀
        
        if (ans == -1 || (t2 != -1 && ans > t2)) {
            ans = t2;
        }
        second.remove(second.size()-1); // 2조에서 뺀다.
        return ans;
    }
    
    public static void main(String args[]) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    	n = Integer.parseInt(br.readLine());
		t = new int[n][n];

		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int k=0; k<n; k++) {
				t[i][k] = Integer.parseInt(st.nextToken());
			}
		}
		
		ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        
        System.out.println(reverse(0, first, second));
    }

}
