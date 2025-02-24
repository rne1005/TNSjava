package com.tnsif.collectionframework;

import java.util.ArrayList;

public class Arraylist {
	
// demo for array list

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer> ();
		
		al.add(8);
		al.add(8);
		al.add(9);
		al.add(7);
		
		System.out.println(" size "+al.size());
		System.out.println(al);
		
		// check the elements
		
		System.out.println(al.contains(2));
		
		// check the list is empty or not
		System.out.println(al.isEmpty());
		
		// remove the element
		
		System.out.println(al.remove(0));
		System.out.println(al);

	}

}
