package inheritance;
class Doctor
{
	public void display()
	{
		System.out.println("This Is Doctor class,Doctor save the life of their patients..");
	}
}
class Patient extends Doctor
{
	public void display()
	{
		super.display();//mtd overriding happend here with super keyword..
		System.out.println("Patients need doctor when they have illness..");
	}
}
public class MtdOverrdngDemo 
{

	public static void main(String[] args) 
	{
        Patient p1=new Patient();
        p1.display();
        		

	}

}
