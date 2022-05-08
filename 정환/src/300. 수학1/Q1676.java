import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	
	public Object factorial(Object n) {
		BigInteger a = (BigInteger)n;
		if(a.compareTo(BigInteger.valueOf(1))==1) {
			a = a.multiply((BigInteger) factorial(a.subtract(BigInteger.valueOf(1))));
		} else {
			a = BigInteger.valueOf(1);
		}
		return a;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		
		BufferedReader br = new BufferedReader
		           (new InputStreamReader(System.in));
		Main f = new Main();
		String numBR = br.readLine();
		BigInteger big = (BigInteger)f.factorial(BigInteger.valueOf(Integer.parseInt(numBR)));
		//System.out.println(big);
		
		char[] Chars = big.toString().toCharArray();
		
		int n = Chars.length-1;
		int cnt = 0;
		while(Chars[n]=='0') {
			n--;
			cnt++;
		}
		System.out.println(cnt);
	}
}
