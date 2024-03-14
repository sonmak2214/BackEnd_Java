package inheritance;
class AddSub
{
	int a,b,c;
	public void add()
	{
		a=10;b=20;
		c=a+b;
		System.out.println("Addition of number is:="+c);
	}
	public void sub()
	{
		a=30;b=25;
		c=a-b;
		System.out.println("Substraction of number is:="+c);
	}
}
class MultDiv extends AddSub
{
	int p,q,r;
	public void mult()
	{
		p=40;q=10;
		r=p*q;
		System.out.println("Multiplication of number is:="+r);
	}
	public void div()
	{
		p=22;q=5;
		r=p/q;
		System.out.println("Division of number is:="+r);
	}
}
class Modulus extends MultDiv
{
	int u,v,w;
	public void mod()
	{
		u=100;v=20;
		w=u%v;
	 System.out.println("Modulus Of That Number Is:="+w);
	}
	
}
public class MultLevInhe 
{
 
	public static void main(String[] args) 
	{
		Modulus m1=new Modulus();
		m1.add();
		m1.sub();
		m1.mult();
		m1.div();
		m1.mod();

	}

}
