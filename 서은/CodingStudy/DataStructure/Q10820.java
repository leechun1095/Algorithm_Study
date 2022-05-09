package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10820 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String input = "";

        while((input = br.readLine()) != null && !input.isEmpty()) {
            char[] inputArr = input.toCharArray();

            int up = 0;
            int low = 0;
            int num = 0;
            int space = 0;

            for (char i : inputArr) {
                if ('A' <= i && i <= 'Z') {
                    up++;
                } else if ('a' <= i && i <= 'z') {
                    low++;
                } else if ('0' <= i && i <= '9') {
                    num++;
                } else space++;
            }

            sb.append(low).append(' ').append(up).append(' ').append(num).append(' ').append(space);
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
