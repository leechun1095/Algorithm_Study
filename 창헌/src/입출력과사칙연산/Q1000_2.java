package ����°���Ģ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1000_2 {

	static public void main(String[] args) throws IOException {
		// BufferedReader �� ���� ���
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a+b);
		
		/*
		 * BufferedReader �� ��� ���ڿ��� �޴� ��ǥ���� ����� readLine() �� read() �̴�. ���� ���̴�
		 * readLine() �� �� ���� �о����, read() �� �� ���ڸ� �о�´�. �׷��� Ư���� ��찡 ���� �� ��κ� readLine()
		 * �� ����. ���ڿ� �и� ������� �� ������ �ִ�.
		 * 
		 * StringTokenizer Ŭ������ �̿��Ͽ� �и����ִ� ��� split() �� �̿��ϴ� ��� �� �κ��� ���߿� �ڼ��� ������ �ϰڴٸ�
		 * ��к��� �����ڸ� StringTokenizer �� ���ɸ鿡�� ����. �׷��� �ܼ� ��Ģ���� ���ڿ��� �и����� �� ���ڴ�
		 * StringTokenizer�� �ֿ��Ѵ�. 
		 * 
		 * ���е� ������ ���� ���� ���ʴ�� nextToken(); �� ���ָ� ���ڿ��� ��ȯ���ش�.
		 * �̶� ��ȯ��Ų ���ڿ��� ��ȯ�ʰ� ���ÿ� �ش� ��ü���� ������� �ȴ�.
		 * �׸��� ���ڿ��� ��ȯ������ Integer.parseInt()�� int ������ ��ȯ�����ش�.
		 */
	}

}
