
<H3> 1929번 소수 구하기 </H3>
 - 최초 : 시간 초과 나옴 
  
--> 아리스토테네스 체 
  2의 배수 지움 
  3의 배수 지움
  … 
  → 남는 것들이 소수 
  
  for(int i = 2; i < toNo; i++)
  {
	  for(int a = i+i; a < toNo; a += i)
	  {
		  if(arrNo[a] == 0) continue; 
		  arrNo[a] = 0;
  

<H3> 유클리드호제 알고리즘 </H3>
  최대공약수 최적 알고리즘 
  
  ex) GCD(24,16) -> GCD(16,8) -> GCD(8,0) : 최대공약수 = 8
  
	int iGdc = GDC(no1, no2);

	static int GDC(int a, int b)
	{
		if(b == 0) return a;
		return GDC(b, a%b);
	}

