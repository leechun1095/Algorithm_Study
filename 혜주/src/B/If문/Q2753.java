package B.If문;

import java.util.Scanner;

public class Q2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		int result = 0;
		if(year%4 == 0 && (year%100 !=0 || year%400==0)) {
			result = 1;
		}

		System.out.println(result);
	}

}
