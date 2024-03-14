package abstraction;
interface Taxable1
{
	int trate1=10;
	public void tax();//declair--abstract mtd by default--empty
}
class Publication implements Taxable1
{
	String pname;
	public Publication(String pname)
	{
		this.pname=pname;
	}
	@Override
	public void tax()
	{
		System.out.println("Publication Name Is:="+pname);
		
	}
}
class BookCls extends Publication implements Taxable1
{
  int price;
	public BookCls(String pname,int price)
	{
		super(pname);
		this.price=price;
		
	}
	@Override
	public void tax() 
	{
		super.tax();//overriding is happend here..
		System.out.println("Before applying tax of book price:"+price);
		price=price+price*trate1/100;
		System.out.println("After applying tax of book price:"+price);
		
	}
	
	
}
public class InterPubBookEx 
{

	public static void main(String[] args) 
	{
		BookCls b1=new BookCls("Classmate",100);//automatically call constructor
		b1.tax();

	}

}
