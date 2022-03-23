package B.If문;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> diceList = new ArrayList();
		diceList.add(sc.nextInt());
		diceList.add(sc.nextInt());
		diceList.add(sc.nextInt());
		
		int equalCnt = 0;
		int equalDice = 0;
		for(int i=0; i<3; i++) {
			if(i < 2 && diceList.get(i) == diceList.get(i+1) || i == 2 && diceList.get(i) == diceList.get(i-2)) {
				equalCnt++;
				equalDice = diceList.get(i);
			}
		}

		int result;
		if(equalCnt == 3) {
			result = 10000 + equalDice * 1000;
		} else if(equalCnt == 1) {
			result = 1000 + equalDice * 100;
		} else {
			diceList.sort(Collections.reverseOrder());
			result = diceList.get(0) * 100;
		}
		
		System.out.println(result);
	}

}
