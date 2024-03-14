package constructor;

public class ShapeArea 
{
	float area;
	
	public void calarea(float r)//2 parameters
	{
		area=3.14f*r*r;
		System.out.println("Area Of Circle:="+area);
	}
	public void calarea(float len,float bred)//3 parameters
	{
		area=len*bred;
		System.out.println("Area Of Rectangle:="+area);
	}

	public static void main(String[] args) 
	{
		ShapeArea  s1=new ShapeArea();
		s1.calarea(5.2f);
		s1.calarea(4, 5.4f);
	}

}
