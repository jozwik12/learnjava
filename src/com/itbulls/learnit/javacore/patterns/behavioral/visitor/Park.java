package com.itbulls.learnit.javacore.patterns.behavioral.visitor;

public class Park implements GeoElement {
	
	private double x;
	private double y;
	private String address;
	
	private String name;
	private int numberOfTrees;
	private int numberOfBenches;
	
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfTrees() {
		return numberOfTrees;
	}
	public void setNumberOfTrees(int numberOfTrees) {
		this.numberOfTrees = numberOfTrees;
	}
	public int getNumberOfBenches() {
		return numberOfBenches;
	}
	public void setNumberOfBenches(int numberOfBenches) {
		this.numberOfBenches = numberOfBenches;
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.doForPark(this);
	}
	
}
