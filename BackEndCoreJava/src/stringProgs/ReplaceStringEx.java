package stringProgs;

public class ReplaceStringEx 
{

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("This was Test");
		sb.replace(5,8,"is");
		System.out.println(sb);

	}

}
