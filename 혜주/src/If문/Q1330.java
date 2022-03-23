package If문;

import java.util.Scanner;

public class Q1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		String result = "";
		if(num1 > num2) {
			result = ">";
		} else if(num1 < num2) {
			result = "<";
		} else {
			result = "==";
		}

		System.out.println(result);
	}

}
