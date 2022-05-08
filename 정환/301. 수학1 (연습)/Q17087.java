import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static int gcb(int a, int b) {
		while (b > 0) {
	        int tmp = a;
	        a = b;
	        b = tmp%b;
	    }
	    return a;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int[] arr = new int[Integer.parseInt(s[0])];
		int base = Integer.parseInt(s[1]);
		
		s = br.readLine().split(" ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Math.abs(base-Integer.parseInt(s[i]));
		}
		
		for(int i=1; i<arr.length; i++) {
			arr[i] = gcb( arr[i-1], arr[i]);
		}
		
		System.out.println(arr[arr.length-1]);
	}
}