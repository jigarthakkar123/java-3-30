/*
 * Thread Priority : 
 * 
 * 1. MIN_PRIORITY : 1
 * 2. NORM_PRIORITY : 5
 * 3. MAX_PRIORITY : 10
 * 
 * - You can create thread by 2 ways.
 * 
 * 1. By Extending Thread class
 * 2. By Implementing Runnable interface
 * 
 * */

class NewThread implements Runnable
{
	Thread t;
	String tname;
	public NewThread(String tname) {
		this.tname=tname;
		t=new Thread(this,tname);
		t.start();
	}
	public void run() {
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(t+" : "+i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread Exiting");
	}
	
}

public class ThreadDemo {

	public static void main(String[] args) {
		new NewThread("One");
		new NewThread("Two");
		new NewThread("Three");
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("Main Thread");
		System.out.println(t);
		t.setPriority(3);
		System.out.println(t);
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(t+" : "+i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread Exiting");
	}
}
