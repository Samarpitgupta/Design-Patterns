package com32.visitor_design_pattern;

public class ShoppingCartVisitorImplementation implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {
		int price = 0;

		if (book.getPrice() > 500) {
			price = book.getPrice() - 50;
		} else {
			price = book.getPrice();
		}
		System.out.println("Book ISBN Number: " + book.getIsbnNumber() + "      Price: " + price);
		return price;
	}

	@Override
	public int visit(Fruit fruit) {
		int price = 0;

		price = fruit.getPricePerKg() * fruit.getWeight();
		return price;
	}
}
