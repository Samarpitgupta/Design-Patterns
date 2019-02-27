package com31.composite_design_pattern;

public class CompositeDesignPatternTest {

	public static void main(String args[])
	{
		
		Employee dev1=new Developer("Samarpit",101,"Intern");
		Employee dev2=new Developer("Likhith", 102, "Intern");
		Employee dev3=new Developer("Nithin", 103, "Intern");
		Employee dev4=new Developer("Karishma", 104, "Intern");
		
		Employee mgr1=new Manager("JNSH",200,"NXT Director");
		
		CompositeDirectory cdir=new CompositeDirectory();
		cdir.addEmployee(dev1);
		cdir.addEmployee(dev2);
		cdir.addEmployee(dev3);
		cdir.addEmployee(dev4);
		
		cdir.addEmployee(mgr1);
		
		cdir.showEmployee();
		
		cdir.removeEmployee(dev4);
		System.out.println("After removing\nList is: ");
		cdir.showEmployee();
	}
	
}
