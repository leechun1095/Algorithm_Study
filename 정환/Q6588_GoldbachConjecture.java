package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6588_GoldbachConjecture {
	//에라토스테네스의 체
	//시작숫자, 끝숫자를 입력하면 그 범위내의 소수를 배열로 반환하는 메소드
	public static int[] isPrimeFastest(int num1, int num2) {
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
	
	public static int binarySearch(int[] primeNum, int searchNum) {
		int index = primeNum.length/2;
		int first = 0;
		int last = primeNum.length-1;
		int cnt=0;
		while(first<last) {
			cnt++;
			//System.out.println("cnt "+cnt);
			if(primeNum[index]<searchNum) {
				first = index+1;
				index = (index+last)/2;
			} else if(primeNum[index]>searchNum){
				last = index;
				index = (index+first)/2;
			} else {
				break;
			}//if
		}//while
		return index;
	}//binarySearch()
	
	public static boolean isPrime(int[] primeNum, int searchNum) {
		int index = primeNum.length/2;
		int first = 0;
		int last = primeNum.length-1;
		int cnt=0;
		boolean result=false;
		while(first<last) {
			cnt++;
			//System.out.println("cnt "+cnt);
			if(primeNum[index]<searchNum) {
				first = index+1;
				index = (index+last)/2;
			} else if(primeNum[index]>searchNum){
				last = index;
				index = (index+first)/2;
			} else {
				result=true;
				break;
			}//if
		}//while
		return result;
	}//isPrime()
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader
		           (new InputStreamReader(System.in));
		int numBR;
		int[] primeNum = isPrimeFastest(3, 1000100);
		int index;
		int minus;
		
		while(true) {
			numBR = Integer.parseInt(br.readLine());
			if(numBR ==0) break;
			index=binarySearch(primeNum,numBR)+1;
			minus = numBR-primeNum[index];
			while(true) {
				if(isPrime(primeNum,minus)) {
					System.out.println(numBR+" = "+minus+" + "+primeNum[index]);
					break;
				} else {
					index--;
					minus = numBR-primeNum[index];
					if(primeNum[index]<minus) {
						System.out.println("Goldbach's conjecture is wrong.");
						break;
					}//if
				}//if
			}//while
		}//while
	}//main
}
