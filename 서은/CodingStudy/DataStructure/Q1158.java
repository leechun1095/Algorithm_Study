package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i = 0; i<N; i++) {
            que.add(i+1);
        }

        while(!que.isEmpty()) {
//           for(int i = 0; i<K-1; i++) {
//               que.add(que.poll());
//           }
//           sb.append(que.poll()).append(", ").;
            for(int j = 0; j < K; j++) { // K번째를 제거하기 위한 루프
                if(j == K-1) {
                    sb.append(que.poll() + ", "); // K번을 제거
                } else {
                    que.add(que.poll()); // K번이 아닐 때에는 맨 뒤로 이동
                }
            }
        }
        System.out.println("<"+sb.substring(0,sb.length()-2)+">");
    }
}
