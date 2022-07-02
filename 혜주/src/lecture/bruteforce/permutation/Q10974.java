package lecture.bruteforce.permutation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10974 {
    public static void main(String args[]) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
        
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = i+1;
        }
        do {
            for (int i=0; i<n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        } while(next_permutation(a));
    }
    
    public static boolean next_permutation(int[] a) {
        int i = a.length-1;
        while (i > 0 && a[i-1] >= a[i]) {
            i -= 1;
        }

        if (i <= 0) {
            return false;
        }

        int j = a.length-1;
        while (a[j] <= a[i-1]) {
            j -= 1;
        }

        int temp = a[i-1];
        a[i-1] = a[j];
        a[j] = temp;

        j = a.length-1;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i += 1;
            j -= 1;
        }
        return true;
    }
	
}
