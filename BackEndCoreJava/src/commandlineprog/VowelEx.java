package commandlineprog;

public class VowelEx 
{

	public static void main(String[] args)
	{
		char ch=args[0].charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("Charactor is vowel");
		}
		else
		{
			System.out.println("Charactor is not vowel");
		}
		

	}

}
