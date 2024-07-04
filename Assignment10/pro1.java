
 // Q1.WAP to create threads using Runnable interface and Thread class.
 

class Myclass1 extends Thread 
{ 
    public void run() 
	{
		System.out.println("current Thread is: "+Thread.currentThread().getName());
	}
} 
class Myclass2 implements Runnable 
{ 
    public void run() 
	{
		System.out.println("current Thread is: "+Thread.currentThread().getName());
	}
}
class pro1
{
	public static void main(String[]args) throws InterruptedException
	{
		Myclass1 obj1=new Myclass1();
		Myclass2 obj2=new Myclass2(); 
		 
		Thread t1=new Thread(obj1,"obj1"); // setting thread t on the object obj1 
		Thread t2=new Thread(obj2,"obj2");  
		
		t1.start(); 
		t1.join();
		t2.start();  
		t2.join();
		System.out.println("main() ends");
	}
}	