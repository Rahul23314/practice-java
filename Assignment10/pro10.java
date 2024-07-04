/* Q10.WAP to check the following states of threads.
(Write different programs if can't explain them in one.)
-NEW = when thread is just created and not started
-RUNNABLE = when thread is executing some code
-TIMED_WAITING = when thread is sleeping
-TERMINATED = when thread has completed run() method execution
-BLOCKED = waiting to get ownership of mutex
*/ 

class Mythread extends Thread
{  
  Mythread ref; 
  Mythread() 
  { 
    
  }  
  Mythread(Mythread obj) 
  { 
      ref=obj;
  }
  
  synchronized  public void run()
  { 
    for(int i=1;i<=10;i++) 
	{ 
       System.out.printl
	} 
	 
  }
} 
class pro10 
{ 
  public static void main(Strin[]args) 
  {  
    Mythread obj=new Mythread();
   
	
	Thread t1=new Thread(obj);
	Thread t2=new Thread(obj);  
	 
	System
	
 	
	
  }
}