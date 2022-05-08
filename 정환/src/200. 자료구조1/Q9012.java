import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br.readLine()); 
		boolean brk;
		int left = 0;
		int right = 0;
        
        for (int i = 0; i < num1; i++) {
        	brk = false;
        	left = 0;
        	right = 0;
        	
        	String myString = br.readLine();
            char[] myChars = myString.toCharArray();
            
            
            for (int x = 0; x < myChars.length; x++) {
            	if(myChars[x] == '(') {
            		left++;
            		//System.out.println("left++");
            	} else if (myChars[x] == ')') {
            		right++;
            		//System.out.println("right++");
            	}
            	//System.out.println(left-right);
            	if(left-right <0) {
            		brk = true;
            		//System.out.println("Break 실행된다!");
            		break;
            	}
    		}
            if(brk || left-right !=0) {
            	System.out.println("NO");
            } else if(left-right == 0){
            	System.out.println("YES");
            }
		}        
	}

}