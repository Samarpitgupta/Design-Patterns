package com32.visitor_design_pattern;

public class VisitorDesignPatternTest {

	
	public static void main(String args[])
	{
		ItemElement[] listItemElement=new ItemElement[] 
				{new Book(550,"PKS00110"),new Book(600,"PKS00111"),new Fruit(100,2,"Grapess")};
		
		int total=calculateCostOfItems(listItemElement);
		System.out.println("Total price of all Items: "+total);
		
	}
	public static int calculateCostOfItems(ItemElement[] listItems)
	{
		int sum=0;
		ShoppingCartVisitor cartVisitor=new ShoppingCartVisitorImplementation();
		
		for(ItemElement element: listItems)
		{
			sum=sum+element.accept(cartVisitor);
		}
		return sum;
	}
	
	
}
