import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] s = sc.nextLine().split(" ");
		String s1 = s[0]+s[1];
		String s2 = s[2]+s[3];
		Long num = Long.parseLong(s1)+Long.parseLong(s2);
		System.out.println(num);
	}
}