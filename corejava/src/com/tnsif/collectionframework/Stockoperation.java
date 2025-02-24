package com.tnsif.collectionframework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Stockoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> ob=new HashSet<Integer>();
		ob.add(45);
		ob.add(15);
		ob.add(25);
		ob.add(28);
		System.out.println(ob);
		ob.addAll(Arrays.asList(new Integer[] {1,5,6}));
		System.out.println(ob);
		System.out.println(ob.size());
        Set<Integer> oddset=new HashSet<Integer>();
        oddset.addAll(Arrays.asList(new Integer[] {3,5,9}));
        
        System.out.println("odd set "+oddset);
        
        Set<Integer> intersection=new HashSet<>(ob);
        
        intersection.retainAll(oddset);
        
        System.out.println(intersection);
	}

}
