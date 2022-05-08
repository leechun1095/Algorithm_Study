import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader
		           (new InputStreamReader(System.in));
		LinkedList<Character> chars = new LinkedList<Character>();
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		for(int i=0; i<s.length(); i++) {
			chars.add(s.charAt(i));
		}
		
		ListIterator<Character> iter = chars.listIterator();
		
		int testCase = Integer.parseInt(br.readLine());
		
		while(iter.hasNext()) {
			iter.next();
		}
		
		for(int i=0; i<testCase; i++) {
			String[] command = br.readLine().split(" ");
			switch(command[0]) {
			case "L" : 
				if(iter.hasPrevious()) {
					//System.out.println(iter.previousIndex());
					iter.previous();
				}
				break;
			case "D" : 	
				if(iter.hasNext()) {
					//System.out.println(iter.nextIndex());
					iter.next();
				}
				break;
			case "B" :  
				if(iter.hasPrevious()) {
					iter.previous();
					iter.next();
					iter.remove();
				}
				break;
			case "P" :
				iter.add(command[1].charAt(0));
				break;
			}
		}
		while(iter.hasPrevious()) {
			iter.previous();
		}
		while (iter.hasNext()) {
			sb.append(iter.next());
		}
		System.out.println(sb);
	}
}