package A.입출력과사칙연산;
import java.util.Scanner;

public class Q2588 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		String bStr = Integer.toString(B);
		
		System.out.println(A * Integer.parseInt(bStr.substring(2)));
		System.out.println(A * Integer.parseInt(bStr.substring(1,2)));
		System.out.println(A * Integer.parseInt(bStr.substring(0,1)));
		System.out.println(A * B);
		
	}

}
