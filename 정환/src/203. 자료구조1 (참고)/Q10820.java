import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader
		           (new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] cnt; //개수 배열
		String s="";
		
		while((s = br.readLine()) != null ) { //EOF 처리
			cnt = new int[4]; //{소문자,대문자,숫자,공백}의 개수
			
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)>='a' && s.charAt(i)<='z') { //소문자의 경우
					cnt[0]++;
				} else if(s.charAt(i)>='A' && s.charAt(i)<='Z') { //대문자
					cnt[1]++;
				} else if(s.charAt(i)>='0' && s.charAt(i)<='9') { //숫자
					cnt[2]++;
				} else if(s.charAt(i)==' ') { //공백
					cnt[3]++;
				}
			}
			
			for(int i=0; i<cnt.length; i++) {
				sb.append(cnt[i]).append(" ");
			}
			sb.deleteCharAt(sb.lastIndexOf(" "));
			System.out.println(sb);
			sb.setLength(0);
		}
	}

}