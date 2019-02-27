package com31.composite_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeDirectory implements Employee{

	private List<Employee> empList=new ArrayList<Employee>();
			
	@Override
	public void showEmployee() {
		for(Employee emp:empList )
		{
			emp.showEmployee();
		}	
	}
	
	public void removeEmployee(Employee emp)
	{
		empList.remove(emp);
		
	}
	
	public void addEmployee(Employee emp)
	{
		empList.add(emp);
	}
	
}
