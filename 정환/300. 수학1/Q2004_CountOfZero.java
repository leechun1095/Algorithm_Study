package Math; 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2004_CountOfZero {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int nSubm = n-m;
		int cnt5 =0;
		int cnt2 = 0;
		
		while(n>=5) {
			cnt5+=n/5;
			n/=5;
		}
		//System.out.println(cnt5);
		while(m>=5) {
			cnt5-=m/5;
			m/=5;
		}
		//System.out.println(cnt5);
		while(nSubm>=5) {
			cnt5-=nSubm/5;
			nSubm/=5;
		}
		
		
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);
		nSubm = n-m;
		
		while(n>=2) {
			cnt2+=n/2;
			n/=2;
		}
		//System.out.println(cnt5);
		while(m>=2) {
			cnt2-=m/2;
			m/=2;
		}
		//System.out.println(cnt5);
		while(nSubm>=2) {
			cnt2-=nSubm/2;
			nSubm/=2;
		}
		
		
		if(cnt2>cnt5) {
			System.out.println(cnt5);
		} else {
			System.out.println(cnt2);
		}
	}
}


/* 시간초과 난 소스코드
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int plus5 = 0;
		int plus2 = 0;
		
		//n * n-1 * n-2 * n-3 * ... * n-m+1 > 분자
		//소인수 분해 했을 때 2,5가 몇 개 있는지 더해준다. (분자니까)
		for(int i=n; i>=n-m+1; i--) {

			//5로 나눌수 있을 떄까지 반복.
			int num=i;
			while(true) { 
				if(num%5==0) {
					plus5++;
					num/=5;
				} else {
					break;
				}
			}
			
			num=i;
			while(true) { 
				if(num%2==0) {
					plus2++;
					num/=2;
				} else {
					break;
				}
			}
		}
		
		//m * m-1 * m-2 * m-3 * ... * 1 > 분모
		//소인수 분해 했을 때 2,5가 몇 개 있는지 빼준다. (분모니까)
		for(int i=m; i>0; i--) {

			//5로 나눌수 있을 떄까지 반복.
			int num=i;
			while(true) {
				if(num%5==0 && plus5>0) { //여기는 빼주기만 하므로 plus5가 0보다 작으면 종료
					plus5--;
					num/=5;
				} else {
					break;
				}
			}
			
			num=i;
			while(true) {
				if(num%2==0 && plus2>0) { //여기는 빼주기만 하므로 plus5가 0보다 작으면 종료
					plus2--;
					num/=2;
				} else {
					break;
				}
			}
		}
		
		//2,5중에서 작은 숫자를 출력하면 그게 0의 갯수와 같다.
		if(plus2 > plus5) {
			System.out.println(plus5);
		} else {
			System.out.println(plus2);
		}
*/
