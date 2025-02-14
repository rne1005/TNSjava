package com.tnsif.stringdemo;

public class Testimmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sachin"; // literals
		s.concat("tendulkar");
		
		System.out.println(s);
		s=s.concat("tendulkar");
		System.out.println(s);

	}

}
