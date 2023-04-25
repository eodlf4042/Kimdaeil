package ch09_class.Coffee;

import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
	String name;
	ArrayList<Coffee> menuLits = new ArrayList<Coffee>();
	
	public Cafe() {
	}
	public Cafe(String name) {
		this.name = name;
	}
	
	public Cafe(String name, ArrayList<Coffee> menuLits) {
		super();
		this.name = name;
		this.menuLits = menuLits;
	}
	// 커피 메뉴를 추가한다.
	public  void addCafe(Coffee cf) {
		menuLits.add(cf);
		}
	// 메뉴판을 출력하는 메소드
	public void shoowMenu() {
		for(int i = 0; i < menuLits.size(); i++) {
			System.out.println((i+1) + ". " +  menuLits.get(i));
		}
	}
	
	// 커피구매
	public void buyCoffee(Scanner sc ) {
		
		System.out.println("메뉴를 선택해주세요 :");
		int choice = Integer.parseInt(sc.nextLine());
		
		System.out.println(menuLits.get(choice-1).getName() + "를"+
				menuLits.get(choice-1).getPrice() + "원에 구매했습니다.");
	}
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Cafe [name=" + name + ", menuLits=" + menuLits + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Coffee> getMenuLits() {
		return menuLits;
	}
	public void setMenuLits(ArrayList<Coffee> menuLits) {
		this.menuLits = menuLits;
	}

}
