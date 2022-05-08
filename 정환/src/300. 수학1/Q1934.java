import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numBR = Integer.parseInt(br.readLine());
		for (int x = 0; x < numBR; x++) {
			String[] s = br.readLine().split(" ");
			int num1 = Integer.parseInt(s[0]);
			int num2 = Integer.parseInt(s[1]);

			ArrayList<Integer> nums1 = new ArrayList<Integer>();
			ArrayList<Integer> nums2 = new ArrayList<Integer>();
			
			for (int i = 1; i <= num1; i++) {
				if(num1%i==0) {
					nums1.add(i);
				}
			}
			for (int i = 1; i <= num2; i++) {
				if(num2%i==0) {
					nums2.add(i);
				}
			}
			
					//최소공배수 구하기
			int MinGBS = 0;
			int a=1, b=1;
			int num1BS=num1, num2BS=num2;
			
			while(true) {
				if(num1BS<num2BS) {
					a++;
					num1BS = num1*a;
				} else if(num1BS>num2BS){
					b++;
					num2BS = num2*b;
				} else {
					MinGBS = num1BS;
					break;
				}
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append(MinGBS).append('\n');
			System.out.print(sb);
			sb.setLength(0);
		}
	}
}