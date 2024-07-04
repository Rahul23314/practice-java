/* Q8.Create 3 threads.Two of them will generate even numbers only.
Only one thread will generate odd numbers.(anonymous inner class)  */
 
   
class Mythread extends Thread
{  
   
public void run()
	 { 
		   int i=0;
		   while(true) 
		   { 
	             if(i==5) 
				 { 
			       break;
				 }
				 int num=(int)(Math.random()*100); 
				 if(num%2==0) 
				 { 
			       System.out.println(Thread.currentThread().getName()+" num: "+num);
				    i++;
				 }  
				 
		   }
	 }
	 
} 
 
 class pro8
{
	public static void main(String[]args) throws InterruptedException
	{
	 Mythread obj1=new Mythread();   
	 
	 Mythread obj2=new Mythread() 
	 { 
	    public void run() 
		{ 
		   int r=0;
		   while(true) 
		   { 
	             if(r==5) 
				 { 
			       break;
				 }
				 int num=(int)(Math.random()*100); 
				 if(num%2!=0) 
				 { 
			       System.out.println(Thread.currentThread().getName()+" num: "+num);
				  r++;
				  }  
				 
		   }
		}
	 };  
	 Mythread obj3=new Mythread();  
	 
	 Thread t1=new Thread(obj1,"T1");  // two diff.threads sets on the same object
	 Thread t2=new Thread(obj2,"T2");   
	  Thread t3=new Thread(obj3,"T3"); 
	  t1.start();  
	  t1.join();
	  t3.start();  
	  t3.join();
     t2.start();  	  
	  t2.join();
	  System.out.println("main()ends");
	 
	}
}