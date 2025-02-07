package com.tnsif.exceptionhandling;

public class withexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int d=0;
		try {
			   int a=5/0;
		}
		catch(ArithmeticException e) {
			System.out.println("exception caught "+e);
			System.out.println("hello");
		}
	}

}
