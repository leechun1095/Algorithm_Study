package DataStructure;
import java.util.Scanner;
import java.util.Stack;

public class Q9012 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numTest = Integer.parseInt(in.nextLine());

        for(int i = 0; i < numTest; i++) {
            Stack<Character> stack = new Stack<>();
            String input = in.nextLine();
            char[] inputArr = input.toCharArray();

            for(char k : inputArr) {
                if(k == '(') {
                    stack.push('(');
                } else if(k == ')') {
                    if(stack.empty()) {
                        System.out.println("NO");
                    } else {
                        stack.pop();
                    }
                } else break;
            }
            if(stack.empty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
