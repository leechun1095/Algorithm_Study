import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		int num1 = Integer.parseInt( st.nextToken() );
		int num2 = Integer.parseInt( st.nextToken() );
		
		boolean prime[] = new boolean[num2+1];
		prime[0] = prime[1] = true; //소수는 false
		
		for(int i=2; i*i<=num2; i++){
        	// prime[i]가 소수라면
            if(!prime[i]){
            	// prime[j] 소수가 아닌 표시
            	for(int j=i*i; j<=num2; j+=i) {
            		prime[j] = true;          
            	}
            }        
        }    
        
        // 소수 출력
        for(int i=num1; i<=num2;i++){
        	if(!prime[i]) System.out.println(i);        
        }
		
	}
}