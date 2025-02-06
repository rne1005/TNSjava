package com.tnsif.abstractiondemo;

public abstract class shape {
	
	protected float area;
	
	//abstract method
	abstract void calarea();
	
	//concrete method
	void show() {
		System.out.println("area of shape "+area);
	}

	@Override
	public String toString() {
		return "shape [area=" + area + "]";
	}
	
}
