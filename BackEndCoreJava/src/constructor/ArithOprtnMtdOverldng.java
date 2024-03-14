package constructor;

public class ArithOprtnMtdOverldng 
{
    float squr;
    int cube;
    public void operator(float num)
    {
      squr=num*num;
      System.out.println("Number Of Square:"+squr);
    }
    public void operator(int no)
    {
    	cube=no*no*no;
    	System.out.println("Cube Of The Number Is:="+cube);
    }
	public static void main(String[] args) 
	{
		ArithOprtnMtdOverldng  a1=new ArithOprtnMtdOverldng();
		a1.operator(8.3f);
		a1.operator(4);

	}

}
