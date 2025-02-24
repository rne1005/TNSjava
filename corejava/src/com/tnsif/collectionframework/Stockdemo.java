package com.tnsif.collectionframework;

import java.util.Stack;

public class Stockdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<Integer> ob=new Stack<Integer> ();
        ob.push(2);
        ob.push(4);
        ob.push(5);
        ob.push(3);
        
        System.out.println("Stack elements"+ob);
        
        System.out.println(ob.peek());
        if(ob.isEmpty()) {
        	System.out.println("stack is empty");
        }
        else {
        	   System.out.println("not empty");
        }
        
        System.out.println(ob.search(7));
	}

}
