package DFS_BFS.BruteForce;
import java.io.*;
import java.util.*;

public class Q2309 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = 0;
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 9; i++) {
			int input = Integer.parseInt(br.readLine());
			list.add(input);
			total += input;
		}
		
		// 이게 왜 안되는지 모르겠음
//		Loop1 :
//		for (int i = 0; i < 8; i++) {
//			Loop2 :
//			for (int j = i+1; j < 9; j++) {
//				if (list.get(i) + list.get(j) == total - 100) {
//					list.remove(i);
//					list.remove(j);
//					break Loop1;
//				}
//			}
//		}
//		Collections.sort(list);
//		
//		Iterator<Integer> it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		Loop1 :
			for (int i = 0; i < 8; i++) {
				Loop2 :
				for (int j = i+1; j < 9; j++) {
					if (list.get(i) + list.get(j) == total - 100) {
						list.set(i, 0);
						list.set(j, 0);
						Collections.sort(list);
						
						for (int k = 2; k < 9; k++) {
							System.out.println(list.get(k));
						}
						return;
					}
				}
			}
	}
}
