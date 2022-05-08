import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int factorial(int a) {
		if(a==0) return 1;
		int n=a-1;
		while(n>0) {
			a = a*n;
			n--;
		}

		return a;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br.readLine()); 
		
		num1 = factorial(num1);
		
		System.out.println(num1);
		
		
	}

}