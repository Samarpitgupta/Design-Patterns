package com.abstract_factory_design_pattern;

public class ColorFactory extends AbstractFactory{

	@Override
	public Color getColor(String color) {
		if(color==null)
		{			
			return null;
		}
		if(color.equalsIgnoreCase("RED"))			
		{
			return new Red();
		}
		else if(color.equalsIgnoreCase("BLUE"))
		{
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		
		return null;
	}

}
