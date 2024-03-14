package stringProgs;

public class StringBuffInsert
{

	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer("This  Test");
		sb.insert(5,"was");
		System.out.println(sb);
	}

}
