import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 유클리드 호제 
public class GreatCommonDevidor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String[] arr = input.split(" ");
		
		int no1 = Integer.parseInt(arr[0]);
		int no2 = Integer.parseInt(arr[1]);
		
		int iGdc = GDC(no1, no2);
		
		System.out.println(iGdc);
	}

	static int GDC(int a, int b)
	{
		if(b == 0) return a;
		return GDC(b, a%b);
	}
}
