package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Q2108 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		 
		ArrayList<Integer> list = new ArrayList<>();
		
		// 1. 산술평균
		double sum = 0;
		
		for(int i=0; i<N; i++) {
			int temp = Integer.parseInt(br.readLine()); 
			sum += (double) temp;
			list.add(temp);
		}
		
		// 4번 변수
		int max = Collections.max(list);
		int min = Collections.min(list);
		
		double dbl = sum / N;
		int Average = (int) Math.round(dbl);
		System.out.println(Average);
		
		
		// 2. 중앙값
		Collections.sort(list);
		int Median = list.get(N/2);
		System.out.println(Median);
		
		
		// 3. 최빈값 : N개의 수들 중 가장 많이 나타나는 값, 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
		HashMap<Integer, Integer> hashmap = new HashMap<>();
		int Mode = 0;
		
		for(int val : list) {
			// 숫자가 한번 나올 때마다 1이 추가됨.
			hashmap.put(val, hashmap.getOrDefault(val, 0) + 1 );
		}
		
		int maxVal = 0; // 가장 큰 빈도수
		for(int hashVal : hashmap.values()) { // hashVal : hashmap의 values
			maxVal = Math.max(maxVal, hashVal);
		}
		
		list.clear();
		// 최빈값이 중복인 경우 감안
		for(int key : hashmap.keySet()) {
			if(hashmap.get(key) == maxVal) {
				list.add(key);
			}
		}
		Collections.sort(list);
		if(list.size() >= 2) {
			// 최빈수가 2개 이상일 경우 2번째로 작은 값을 출력해야 하므로 두번째 숫자를 최빈수로 설정
			Mode = list.get(1); 
		} else {
			// 1개일 경우 인덱스 0 설정
			Mode = list.get(0); 
		}
		System.out.println(Mode);
		
		
		// 4. 범위 : N개의 수들 중 최댓값과 최솟값의 차이
		// 둘다 음수일 경우
		if(max < 0 && min < 0) {
			// 한쪽을 절대값으로 변경
			min = Math.abs(min);
		// 둘다 양수인 경우
		} else if(max > 0 && min > 0) {
			min = min*-1;
		// min, max 부호가 서로 다를 때
		} else {
			max = Math.abs(max);
			min = Math.abs(min);
		}
		int Range = max + min;
		System.out.println(Range);
				
	}

}
