package E_함수;

public class Q4673 {
	
	public static int d(int n) {
		int result = n;
		
		while(n != 0) {
			result += n % 10;
			n /= 10;
		}
		return result;
	}
	
	public static void main(String[] args) {

		boolean[] check = new boolean[10001];
		
		for(int i=1; i<= 10000; i++) {
			int number = d(i);
			
			if(number <= 10000) {
				check[number] = true;
			}
		}
		
		for(int i=1; i<= 10000; i++) {
			if(!check[i]) {
				System.out.println(i);
			}
		}
	}

}
