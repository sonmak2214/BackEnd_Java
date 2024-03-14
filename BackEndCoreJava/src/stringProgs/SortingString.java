package stringProgs;

public class SortingString 
{

	public static void main(String[] args) 
	{
		String s1[]={"Shraddhha","Omkar","Sayali","Tejaswini","Sujit"};
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].compareTo(s1[j])>0)
				{
					String temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}
			}
		}
		
		for(int i=0;i<s1.length;i++)
		{
			System.out.println("Sorting Is:="+s1[i]);
		}
		
	}

}
