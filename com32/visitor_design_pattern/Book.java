package com32.visitor_design_pattern;

public class Book implements ItemElement{

	private int price;
	private String isbnNumber;
	
	public Book(int price, String isbnNumber)
	{
		this.price=price;
		this.isbnNumber=isbnNumber;
	}
	
	@Override
	public int accept(ShoppingCartVisitor cartVisitor) {		
		return cartVisitor.visit(this) ;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}
	
	

}
