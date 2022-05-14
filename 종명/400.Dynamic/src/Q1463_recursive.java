import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1463_recursive {
	//1로 만들기
	static int[] d;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int n = Integer.parseInt(input);
		
		d = new int[n+1];
		for(int i = 0; i<=n; i++)
			d[i] = 0;
		
		int cnt = go(n);
		
		System.out.println(cnt);
		System.out.println("Complete");
	}
	
	// 10일 경우 
	static int go(int n) { 
		if (n == 1) return 0 ; 
		if (d[n] > 0) 
			return d[n]; 
		d[n] = go(n - 1) + 1 ; 
		
		if (n% 2 == 0) { 
			int temp = go(n/ 2) + 1 ; 
			if (d[n] > temp) d[n] = temp; 
		} 
		
		if (n% 3 == 0) { 
			int temp = go(n/ 3) + 1 ; 
			if (d[n] > temp) d[n] = temp; 
		} 
		return d[n]; 
	}

}
