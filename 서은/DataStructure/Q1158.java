package 서은.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> que = new LinkedList();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int j;
        for(j = 0; j < N; ++j) {
            que.add(j + 1);
        }

        while(!que.isEmpty()) {
            for(j = 0; j < K; ++j) {
                if (j == K - 1) {
                    sb.append(que.poll() + ", ");
                } else {
                    que.add((Integer)que.poll());
                }
            }
        }

        PrintStream var10000 = System.out;
        String var10001 = sb.substring(0, sb.length() - 2);
        var10000.println("<" + var10001 + ">");
    }
}
