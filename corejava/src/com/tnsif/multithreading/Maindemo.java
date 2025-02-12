package com.tnsif.multithreading;

import com.tnsif.interfacedemo.Eclipse;

public class Maindemo {

	public static void main(String[] args) {
		
		Eclipse e=new Eclipse();
		e.start();
		
		Notepad n=new Notepad();
		n.start();
		
		Chrome c=new Chrome();
		c.start();
		
		System.out.println("mainmethod "+Thread.currentThread().getId());
		

	}

}

