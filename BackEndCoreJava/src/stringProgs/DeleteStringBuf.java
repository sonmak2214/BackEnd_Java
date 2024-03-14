package stringProgs;

public class DeleteStringBuf 
{

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Today Is Thursday");
		sb.delete(9,17);
		System.out.println(sb);

	}

}
