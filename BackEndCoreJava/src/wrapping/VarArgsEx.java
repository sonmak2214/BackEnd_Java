package wrapping;

public class VarArgsEx 
{
  int sum=0;
  
  public void addition(int...n1)
  {
	  for(int x1:n1)
	  {
		  sum=sum+x1;
	  }
	  System.out.println("Sum of elements are:="+sum);
  }
	public static void main(String[] args) 
	{
		VarArgsEx  v1=new VarArgsEx(); 
		v1.addition(10,11);
		v1.addition(10,20,30,40,50,7777777);
		v1.addition(7,3,8,9,1,3,5,66,33,100);
		v1.addition();
	}

}
