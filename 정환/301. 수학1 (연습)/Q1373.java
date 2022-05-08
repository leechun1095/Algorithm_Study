import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char[] chars = s.toCharArray();
		ArrayList<Integer> arr = new ArrayList<>();
		int num =0;
		int jari=0;
		for(int i=chars.length-1; i>=0; i--) {
			//System.out.println("i = "+i);
			jari = chars.length-1-i;
			//System.out.println("jari = "+jari);
			if(jari%3 ==0) {
				//System.out.println("      나머지는 0");
				arr.add(0);
				num = Character.getNumericValue(chars[i])*1;
			} else if(jari%3 ==1) {
				//System.out.println("      나머지는 1");
				num = Character.getNumericValue(chars[i])*2;
			} else if(jari%3 ==2) {
				//System.out.println("      나머지는 2");
				num = Character.getNumericValue(chars[i])*4;
			}
			arr.set(jari/3, arr.get(jari/3)+num);
		}
		
		for(int i=arr.size()-1; i>=0; i--) {
			System.out.print(arr.get(i));
		}
	}

}