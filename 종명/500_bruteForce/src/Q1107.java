import java.util.*;

// 리모콘 
// 채널 / 고장난 버튼 수 / 고장난 버튼 
// 5457 / 3        / 6 7 8 
public class Q1107 {
    static boolean[] broken = new boolean[10];
    // 고장난 버튼을 눌렀을 경우 0을 리턴하여 숫자 + 하지 않음 
    static int possible(int c) {
        if (c == 0) {
            if (broken[0]) {
                return 0;
            } else {
                return 1;
            }
        }
        int len = 0;
        while (c > 0) {
            if (broken[c % 10]) {
                return 0;
            }
            len += 1;
            c /= 10;
        }
        return len;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int channel = sc.nextInt();
        int brokenCnt = sc.nextInt();
        for (int i = 0; i < brokenCnt; i++) {
            int brokenNo = sc.nextInt();
            broken[brokenNo] = true;
        }
        
        // 현재 보고있는 채널이 100번 
        // 숫자버튼을 누르지 않는 경우 
        int ans = channel - 100;
        if (ans < 0) {
            ans = -ans;
        }
        
        // 숫자버튼
        for (int i = 0; i <= 1000000; i++) {
        	// 이동하려는 채널 c 
            int c = i;
            // 숫자버튼 몇 번 눌러야 하는지 len에 할당 
            int len = possible(c);
            if (len > 0) {
                int press = c - channel; // + 누른 횟수 
                if (press < 0) {
                    press = -press; // - 누른 횟수 
                }
                // 숫자 버튼 누른 횟수 + +/= 누른 횟수 가 최소값일때 할당 
                if (ans > len + press) {
                    ans = len + press;
                }
            }
        }
        System.out.println(ans);
    }
}