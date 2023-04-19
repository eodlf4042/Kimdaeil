package ch09_class.Coffee;

import java.util.ArrayList;
import java.util.Scanner;

public class CofeeMain {

	public static void main(String[] args) {
		Cafe starBucks = new Cafe("스타벅스");
		starBucks.addCafe(new Coffee("아메리카노", 5000));
		starBucks.addCafe(new Coffee("카푸치노", 6000));
		starBucks.addCafe(new Coffee("오곡라떼", 7000));
		
		Cafe conte = new Cafe("꽁떼");
		conte.addCafe(new Coffee("아메리카노", 2500));
		conte.addCafe(new Coffee("바닐라라떼", 3000));
		conte.addCafe(new Coffee("아이스티", 3500));
		
	
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 스타벅스 방문 | 2. 꽁뗴 방문 | 3.사무실복귀...");
			System.out.print(">>>>>>>>");
			int seltect = Integer.parseInt(sc.nextLine());
			
			if(seltect == 1) {
				System.out.println("어서오세요 스벅입니다.");
				starBucks.shoowMenu();
				starBucks.buyCoffee(sc);
			}	
			else if(seltect == 2) {
				System.out.println("어서오세요 꽁떄입니다..");
				conte.shoowMenu();
				conte.buyCoffee(sc);
				
			}else if(seltect == 3) {
				System.out.println("종료합니다.");
			}
			break;
			
		}
		

				
	}

}
