package com31.composite_design_pattern;

public class Developer implements Employee
{
	private String name;
	private long empId;
	private String position;
	
	public Developer(String name,long empId, String position)
	{
		this.empId=empId;
		this.name=name;
		this.position=position;
	}
	
	@Override
	public void showEmployee() {
		System.out.println("Employee Name:  "+name+"			Employee ID: "+empId);
	} 

}
