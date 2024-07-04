/* Q3.WAP to create 2 threads set on the same object of class Mythread.One thread 
should print 1 to 10.Another should print 11 to 20.Achieve this result without synchronization.
*/ 
 
 class Mythread extends Thread
{  
     int x=1;
	public void run()
	{
		for(int i=1;i<=10;i++)
		{ 
	       System.out.println(Thread.currentThread().getName()+" x: "+x);
		   x++;
		}
	}
}  
class pro3 
{
	public static void main(String[]args) throws InterruptedException
	{
	 Mythread obj=new Mythread();  
	  
	 Thread t1=new Thread(obj,"obj1");  // two diff.threads sets on the same object
	 Thread t2=new Thread(obj,"obj2"); 
	  
	 t1.start(); 
	 t1.join();
	 t2.start(); 
	 t2.join();
	 System.out.println("main()ends");
	 
	}
}