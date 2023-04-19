package ch10_Extends_in.ramen;

public class RamenMain {

	public static void main(String[] args) {
	
	// 추상메소드를 가지는 추상 클래스는
	// 객체로 소환할 수 없다.
//	Ramen antRamen = new Ramen("신라면", 1200);
	
	Jinramen jin = new Jinramen("진라면", 800);
	jin.printRecipe();
	
	Jiappagheti jja = new Jiappagheti("짜파케티", 1200);
	jja.printRecipe();
	
	
	
	
	}
}
