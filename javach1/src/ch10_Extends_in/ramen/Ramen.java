package ch10_Extends_in.ramen;

public abstract class Ramen {
	String name;
	int price;
	
	public Ramen(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public abstract void printRecipe();
	
	
	
	
	
}
