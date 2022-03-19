package if¹®;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9498 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		
		System.out.print((a >= 90) ? "A" : (a >= 80) ? "B" : (a >= 70) ? "C" : (a >= 60) ? "D" : "F");
		
		/*
		if(90 <= a &&  a <= 100) {
			System.out.println("A");
		} else if(80 <= a && a <= 89) {
			System.out.println("B");
		} else if(70 <= a && a <= 79) {
			System.out.println("C");
		} else if(60 <= a && a <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		*/
	}

}
