package 함수;

public class Q4673 {
	// 문제 설명 : 해당 함수를 통해 나오는 숫자 외의 셀프넘버를 구하는 문제
	public static void main(String[] args) {
		boolean[] chk = new boolean[10001]; // 0부터가 아닌 1 ~ 10,000까지 이므로
			
		for(int i=1; i<10001; i++) {
			int n = d(i);
			
			if(n < 10001) {	// 10,000 이 넘는 숫자는 필요 없음
				chk[n] = true; // 해당값 index에 true				
			}
		}
		
		for(int i=1; i<10001; i++) {
			if(!chk[i]) { // false인 인덱스만 출력
				System.out.println(i);
			}
		}
	}
	// 두번째 풀이 : 14,564KB	152ms
	public static int d(int n) {
		int result = n;
		
		while(n!=0) {
			result = result + (n % 10); // 첫번째 자리수
			n = n/10;	// 10을 나눠서 첫번째 자리수를 없앤다. 다음 루프로 반복
		}
		return result;
	}
	
	/* 첫번째 풀이 : 14540KB	168ms
	public static int d(int n) {
		int result = 0;
		
		if(n < 10) {
			// 한자리
			result = n + n;
		} else if(n <100) {
			// 두자리
			result = n + (n/10) + (n%10);
		} else if(n < 1000) {
			// 세자리
			result = n + (n/100) + (n/10%10) + (n%10);
		} else if(n < 10000){
			// 네자리
			result = n + (n/1000) + (n/100%10) + (n/10%10) + (n%10);
		} else {
			// 다섯자리 이상(=10,000)
			result = n + (n/10000);
		}
		return result;
	}
	*/
}


