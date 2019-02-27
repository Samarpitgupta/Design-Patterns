package com32.visitor_design_pattern;

import java.security.cert.CertPathValidatorSpi;

public class Fruit implements ItemElement{

	private int pricePerKg;
	private int weight;
	private String name;
	
	public Fruit(int pricePerKg,int weight, String name)
	{
		this.pricePerKg=pricePerKg;
		this.weight=weight;
		this.name=name;
	}
	
	@Override
	public int accept(ShoppingCartVisitor cartVisitor) {
		return cartVisitor.visit(this);
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	public int getWeight() {
		return weight;
	}

	
}
