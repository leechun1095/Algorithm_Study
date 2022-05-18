package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1463_MakeOne {

	private static int[] D;
	
	public static int go(int num) {
		
		if(num==1) {
			D[1]=1;
		}
		D[num] = D[num-1]+1;
		if(num%2 ==0) {
			int temp = D[num/2]+1;
			if(temp<D[num]) {
				D[num]=temp;
			}
		}
		if(num%3 ==0) {
			int temp = D[num/3]+1;
			if(temp<D[num]) {
				D[num]=temp;
			}
		}
		
		
		return D[num];
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		D = new int[num+1];
		D[1]=0;
		for(int i=2; i<=num; i++) {
			go(i);
		}
		System.out.println(D[num]);
	}
}