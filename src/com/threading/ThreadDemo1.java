package com.threading;

class A extends Thread
{
	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
		}
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		A a1=new A();
		A a2=new A();
		a1.start();
		a2.start();

	}

}
