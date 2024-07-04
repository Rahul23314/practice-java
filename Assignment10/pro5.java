/* Q5.Create 2 threads set on same objects of class Mythread.Execute show() method using these 2 
threads on same calling object.One thread will print 1 to 10 values.Other will print 11 to 20.
show() and run() belong to Mythread.Try to achieve distinct output without synchroniation and
with synchronization.(Write different programs.We need more and more practice).*/ 
 
class Mythread extends Thread
{  
     int x=1; 
	 Mythread ref; 
	 Mythread () 
	 { 
	   
	 } 
	 Mythread(Mythread obj)
	 { 
	    ref=obj;
	 }
	 public void run()
	{ 
	     ref.show();
	} 
	 
	public void show()
	{ 
	     for(int i=1;i<=10;i++)
		{ 
	       System.out.println(Thread.currentThread().getName()+" x: "+x);
		   x++;
		}
	}
}  
class pro5
{
	public static void main(String[]args) throws InterruptedException
	{
	 Mythread obj=new Mythread();  
	 Mythread obj2=new Mythread(obj); 
	 
	 Thread t1=new Thread(obj2,"T1");  // two diff.threads sets on the same object
	 Thread t2=new Thread(obj2,"T2"); 
	  
	 t1.start();  
	 t1.join();
	 t2.start(); 
	 t2.join();
	 System.out.println("main()ends");
	 
	}
}