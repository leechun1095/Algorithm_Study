import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0 ;
		int primeCnt = 0;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		
		int[] numbers = new int[num1];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		for (int a = 0; a < numbers.length; a++) {
			//System.out.println(numbers[a]);
			if(numbers[a]==1) {
				continue;
			} else if (numbers[a]==2){
				primeCnt++;
				continue;
			} else {
				for (int b = 2; b < numbers[a]; b++) {
					if((numbers[a]%b) == 0) {
						break;
					} else if (b == numbers[a]-1){
						primeCnt++;
					}
				}
			}
						
		}
		System.out.println(primeCnt);
	}

}