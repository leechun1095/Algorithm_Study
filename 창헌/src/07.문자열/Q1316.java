package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1316 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 1. 단어 N개 입력받는다.
		   2. N에 대한 for문으로 문자열을 받는다.
		   3. 그룹단어 : 동일한 문자는 붙어있어야 함. 떨어진 경우 제외
		   4. 문자열 for문 생성하여 로직 정의
		    - 알파벳 배열 생성 후 false 초기화, 한번 나온 문자열은 true로 값 셋팅, 연속으로 동일 문자 처리
		 */
		
		// 두번째 풀이 : 14,240KB	128ms
		int cnt = 0;
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			if(check() == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
		/* 첫번째 풀이 : 틀림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] str = new String[N];
		
		for(int i=0; i<str.length; i++) {
			str[i] = br.readLine();
		}
		
		boolean[] arr = new boolean[26];
		for(int i=0; i<arr.length; i++) {
			arr[i] = false;
		}
				
		int cnt = 0;
				
		// a : 97, z : 122
		for(int j=0; j<str[j].length(); j++) {
			
			int temp = str[j].charAt(j);
			if(arr[temp - 97] == false) { //해당 문자열이 한번도 안나온 경우
				arr[temp - 97] = true;					
			} else { // 해당 문자열이 이미 나온 경우
				return; // for문 중지, 다음 문자열로 넘어감
			}
			cnt++;
		}

		br.close();
		System.out.println(cnt);
		*/
	}
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int prev = 0;		// 반복문에서 문자를 꺼낼 때 앞선 문자와 연속되는지 아닌지 판단하기 위한 변수
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			int now = str.charAt(i);	// i번째 문자 저장 (현재 문자)
			
			if(prev != now) { // 앞선 문자와 i번째 문자가 같지 않다면
			
				if(check[now - 97] == false) { // 해당 문자가 처음 나오는 경우(false 인 경우)
					check[now - 97] = true;		// true로 변경해준다.
					prev = now;					// 다음턴을 위해 prev도 변경해준다.
				} else {
					// 해당문자가 이미 나온 적이 있는 경우(그룹단어가 아님)
					return false; // 함수 종료
				}
			} else { // 앞선 문자와 i번째 문자가 같다면 (연속된 문자)
				continue;
			}
		}
		return true;
	}
}
