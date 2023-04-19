package ch10_Extends_in.ramen;

public class Jiappagheti extends Ramen{
	
	
	
	public Jiappagheti(String name, int price) {
		super(name, price);
	}
	
	
	@Override
	public void printRecipe() {
		System.out.println("끓는 물에 면과 삶은 후 물은 버리고 스프를 넣고 잘 져어 드세요");
	}
	
}
