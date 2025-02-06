package com.tnsif.interfacedemo;

public class  Demointerface implements Childinterface,Interfaceone {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
		
	}

	public static void main(String[] args) {
		Demointerface d=new Demointerface();
		d.show();
		d.print();
	}
}
