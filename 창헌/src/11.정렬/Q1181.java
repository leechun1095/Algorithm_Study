package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Q1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<>();
		
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			list.add(str);
		}
		
		// 사전 순으로 정렬된다.
		// Collections.sort(list);
		
		HashMap<String, Integer> hashmap = new HashMap<>();
		
		int len = 0;
		for(String val : list) {
			len = val.length();
			hashmap.put(val, len);
		}
		
		// length 가 작은 key부터 출력이 되야하는데,
		// length가 같으면 사전순으로 출력 
		
		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(hashmap.entrySet());
		
		//iterator.hasNext()는 다음 값이 있는지 없는지 확인하는 메소드
		entryList.sort(Map.Entry.comparingByKey());
		entryList.sort(Map.Entry.comparingByValue());
		
		for(Map.Entry<String, Integer> entry : entryList) {
			System.out.println(entry.getKey());
		}			
		
	}

}
