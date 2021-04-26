package com.basics;
public class Threading {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.start();
		Child c=new Child();
		Thread t=new Thread(c);
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		t.start();
		t1.start();
		t2.start();
		
		System.out.println("Main completed..");
	}
}
class Parent extends Thread{
	@Override
	public void run() {
	for(int i=0;i<100;i++)
	{
		System.out.print(" "+i);
	}
	System.out.println();
	}
}
class Child implements Runnable{
	@Override
	public void run() {
		for(int i=100;i<200;i++)
		{
			System.out.print(" "+i);
		}
	}
}
