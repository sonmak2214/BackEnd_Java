package stringProgs;

public class StringSortEx 
{
	public static void main(String[] args) 
	{
	 String s[]= {"Shradhha","Ashwini","Omkar","Sujit","Saurabh","Syali","Tejaswini","Priti"};
	 
         for(int i=0;i<s.length;i++)
         {
        	 for(int j=i+1;j<s.length;j++)
        	 {
        		 if(s[i].compareTo(s[j])>0)
        		 {
        			 String temp=s[i];
        			 s[i]=s[j];
        			 s[j]=temp;
        		 }
        	 }
         }
         for(int i=0;i<s.length;i++)
         {
        	 System.out.println(s[i]);
         }
	}

}
