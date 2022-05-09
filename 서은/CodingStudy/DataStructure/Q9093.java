package DataStructure;
import java.util.Scanner;

public class Q9093 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numTestCase = Integer.parseInt(in.nextLine());
        // int numTestCase = in.nextInt // 실행 안됌
        int n = numTestCase;

        for(int i = 0; i<n; i++) {
            String input = in.nextLine();
            String[] inputArr = input.split(" ");

            StringBuffer reverseArr = new StringBuffer();

            for(String k : inputArr) {
                StringBuffer reverse = new StringBuffer(k);
                reverseArr.append(reverse.reverse());
                reverseArr.append(" ");
            }

            reverseArr.deleteCharAt(reverseArr.length() -1);
            System.out.println(reverseArr);
        }
        in.close();
    }
}
