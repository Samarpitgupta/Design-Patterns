package com32.visitor_design_pattern;

public interface ItemElement {

	public int accept(ShoppingCartVisitor cartVisitor);
	
}
