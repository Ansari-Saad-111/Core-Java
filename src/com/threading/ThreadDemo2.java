package com.threading;

class Thread1 extends Thread
{
	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
			System.out.println("Thread1 "+i);
			try {
				sleep(1000);
			} 
			catch (Exception e) 
			{
			}
		}
	}
}
class Thread2 extends Thread
{
	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
			System.out.println("Thread2 "+i);
			if(i==5) {
				//stop();
			}
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();

	}

}
