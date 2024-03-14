package encapsulation;

public class EncapGetSetTostringMtd 
{
  private int empno=1011;
  private String ename="Sayali";
  private float esal=50000.45f;
  
  
public int getEmpno() 
{
	return empno;
}
public void setEmpno(int empno) 
{
	this.empno = empno;
}
public String getEname() 
{
	return ename;
}
public void setEname(String ename) 
{
	this.ename = ename;
}
public float getEsal() 
{
	return esal;
}
public void setEsal(float esal)
{
	this.esal = esal;
}

  @Override
  public String toString() 
  {
	return "EncapGetSetTostringMtd [empno=" + empno + ", ename=" + ename + ", esal=" + esal + "]";
  }
  
  
  
  


}
