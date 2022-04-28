package step.D_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q3052 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			HashSet<Integer> resultSet = new HashSet<Integer>();
			
			for(int idx=0; idx<10; idx++) {
				int num = Integer.parseInt(br.readLine());
				resultSet.add(num % 42);
			}
			
			System.out.println(resultSet.size());
			
		} catch (Exception e) {
			
		} finally {
			br.close();
		}

	}

}
