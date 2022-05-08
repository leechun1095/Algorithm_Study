import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader
		           (new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] atozCount = new int[26];
		String s = br.readLine();
		for(int i=0; i<s.length(); i++) {
			int index = s.charAt(i)-'a';
			atozCount[index]++;
		}
		
		for(int i=0; i<atozCount.length; i++) {
			sb.append(atozCount[i]).append(' ');
		}
		System.out.println(sb.toString().trim()); //마지막 공백 제거
	}
}