import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1463 {
	//1로 만들기 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int n = Integer.parseInt(input);
		int[] d = new int[n+1];
		int cnt = 0;
		
		d[1] = 0 ; 
		
		for (int i = 2; i<=n; i++) { 
			d[i] = d[i - 1] + 1 ; 
			
			if (i% 2 == 0 && d[i] > d[i/2] + 1) { 
				d[i] = d[i/2] + 1 ; 
			} 
			
			if (i% 3 == 0 && d[i] > d[i/3] + 1) { 
				d[i] = d[i/3] + 1 ; 
			}
			
			cnt = d[i];
		}
		
		System.out.println(cnt);
		System.out.println("Complete");
	}

}
