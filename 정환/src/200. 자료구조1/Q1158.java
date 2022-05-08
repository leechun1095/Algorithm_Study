import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();

		int idx = -1;
		int testCnt = 0; //전체 반복 횟수
		
		String[] s = br.readLine().split(" "); //띄어쓰기 구분
		
		int num1 = Integer.parseInt(s[0]); //수열의 크기
		int num2 = Integer.parseInt(s[1]); //몇번 건너뛸지
		
		for(int i = 1; i <= num1; i++) {
			numbers.add(i);
		}
				
		//반복해서 num2번째 숫자마다 result에 저장하는 로직
		while(testCnt < num1) {
			for(int i=0; i<num2; i++) { //한칸 갔을때 null이면 한번 더 건너뛰어야함.
				idx++;
				if(idx>=num1) {
					idx = idx%num1;
				}
				if(numbers.get(idx) == null) { //null값이니 한번 더 뛰어라
					i--;
				}
			}
			result.add(numbers.get(idx));
			numbers.set(idx,null);
			testCnt++;
		}
		
		//출력
		sb.append("<");
		for(int i = 0; i < num1; i++) {
			if(i<num1-1) {
				sb.append( result.get(i) ).append(", ");
			} else {
				sb.append( result.get(i) );
			}
			
		}
		sb.append(">");
		System.out.println(sb);
	}
}