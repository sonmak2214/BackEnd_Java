package encapsulation;

public class DistanceObjParToMtd 
{
  int m,cm;//declairation
  
  
  public DistanceObjParToMtd()
  {
	  System.out.println("This Is Programm Of Object Passing As Parameter to Method");
  }
  public DistanceObjParToMtd(int a,int b)
  {
	  m=a;
	  cm=b;
  }
  @Override
public String toString() 
  {
	return "DistanceObjParToMtd [m=" + m + ", cm=" + cm + "]";
  }
  
  public  DistanceObjParToMtd addition( DistanceObjParToMtd d2)//pass object as parameter
  {
	  DistanceObjParToMtd d3=new  DistanceObjParToMtd();
	  d3.m=this.m+d2.m;
	  d3.cm=this.cm+d2.cm;
	//100 cm=1 meter.  
	  if(d3.cm>=100)
	  {
		  d3.m++;
		  d3.cm=99;
	  }
	  
	  return d3; 
	  
  }
	public static void main(String[] args) 
	{
		 DistanceObjParToMtd  d1=new  DistanceObjParToMtd(); 
		 DistanceObjParToMtd  d2=new  DistanceObjParToMtd(5,50);
		 DistanceObjParToMtd  d3=new  DistanceObjParToMtd(6,60);
		 System.out.println(d3.addition(d2));

	}

}
