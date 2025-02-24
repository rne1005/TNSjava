package com.tnsif.lambdaexpression;

import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(2);
		a.add(5);
		a.add(7);
		a.add(8);
		
		// traverse to the list
		
		a.forEach(list->System.out.println(list));


	}

}
