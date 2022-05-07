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
		
//		L	커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
//		D	커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
//		B	커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
//		삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임
//		P $	$라는 문자를 커서 왼쪽에 추가함
		
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
