package hellow;

public class EditorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		int offset = 0;
		String[] input = {"abcd","3","P x","L","P y"};
		String oriStr = input[0];
		offset = oriStr.length();
		char[] chrs = oriStr.toCharArray();
		
//		L	Ŀ���� �������� �� ĭ �ű� (Ŀ���� ������ �� ���̸� ���õ�)
//		D	Ŀ���� ���������� �� ĭ �ű� (Ŀ���� ������ �� ���̸� ���õ�)
//		B	Ŀ�� ���ʿ� �ִ� ���ڸ� ������ (Ŀ���� ������ �� ���̸� ���õ�)
//		������ ���� Ŀ���� �� ĭ �������� �̵��� ��ó�� ��Ÿ������, ������ Ŀ���� �����ʿ� �ִ� ���ڴ� �״����
//		P $	$��� ���ڸ� Ŀ�� ���ʿ� �߰���
		
		for(i=2;i < Integer.parseInt(input[1])+2; i++)
		{
			if(input[i].contains("P"))
			{
				char tmpCh = input[i].charAt(2);
				oriStr = oriStr.substring(0, offset) + tmpCh + oriStr.substring(offset, oriStr.length());
				offset += 1;				
			}
			// else if(input[i] == "B")
			else if(input[i] == "L")
				offset -= 1;
			else if(input[i] == "D")
				offset += 1;
			
		}
		
		System.out.println(oriStr);
	}

}
