package com.singleton_design_pattern;


class Singleton {
	
	private Singleton() {}

	public static Singleton single;

	public static synchronized Singleton getSingleton() {
		if (single == null) {
			
			single = new Singleton();
		}

		return single;
	}
}

public class MainSingleton {

	public static void main(String[] args) {
		
		//Thread t=new Thread();	
		
		// Singleton single1=new Singleton();
		Singleton.getSingleton();
		System.out.println(Singleton.getSingleton());
		Singleton.getSingleton();
		System.out.println(Singleton.getSingleton());
	}

}
