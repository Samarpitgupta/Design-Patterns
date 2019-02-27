package com30.decorator_design_pattern;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		super(c);
		
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Add some features of Luxury car");
}

}
