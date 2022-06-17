import java.util.*;

// ������ 
// ä�� / ���峭 ��ư �� / ���峭 ��ư 
// 5457 / 3        / 6 7 8 
public class Q1107 {
    static boolean[] broken = new boolean[10];
    // ���峭 ��ư�� ������ ��� 0�� �����Ͽ� ���� + ���� ���� 
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
        
        // ���� �����ִ� ä���� 100�� 
        // ���ڹ�ư�� ������ �ʴ� ��� 
        int ans = channel - 100;
        if (ans < 0) {
            ans = -ans;
        }
        
        // ���ڹ�ư
        for (int i = 0; i <= 1000000; i++) {
        	// �̵��Ϸ��� ä�� c 
            int c = i;
            // ���ڹ�ư �� �� ������ �ϴ��� len�� �Ҵ� 
            int len = possible(c);
            if (len > 0) {
                int press = c - channel; // + ���� Ƚ�� 
                if (press < 0) {
                    press = -press; // - ���� Ƚ�� 
                }
                // ���� ��ư ���� Ƚ�� + +/= ���� Ƚ�� �� �ּҰ��϶� �Ҵ� 
                if (ans > len + press) {
                    ans = len + press;
                }
            }
        }
        System.out.println(ans);
    }
}