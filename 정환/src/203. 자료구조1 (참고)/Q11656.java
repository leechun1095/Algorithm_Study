import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader
		           (new InputStreamReader(System.in));
		String s = br.readLine();
		String[] sufArr = new String[s.length()];
		
		//접미사 배열 생성
		for(int i=0; i<sufArr.length; i++) {
			sufArr[i]=""; //null값이 없도록 초기화
			for(int j=i; j<sufArr.length; j++) {
				//i번째부터 끝까지 문자추가하여 문자열 생성
				sufArr[i] = sufArr[i]+s.charAt(j); 
			}
		}
		
		//정렬
		Arrays.sort(sufArr);
		
		//출력
		for(int i=0; i<sufArr.length; i++) {
			System.out.println(sufArr[i]);
		}
	}
}