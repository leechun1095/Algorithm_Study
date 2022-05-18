package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11052_BuyCard {
	
	public static int max(int a, int b) {
		if(a>b) {
			return a;
		} else {
			return b;			
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cardCnt = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] cardCost = new int[cardCnt+1];
		for(int i=1; i<cardCnt+1; i++) {
			cardCost[i] = Integer.parseInt(s[i-1]);
		}
		
		int[] totalCost = new int[cardCnt+1];
		totalCost[0] = 0;
		totalCost[1] = cardCost[1];
		
		for(int i=1; i<cardCnt+1; i++) {
			for(int j=1; j<=i; j++) {
				//System.out.println(totalCost[i]+" vs "+(totalCost[i-j]+cardCost[j]));
				totalCost[i]=max(totalCost[i],totalCost[i-j]+cardCost[j]);
			}
		}
		
		System.out.println(totalCost[cardCnt]);
		

	}

}
