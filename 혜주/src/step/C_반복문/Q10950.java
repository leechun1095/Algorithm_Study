package step.C_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a,b;
		int[] resultArr = new int[n];
		for(int i=0; i<n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			resultArr[i] = a+b;
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(resultArr[i]);
		}
		
	}
}
