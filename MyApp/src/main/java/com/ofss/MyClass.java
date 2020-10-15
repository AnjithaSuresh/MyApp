package com.ofss;

public class MyClass {
	private String name;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "MyClass [name=" + name + ", location=" + location + "]";
	}
	public MyClass(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public MyClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
