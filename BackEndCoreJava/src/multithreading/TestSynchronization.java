package multithreading;
class MyThread2 extends Thread
{
	 InterThreadCommun t;
	 MyThread2(InterThreadCommun t)
	 {
		 this.t=t;
	 }
	 public void run()
	 {
		 t.printtable(20);
	 }
}
public class TestSynchronization 
{

	public static void main(String[] args) 
	{
		InterThreadCommun i1=new InterThreadCommun();//only one object created
		
		  MyThread1 tt=new MyThread1(i1);
		  tt.start();
		  MyThread2 ttt=new MyThread2(i1);
		  ttt.start();
	}

}
