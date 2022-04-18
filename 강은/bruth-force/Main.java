import java.io.*;
import java.util.*;


public class Main {
	static List<Integer> lst = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] arr = s.split(" ");
		int num = Integer.parseInt(arr[0]);
		int max = Integer.parseInt(arr[1]);
		s = br.readLine();
		br.close();

		
		String[] numArr = s.split(" ");
		int[] numbers = new int[numArr.length];
		
		for(int i=0; i< numbers.length; i++) {
			numbers[i] = Integer.parseInt(numArr[i]);
		}
		boolean[] check = new boolean[numbers.length];
		comb(0, numbers, check, 0);
		Collections.sort(lst);
		if (lst.get(lst.size()-1)<max) {
			System.out.println(lst.get(lst.size()-1));
			return;
			
		 }
		
		for(int i=0; i<lst.size(); i++) {
			if(lst.get(i)>max) {
				System.out.println(lst.get(i-1));
				return;
			}
		}

	}

	public static void comb(int i, int[] arr, boolean[] check,  int cnt) {
		if(cnt == 3) {
			int sum = 0;
			for(int a = 0; a<arr.length; a++) {
				if(check[a]) sum+=arr[a];
			}
			lst.add(sum);
			return;
		}
		else if(cnt>3||i>=arr.length) return;
		else {
			check[i]=true;
			comb(i+1, arr, check, cnt+1);
			check[i]=false;
			comb(i+1, arr, check, cnt);
		}	
	}
}



