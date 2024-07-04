/* Q6.Create 2 threads set on different objects.One thread will generate 5 even values whereas
another will generate 5 odd values.Try to achieve distinct output using isAlive().*/ 
 
  
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
				 if(num%2!=0) 
				 { 
			       System.out.println(Thread.currentThread().getName()+" num: "+num);
				    i++;
				 }  
				 
		   }
	 }
	 
} 
 
 class pro6
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
				 if(num%2==0) 
				 { 
			       System.out.println(Thread.currentThread().getName()+" num: "+num);
				  r++;
				  }  
				 
		   }
		}
	 }; 
	 
	 Thread t1=new Thread(obj1,"T1");  // two diff.threads sets on the same object
	 Thread t2=new Thread(obj2,"T2");   
	  
	  t1.start(); 
	  while(t1.isAlive() ) 
	  { 
         
	  }
	  t2.start();  
	  while(t2.isAlive() ) 
	  { 
         
	  }
	  System.out.println("main()ends");
	 
	}
}