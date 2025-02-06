package com.tnsif.abstractiondemo;

public class Square extends shape{
	
	private float side;
	
	// const
	public Square() {
		    side=2.0f;
	}
	public Square(float side) {
		    this.side=side;
	}
	@Override
	void calarea() {
		// TODO Auto-generated method stub
		super.area=side*side;
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
	public static void main(String[] args) {
		Square s=new Square();
		System.out.println(s);
		s.calarea();
		s.show();
	}
	
}
