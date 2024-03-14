package stringProgs;

public class StringBuff 
{

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("This Is Test");
		sb.replace(5, 7,"was");
		System.out.println(sb);
	}

}
