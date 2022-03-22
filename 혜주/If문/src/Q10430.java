import java.util.Scanner;

public class Q10430 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		*/
		
		// BufferedReader 사용해 보세요. Scanner 보다 훨씬 성능적으로 좋다고 합니다. 앞으로 계속 써야해서 쓰다보면 외워짐!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int C = Integer.parseInt(str[2]);
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println( ((A%C) * (B%C))%C);
	}

}
