package kimdaeil.test01.kim0406;

public class Product {
	// 1.필드 변수 선언
	private String name;
	private int Price;
	// 2. 생성자 만들기 (+기본 생성자)
	public Product() {}
	
	


	public Product(String name, int Price) {
		this.name = name;
		this.Price = Price;
	}
	public String toString() {
		return "제품명: " + name + ", 가격 : " + Price + "원";
	}
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getProduct() {
		return Price;
	}
	
	
	public void setProduct(int product) {
		Price = Price;
	}
	
}
