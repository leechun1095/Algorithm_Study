import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader
		           (new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testCase; i++) {
			String[] s = br.readLine().split(" ");
			for(int j=0; j<s.length; j++) {
				for(int k=s[j].length()-1; k>=0;k--) {
					sb.append(s[j].charAt(k));
				}
				sb.append(' ');
			}
			System.out.println(sb);
			sb.setLength(0);
		}
	}
}