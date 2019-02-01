package com.strategy_design_pattern;

public class ShoppingCartClient {

	public static void main(String args[])
	{
		ShoppingCart cart=new ShoppingCart();
		
		Item i1=new Item(101,1000);
		Item i2=new Item(102,2000);
		Item i3=new Item(105,15000);
		
		cart.addItem(i1);
		cart.addItem(i2);
		cart.addItem(i3);
		
		cart.pay(new PayPalStrategy("samar@tarento.com", 561858));
		cart.pay(new CreditCardStrategy(1525, "Samarpit", 251, 6965 ));
	}
}
