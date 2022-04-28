package step.B_If문;

import java.util.Scanner;

public class Q2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();

		int cookMin = min + time % 60;
		int cookHour = hour + time / 60;
		
		if(cookMin >= 60) {
			cookMin -= 60;
			cookHour += 1;
		}
		if(cookHour >= 24) {
			cookHour -= 24;
		}
		
		System.out.println(cookHour + " " + cookMin);
	}

}
