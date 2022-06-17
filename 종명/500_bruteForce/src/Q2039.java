
import java.util.*;

// 일곱 난쟁이 
// 7명의 키를 더해 100 이 나와야 함 
// 9명이 주어서, 2명이 가짜 
public class Q2039 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int[] a = new int[n];
        int sum = 0;
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            
            // 9명 키의 합을 모두 구한 상태로 시작하여 2명을 거름 
            sum += a[i]; 
        }
        
        // 문제의 요건대로 정렬 
        Arrays.sort(a);
        
        // 9명 합에서 2명을 뺀 수가 100 찾기 
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {

            	// 2명을 거른게 100 (이렇게 간단하게 풀 수가!)  
                if (sum - a[i] - a[j] == 100) {
                	// 2명만 빼고 출력 해 줌 
                    for (int k=0; k<n; k++) {
                        if (i == k || j == k) continue;
                        System.out.println(a[k]);
                    }
                    // 종료 : 종료하지 않으면 시간 오래 검림 
                    System.exit(0);
                }
            }
        }
    }
}
