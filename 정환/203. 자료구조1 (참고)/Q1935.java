import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader
		           (new InputStreamReader(System.in));
		Deque<Double> stack = new ArrayDeque<>(); //스택 선언
		int inputCase = Integer.parseInt(br.readLine()); //입력할 숫자 갯수
		String s = br.readLine(); //식 입력받아서
		char[] chars = s.toCharArray(); //char형 배열로 변환
		int[] inputArr =new int[inputCase]; //계산할 숫자들. 숫자 갯수만큼 정수형배열 선언
		double result=0; //계산하면 push할 계산결과
		
		//
		for(int i=0; i<inputArr.length; i++) {
			inputArr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<chars.length; i++) {
			if(chars[i] >= 'A' && chars[i] <= 'Z') { //A~Z일 경우
				int index = (int)(chars[i]-'A'); //A=0, B=1, C=2 이렇게 인덱스로 바꿔줌
				stack.push((double)inputArr[index]); //인덱스에 해당하는 숫자를 push
			} else { //A~Z가 아닌 경우. 즉, 연산자인 경우
				double a; //pop의 순서를 바꿔주기 위한 두개의 double형 변수
				double b;
				switch(chars[i]) {
				case '+': a=stack.pop(); //pop 해준다음
						  b=stack.pop();
						  result = b+a; //순서를 바꿔서 연산
						  stack.push(result); //다시 스택에 push
						  break;
				case '-': a=stack.pop();
						  b=stack.pop();
						  result = b-a;
						  stack.push(result);
						  break;
				case '*': a=stack.pop();
						  b=stack.pop();
						  result = b*a;
						  stack.push(result);
						  break;
				case '/': a=stack.pop();
						  b=stack.pop();
						  result = b/a;
						  stack.push(result);
						  break;
				}//switch
			}//if
		}//for i
		
		System.out.printf("%.2f",stack.pop()); //소수 둘째자리까지 출력
	}
}