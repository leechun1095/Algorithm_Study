package ����°���Ģ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1008 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		double a = Double.parseDouble(str[0]);
		double b = Double.parseDouble(str[1]);
		
//		int�� ������ ��������.
//		int a = Integer.parseInt(str[0]);
//		int b = Integer.parseInt(str[1]);
		
		System.out.println(a / b);
	}

}
