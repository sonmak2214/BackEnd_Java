package commandlineprog;

public class FactorialNoEx 
{

	public static void main(String[] args) //It's String array arguments
	{
		int no=Integer.parseInt(args[0]);//method used cause convet Sting array
		 int fact=1;                       //args into Integer arguments 
		                                
         while(no>=1)  //6*5*4*3*2*1------6!
         {
        	 fact=fact*no;
        	 no--;//no=no-1
         }
         System.out.println("Factorial Of That Number:"+fact);
	}

}
