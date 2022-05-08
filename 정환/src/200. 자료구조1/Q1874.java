import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int max = Integer.parseInt(br.readLine()); //입력횟수 && 최댓값
		int stk = 0; //스택 초기값
		int input = 0; //입력값
		//입력받는 값의 최댓값이 max이니 배열의 마지막 인덱스는 max여야함
		boolean[] flgStk = new boolean[max+1]; //pop이 이뤄진 숫자는 push할때 넘어갈 수 있도록
		Arrays.fill(flgStk,true);
		boolean isPop = false; // pop동작이 이뤄졌는지?
		boolean error = false; //push가 오름차순으로 발생하지 않았는지?
		
		for (int i = 0; i < max; i++) {
			input = Integer.parseInt(br.readLine());
			isPop = false;
			while(!isPop) {
				if(stk < input) {
					do {
						stk++;
						} while (!flgStk[stk]); //pop한 숫자인지 검사
					//System.out.println("+");
					sb.append("+").append('\n');
				} else if (stk > input){ //push가 오름차순으로 발생하지 않는 경우
					
					error = true;
					break;
					//System.out.println("ERROR");
					//sb.append("-").append('\n');
				} else if (stk == input) {
					flgStk[stk] = false;
					do {
						stk--;
						} while (!flgStk[stk]);
					//System.out.println("- pop!");
					sb.append("-").append('\n');
					isPop = true; //숫자가 같으면 pop 동작 수행
				}
			}
			if(error) {
				break;
			}
			//System.out.println(i+"번째 반복 - stk : "+stk);
			
		}
		if(error) {
			System.out.println("NO");
		} else {
			System.out.println(sb);
		}
	}
}