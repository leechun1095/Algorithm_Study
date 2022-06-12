package DFS_BFS.BruteForce;

import java.io.*;
import java.util.*;

public class Q1476 {

	public static void main(String[] args) throws IOException {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  StringTokenizer st = new StringTokenizer(br.readLine());
		  
		  int E = Integer.parseInt(st.nextToken());
	      int S = Integer.parseInt(st.nextToken());
	      int M = Integer.parseInt(st.nextToken());
	      
	      int e = 1, s = 1, m = 1;
	      int result = 1;
	      
	      while (true) {
	            if (e > 15) {
	                e = 1;
	            }
	 
	            if (s > 28) {
	                s = 1;
	            }
	 
	            if (m > 19) {
	                m = 1;
	            }
	            if (e == E && s == S && m == M) {
	                break;
	            }
	 
	            e++;
	            s++;
	            m++;
	            result++;
	        }
	      System.out.print(result + "\n");
	}

}
