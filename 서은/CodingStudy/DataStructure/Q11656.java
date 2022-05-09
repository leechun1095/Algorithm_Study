package DataStructure;
// 다른 더 좋은 방식이 있을 것 같음
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q11656 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String input = br.readLine();
        StringBuilder sb = new StringBuilder(input);

//        for (int i = 0; i < sb.length(); i++) {
//            sb.append(input.charAt(i));
//        }

        String[] inputArr = new String[input.length()];

        inputArr[0] = input;
        String temp;

        for (int i = 1; i < input.length(); i++) {
            temp = sb.deleteCharAt(0).toString();
            inputArr[i] = temp;
        }

        Arrays.sort(inputArr);

        for(String k : inputArr) {
            System.out.println(k);
        }
    }
}
