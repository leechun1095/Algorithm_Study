
<H3> 1929번 소수 구하기 </H3>
 - 최초 : 시간 초과 나옴 
  
--> 아리스토테네스 체 
  2의 배수 지움<br> 
  3의 배수 지움
  … <br>
  → 남는 것들이 소수 <br>
  
  for(int i = 2; i < toNo; i++)<br>
  {<br>
	  for(int a = i+i; a < toNo; a += i)<br>
	  {<br>
		  if(arrNo[a] == 0) continue; <br>
		  arrNo[a] = 0;<br>
  <br>

<H3> 유클리드호제 알고리즘 </H3>
  최대공약수 최적 알고리즘 <br>
  <br>
  ex) GCD(24,16) -> GCD(16,8) -> GCD(8,0) : 최대공약수 = 8 <br>
  <br>
	int iGdc = GDC(no1, no2);
<br>
	static int GDC(int a, int b)<br>
	{<br>
		if(b == 0) return a;<br>
		return GDC(b, a%b);<br>
	}<br>
<br>
