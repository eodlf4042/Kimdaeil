package ch09_class.Coffee;

public class Coffee {
	private String name;
	private int price;
	
	
	
	
	
	public Coffee() {}
	
	public Coffee( String name , int Price) {
		this.name = name;
		this.price = Price;
	}
	
	public String toString() {
		return "제품명: " + name + ", 가격 : " + price + "원";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
