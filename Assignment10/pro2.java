class Mythread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{ 
	      System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
} 
class pro2
{
	public static void main(String[]args) throws InterruptedException
	{
	 Mythread obj1=new Mythread();  
	 Mythread obj2=new Mythread();  
	  
	 Thread t1=new Thread(obj1,"obj1");
	 Thread t2=new Thread(obj2,"obj2"); 
	  
	  t1.start();   
	  t1.join();
	  /*try
	  {
	  Thread.sleep(2000); 
	  } 
	  catch(InterruptedException ie)
	  { 
	     System.out.println("caught "+ie);
	  } 
	  while(t1.isAlive()) 
	  {
		  
	  }
	  
	    
	  try
	  {
	  Thread.sleep(200); 
	  } 
	  catch(InterruptedException ie)
	  { 
	     System.out.println("caught "+ie);
	  } 
	  while(t2.isAlive()) 
	  {
		  
	  } 
	  */
	   t2.start();  
	   t2.join();
	  System.out.println("main()ends");
	  
	 
	}
}
		