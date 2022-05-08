 package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q1212_8JinsuTo2Jinsu {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader
		           (new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine(); //문자열 입력
		char[] chars = s.toCharArray(); //문자열 > 문자 배열
		ArrayList<Integer> arr = new ArrayList<>(); //자릿수마다 숫자저장할 배열
				
		int index=0;
		for(int i=chars.length-1; i>=0; i--) {
			arr.add(0);
			int num = Character.getNumericValue(chars[i]);
			int ten=1;
			while(ten!=1000) { //3자리 저장이 다끝나면 반복문 종료
				if(num%2==1) {
					arr.set(index, arr.get(index)+ten);
				} else {
					arr.set(index, arr.get(index)+0);
				}
				ten*=10;
				num/=2;
			}
			index++;
		}
		
		//100 또는 10보다 작을 경우 001이 아닌 1이 출력되기 때문에 0추가
		for(int i=arr.size()-1; i>=0; i--) {
			if(i!=arr.size()-1) { //처음은 안해도됨. 011-X 11-O
				if(arr.get(i)<100) {
					sb.append(0);
				}
				if(arr.get(i)<10) {
					sb.append(0);
				}
			}
			sb.append(arr.get(i));
		}
		System.out.println(sb);
	}
}
