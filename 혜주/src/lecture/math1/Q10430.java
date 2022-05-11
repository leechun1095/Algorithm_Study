package lecture.math1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10430 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println( ((A%C) * (B%C))%C);
	}
}
