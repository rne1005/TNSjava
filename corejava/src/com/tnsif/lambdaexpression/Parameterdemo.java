package com.tnsif.lambdaexpression;

public class Parameterdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cube t=(a)->{return(a*a*a);};
		System.out.println("cube of a number "+t.calculate(2));
	}
}
