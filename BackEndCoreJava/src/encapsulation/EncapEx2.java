package encapsulation;

public class EncapEx2 
{
  private int age;
  private String add;
  private float mrks;
  
public int getAge() 
{
	return age;
}
public void setAge(int age) 
{
	if(age>18)
	{
		System.out.println("Valid Age");
		this.age = age;
}
}
public String getAdd() 
{
	return add;
}
public void setAdd(String add) 
{
	this.add = add;
}
public float getMrks() 
{
	return mrks;
}
public void setMrks(float mrks) 
{
	this.mrks = mrks;
}  
}
