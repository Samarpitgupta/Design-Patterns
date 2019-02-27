package com30.decorator_design_pattern;

public class DecoratorDesignPatternTest 
{
	public static void main(String args[])
	{
		Car luxuryCar=new LuxuryCar(new SimpleCar());
		luxuryCar.assemble();
		System.out.println();
		Car c1=new SportsCar(new LuxuryCar(new SimpleCar()));
		c1.assemble();
		System.out.println();
		Car f1car=new SportsCar(new LuxuryCar(new F1Car(new SimpleCar())));
		f1car.assemble();
	}
}
