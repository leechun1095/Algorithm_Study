package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10824 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Stack<Character> stack = new Stack<>();


        StringTokenizer st = new StringTokenizer(br.readLine());

        String first = st.nextToken() + st.nextToken();
        String second = st.nextToken() + st.nextToken();

        long total = Long.parseLong(first) + Long.parseLong(second);

        System.out.println(total);
    }
}
