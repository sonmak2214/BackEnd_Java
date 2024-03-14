package stringProgs;
public class StringEachCharRev 
{
	public static void main(String[] args) 
	{
		String s1="This Is Test";
		String arr[]=s1.split("\\s");
		String s2=null;
	
		for(String temp:arr) //enhanced for loop--for each loop
		{
			StringBuilder sb=new StringBuilder(temp);
			sb.reverse();
			if(s2==null)
			{
				s2=sb.toString();
			}
			else
			{
				s2=s2+" "+sb.toString();
			}
		}
		
		System.out.println(s2);
	}
}
		
	


