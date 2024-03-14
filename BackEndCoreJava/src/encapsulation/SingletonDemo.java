package encapsulation;
class SingletonEx
{
	 static SingletonEx s1obj=null;
	  private SingletonEx()
	  {
		  System.out.println("Only One Object Is Created Here.. ");
	  }
	  
	  public static SingletonEx get()
	  {
		  if(s1obj==null)
		  {
			  s1obj=new SingletonEx();//memory allocated
		  }
		return s1obj;	
		
	 }
}

public class SingletonDemo 
{
 
	public static void main(String[] args) 
	{
		SingletonEx s=SingletonEx.get();
		SingletonEx s1=SingletonEx.get();
		SingletonEx s2=SingletonEx.get();
		SingletonEx s3=SingletonEx.get();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
