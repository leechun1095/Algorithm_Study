import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		byte b = -98;
        Byte byt  = new Byte(b);
        int i1 = byt.intValue();
		*/
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
		byte[] bytes = s.getBytes(StandardCharsets.US_ASCII);
        
        int AtoZcnt = 26;
		int[] numbers = new int[AtoZcnt];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = -1;
		}
        
        
		int[] byteNum = new int[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
        	Byte a  = new Byte(bytes[i]); //바이트를 int로 바꾸기 위한 클래스 호출
        	byteNum[i] = a.intValue()-97;
        	
		}
        
        for (int i = 0; i < byteNum.length; i++) {
        	if(numbers[byteNum[i]] == -1) {
            	numbers[byteNum[i]] = i;
        	}
		}
        
        for (int i = 0; i < numbers.length; i++) {
        	System.out.print(numbers[i]+" ");
		}
		
	}

}