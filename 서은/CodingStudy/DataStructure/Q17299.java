package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Q17299 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] inputArr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            inputArr[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int k : inputArr) {
            if(map.containsKey(k)) {
                map.put(k,map.get(k) + 1);
            } else if(!map.containsKey(k)){
                map.put(k,1);
            }
        }

        int[] countArr = new int[n]; // 등장 횟수 담을 배열

        for(int i = 0; i < n; i++) {
            countArr[i] = map.get(inputArr[i]);
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

//            while(true) {
//                if (!stack.empty() && (countArr[stack.peek()] < countArr[i])) {
//                    countArr[stack.pop()] = inputArr[i];
//                } else {
//                    stack.push(i);
//                    break;
//                }
//            }
            while (!stack.empty() && countArr[stack.peek()] < countArr[i]) {
                countArr[stack.pop()] = inputArr[i];
            }
            stack.push(i);
        }

        while (!stack.empty()) {
            countArr[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int k : countArr) {
            sb.append(k).append(" ");
        }
        sb.deleteCharAt(countArr.length-1);

        System.out.println(sb);
    }
}

