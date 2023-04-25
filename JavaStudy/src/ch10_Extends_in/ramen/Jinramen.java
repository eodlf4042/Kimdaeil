package ch10_Extends_in.ramen;

public class Jinramen extends Ramen{

	public Jinramen(String name, int price) {
		super(name, price);
	}
	
	@Override
	public void printRecipe() {
		System.out.println("끓는 물에 면과 스프를 넣고, 3분 후에 잘 져어 드세요!");
	}
	
	
}
