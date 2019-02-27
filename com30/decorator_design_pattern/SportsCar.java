package com30.decorator_design_pattern;

public class SportsCar extends CarDecorator{

	public SportsCar(Car c) 
	{
		super(c);
	}

	@Override
	public void assemble() {
			super.assemble();
			System.out.println("Add some features of sports car");
	}
}
