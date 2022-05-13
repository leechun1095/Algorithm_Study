package 수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2004_3 {

	public static void main(String[] args) throws IOException {
		// 조합 0의 개수 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        long cnt2 = count2(N) - count2(M) - count2(N-M);
        long cnt5 = count5(N) - count5(M) - count5(N-M);


        System.out.println(Math.min(cnt2,cnt5));
	}
    public static long count5(int num) {
        long temp =0;
        if (num<5) {
        	return 0;
        }
        for (long i=5;i<=num;i=i*5) {
            temp = temp + (num/i);
        }
        return temp;
    }

    public static long count2(int num) {
        long temp =0;
        if (num<2) {
        	return 0;
        }
        for (long i=2;i<=num;i=i*2) {
            temp = temp + (num/i);
        }
        return temp;
    }
}
