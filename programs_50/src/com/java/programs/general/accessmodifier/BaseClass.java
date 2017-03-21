package com.java.programs.general.accessmodifier;

public class BaseClass {
	
	public int id = 10;
	private String name;
	protected long ph = 759392888;
	int a = 10; 	//Implicit Default Access Modifier
	
	// getters and setters
	
	public int getId() {
	
		return id;
	}
	public void setId(int id) {
		
		this.id = id;
	}
	
	private String getName() {
		
		return name;
	}
	private void setName(String n) {
		
		this.name = n;
	}
	protected long getPh() {
		
		return ph;
	}
	protected void setPh(long ph) {
		
		this.ph = ph;
	}
	int getA() {
		
		return a;
	}
	void setA(int a) {
		
		this.a = a;
	}
	
}
