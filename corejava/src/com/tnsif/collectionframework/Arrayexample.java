package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

// arraylist 

public class Arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ArrayList<String> al=new ArrayList<String>();
		   al.add("apple");
			al.add("mango");
			al.add("orange");
			al.add("orange");
			
			Iterator itr=al.iterator();
			while(itr.hasNext()) { 
			// check the element is present or not
			
			System.out.println(itr.next()); 
			// print and move next
				
			}

	}

}
