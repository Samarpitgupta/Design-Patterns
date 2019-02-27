package com30.decorator_design_pattern;

public class F1Car extends CarDecorator {

	public F1Car(Car car) {
		super(car);
	}
	
	@Override
	public void assemble()
	{
		super.assemble();
		System.out.println("F1 car is assembling");
	}

}
