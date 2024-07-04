/* Q9.WAP to understand the meaning of prioriity of thread.(Read the notebook).*/ 
class Myclass extends Thread
{
	volatile boolean value=true;
	public void run()
	{ 
	  long x=0;
	  while(value)
	  { 
          x++;
	  } 
	  System.out.println(Thread.currentThread().getName()+" = "+x);
	} 
} 
class pro9 
{
	public static void main(String[]args) 
	{
		Myclass obj1=new Myclass(); 
		Myclass obj2=new Myclass();
		
		Thread t1=new Thread(obj1,"T1");
		Thread t2=new Thread(obj2,"T2");
		 
		t1.setPriority(1);
		t2.setPriority(10);  
		
		t1.start(); 
		t2.start();  
		  
		  try
		  {
		Thread.sleep(100); 
		  } 
		  catch(InterruptedException ie) 
		  { 
		    System.out.println("caught");
		  }
		obj1.value=false;
		obj2.value=false;
	}
}