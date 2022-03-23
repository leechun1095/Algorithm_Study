package B_If문;

import java.util.Scanner;

public class Q14681 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int result;
		
		if(x>0 & y>0) {
			result = 1;
		} else if(x<0 & y>0) {
			result = 2;
		} else if(x<0 & y<0) {
			result = 3;
		} else {
			result = 4;
		}

		System.out.println(result);
	}

}
