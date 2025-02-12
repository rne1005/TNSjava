package com.tnsif.multithreading;
// imlplementing runnable interface


class Eclip implements Runnable{
	
	public void run() {
		for(int i=0;i<5;i++)
		System.out.println("Eclip "+ Thread.currentThread().getId());
	}
}

 class Flipkart implements Runnable{
	 public void run() {
		 System.out.println("Flipkart "+ Thread.currentThread().getId()); 
	 }
 }

public class Mainexample {
	public static void main(String[] args) {
		Eclip e=new Eclip();
		Thread obj=new Thread(e);
		obj.start();
		obj.setPriority(Thread.MAX_PRIORITY);
		
		Flipkart f=new Flipkart();
		Thread obj1=new Thread(f);
		obj1.start();
		obj1.setPriority(Thread.MIN_PRIORITY);
		for(int i=0;i<5;i++)
		System.out.println("mainmethod "+ Thread.currentThread().getId()); 
		
		
	}

}

