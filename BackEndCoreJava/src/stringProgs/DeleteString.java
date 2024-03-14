package stringProgs;

public class DeleteString 
{

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("This Was Test");
		sb.delete(5, 8);
		System.out.println(sb);
	}

}
