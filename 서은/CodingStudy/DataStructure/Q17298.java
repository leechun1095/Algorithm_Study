package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q17298 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++) {
//            int temp = seq[i];
//            if(stack.empty()) stack.push(i);
//
//            if(temp > stack.peek()) {
//                while(temp > stack.peek()) {
//                    seq[stack.pop()] = temp;
//                }
//                stack.push(i);
//            } else {
//                stack.push(i);
//            }
            while(!stack.isEmpty() && seq[stack.peek()] < seq[i]) {
                seq[stack.pop()] = seq[i];
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            seq[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();

        for(int k : seq) {
            sb.append(seq).append(" ");
        }
        // sb.deleteCharAt(sb.length()-1);


        System.out.println(sb);
    }
}
