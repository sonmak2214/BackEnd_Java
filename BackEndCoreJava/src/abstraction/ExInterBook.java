package abstraction;
interface Taxable
{
	int trate=20;//static,final
	public void caltax();//abstract mtd means emply--declaire

}
public class ExInterBook implements Taxable
{
    int bprice;
    public ExInterBook(int p)
    {
    	bprice=p;
    }
	@Override
	public void caltax()
	{
		System.out.println("Before Applying Tax Of Book Price:="+bprice);
		bprice=bprice+bprice*trate/100;
		System.out.println("Afer Applying Tax Of Book Price:="+bprice);
	}
    
    public static void main(String[] args) 
	{
    	ExInterBook e1=new ExInterBook(80);
    	e1.caltax();

	}

}
