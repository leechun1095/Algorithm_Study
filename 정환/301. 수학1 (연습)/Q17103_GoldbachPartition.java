package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q17103_GoldbachPartition {
	//에라토스테네스의 체
	//시작숫자, 끝숫자를 입력하면 그 범위내의 소수를 배열로 반환하는 메소드
	public static int[] arrPrime(int num1, int num2) {
		int cnt=0;
		boolean prime[] = new boolean[num2+1];
		prime[0] = prime[1] = true; //소수는 false
		
		for(int i=2; i*i<=num2; i++){
        	// prime[i]가 소수라면
            if(!prime[i]){
            	// prime[j] 소수가 아닌 표시
            	for(int j=i*i; j<=num2; j+=i) {
            		prime[j] = true;          
            	}//for j
            }//if     
        }//for i
       
        for(int i=num1; i<=num2;i++){
        	if(!prime[i]) cnt++;        
        }//for i

        int a=0;
		int[] numbers = new int[cnt];
        for(int i=num1; i<=num2;i++){
        	if(!prime[i]) {
        		numbers[a] = i;
        		a++;
        	}//if
        }//for i
        return numbers;
    }//isPrimeFastest()
	
	public static int binarySearch(int[] primeArr, int num) {
		int start = 0;
		int end = primeArr.length-1;
		int index = primeArr.length/2;
		
		while(start<end) {
			if(num<primeArr[index]) {
				end = index;
			} else if(num>=primeArr[index]){
				start = index+1;
			}
			index = (start+end)/2;
		}
		
		return index-1;
	}
	
	public static boolean isPrime(int[] primeArr, int num) {
		int start = 0;
		int end = primeArr.length-1;
		int index = primeArr.length/2;
		
		while(start<end) {
			if(num<primeArr[index]) {
				end = index;
			} else if(num>=primeArr[index]){
				start = index+1;
			}
			index = (start+end)/2;
		}
		//System.out.println("       "+primeArr[index]+" =? "+num);
		
		
		if(index == 0 && primeArr[index]== num) {
			return true;
		} else if(index != 0 && primeArr[index-1]== num){
			return true;
		} else {
			return false;
		}
//		if(primeArr[index]== num) {
//			return true;
//		} else {
//			return true;
//		}
	}
	
	
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int num;
		int[] primeArr = arrPrime(1,1000100);
		for(int i=0; i<testCase; i++) {
			num = Integer.parseInt(br.readLine());
			int index = binarySearch(primeArr, num);
			System.out.println(primeArr[index]);
			int cnt=0;
			int error = primeArr[index];
			//System.out.println(error);
			while(error>=num-error) {
				//System.out.println(error+"-"+(num-error));
				if(isPrime(primeArr,num-error)) {
					cnt++;
				}
				if(index ==0) break; else {

					index--;
				}
				error = primeArr[index];
			}
			System.out.println(cnt);
		}
	}
}
