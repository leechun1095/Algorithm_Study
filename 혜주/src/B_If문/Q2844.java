package B_If문;

import java.util.Scanner;

public class Q2844 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		Boolean flag = true;
		if(min-45 < 0) {
			flag = false;
		}
		
		int alarmMin = flag ? min-45 : min+15;
		int alarmHour = flag ? hour : hour-1;
		alarmHour = alarmHour < 0 ? 23 : alarmHour;

		System.out.println(alarmHour + " " + alarmMin);
	}

}
