// Q7.Repeat Q6 to achieve distinct output using synchronization. 
class Mythread extends Thread
{  
   
	 synchronized public void run()
	 { 
		   int i1=0; 
		   int i2=0;
		   while(true) 
		   { 
	             if(Thread.currentThread().getName().equals("T1"))
				 { 
			       if(i1==5) 
				   { 
			          break;
				   } 
				   else
				   { 
				     int num=(int)(Math.random()*100); 
				     if(num%2!=0) 
					{ 
					System.out.println(Thread.currentThread().getName()+" num: "+num);
				    i1++;
					}  
				   }
				 } 
				 else if(Thread.currentThread().getName().equals("T2")) 
				 { 
			        if(i2==5) 
					{  
				       break;
				     }
					 else
					 { 
				        int num=(int)(Math.random()*100); 
						if(num%2==0) 
						{ 
						System.out.println(Thread.currentThread().getName()+" num: "+num);
						i2++;
						} 
					 }
				 }
				 
				 
		   }
	 }
	 
} 
 
 class pro7
{
	public static void main(String[]args) throws InterruptedException
	{
	 Mythread obj=new Mythread();   
	 Thread t1=new Thread(obj,"T1");  // two diff.threads sets on the same object
	 Thread t2=new Thread(obj,"T2");   
	  
	  t1.start(); 
	  t2.start();  
	  
	  System.out.println("main()ends");
	 
	}
}