package kimdaeil.kimdaeil0414;

import java.util.Scanner;

public class Kimdaeil {

	public static void main(String[] args) {
	boolean flag = true;
		
		
		String cusName = null; // 예약자 성명
		int stGubun = 0; // 좌석타입
		int stNum = 0; //
		
		Movie ss = new Movie (cusName, stGubun, stNum);
		
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			
			System.out.println();
			System.out.println("          대일영화관 예약시스템입니다.");
			ss.searchSeat();
			System.out.println();
			System.out.println();
			System.out.println("원하는 서비스의 번호를 입력하세요.| 1.예약 | 2.취소 | 3.끝내기 |"); 
			System.out.print(">>>>> ");
			int service_num = sc.nextInt();
			switch(service_num) {
			case 1: 
				
				ss.bookSeat();
				System.out.println("예약을 했습니다.");
				break;
			case 2: 
				ss.canSeat();
				break;
			case 3: 
				System.out.println("시스템이 종료됩니다.");
				flag = false;
				break;
				
			}
		}
	}
}

class Movie{
	String cusName; // 예약자 성명
	int stGubun; // 좌석등급
	int stNum; // 좌석번호
	String[][] seats = new String[11][10]; // 좌석구분 
	String[] list = {"A","B","C","D","E","F","G","H","I","J","K"};
	
	public Movie (String cusName, int stGubun, int stNum) {
		this.cusName = cusName;
		this.stGubun = stGubun;
		this.stNum = stNum;
		
		for(int i = 0 ; i < 11 ; i++) {
			for(int j = 0; j < 10 ; j++) {
				seats[i][j] = "__";
			}
		}
	}
	
	public void bookSeat() { // 좌석예약
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------좌석 예약--------------");
		
		System.out.print("성명 :");
		String cusName = sc.next();
		while(true) {
			System.out.println("원하시는 좌석등급을 선택하세요. A석 = 1/B석 = 2/C석 =3/.... (숫자로 입력해주세요)");
			System.out.print("좌석등급 :");
			int stGubun = sc.nextInt() - 1;
			System.out.println("원하시는 좌석번호을 선택하세요. 1~10번");
			System.out.print("좌석번호 :");
			int stNum = sc.nextInt() - 1 ;
         	seats[stGubun][stNum] = (cusName);
         	
         	break;
		}
		System.out.println();
	}
	
	public void searchSeat() { // 좌석 출력
	
		System.out.println("===============screen=================");
		for (int i = 0; i < 11; i++) {
            System.out.print("\n" + list[i]  + "석 ");
            for (int j = 0; j < 10; j++) {
                System.out.print(" "+ seats[i][j]);
            }
        }
	}
	
	public void canSeat() { // 좌석취소
	
			Scanner sc = new Scanner(System.in);
			System.out.println("-------------예약취소--------------");
			System.out.println("===============스크린==============");
			System.out.print("예약자 성명:");
				String canName = sc.next();
				for (int i = 0; i < 11; i++) {
					for (int j = 0; j < 10; j++) {
						if(canName.equals(seats[i][j])) {
							seats[i][j] = "__";
							System.out.println("예약이 취소 되었습니다.");
							break;
					}
				}
			}

	}

}
