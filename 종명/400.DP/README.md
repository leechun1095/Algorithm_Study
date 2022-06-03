22.06.02 
<h1> Scanner </h1> <br>
Scanner sc = new Scanner(System.in); <br>
sc.next() // 공백 이전까지 문자열 입력 받음 <br>
sc.nextInt() // 정수 <br>
<br>
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ <br>
<br>

22.05.27<br>

<h3> 1로만들기 </h3>
강의보고 풀었지만, 이해가 안 됨. 

<h3> 이친수 </h3>
시간 초과 <br>


		int n = Integer.parseInt(input);
		int cnt = recursive(n);
		
		System.out.println(cnt);
	}
	
	static int recursive(int i)
	{
		if(i == 0)
			return 0;
		else if(i==1 || i==2)
			return 1;
		else
			return recursive(i-1) + recursive(i-2);
	}


<h3> 쉬운 계단수 </h3> <br>
풀이 보고 품 : 풀이를 거의 외우다 싶이 함 <br>

N : 길이, L : 마지막 수 <br>
D[N][L] = D[N-1][L-1] + D[N-1][L+1]; <br>
<br> 
자바는 int, long 사이즈 다름 
<br>
int : 4 byte <br>
long : 8 byte <br>
※ C++ 은 4 byte 동일 <br>



