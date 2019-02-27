package com30.decorator_design_pattern;

public class CarDecorator implements Car{

	protected Car car;
	
	@Override
	public void assemble() {
			this.car.assemble();
	}
	public CarDecorator(Car car)
	{
		this.car=car;
	}	
	
	
}
