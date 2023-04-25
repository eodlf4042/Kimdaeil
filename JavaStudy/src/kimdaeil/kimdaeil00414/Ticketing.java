package kimdaeil.kimdaeil00414;

import java.util.Scanner;



public class Ticketing {
	
	//이중배열
	String[][] seats = new String[11][10];
	String[] list = {"A","B","C","D","E","F","G","H","I","J","K"};


	public Ticketing () {//좌석만들기
		
	
		
		for(int i = 0 ; i < 11 ; i++) {
			for(int j = 0; j < 10 ; j++) {
				seats[i][j] = "__";
			}
		}
	}
	public void searchSeat() { // 좌석 출력

		System.out.println("============screen=============");
		for (int i = 0; i < 11; i++) {
			System.out.print("\n" + list[i]  + "석 ");
			for (int j = 0; j < 10; j++) {
				
				System.out.print(" "+ seats[i][j]);
			}
		}
	}
	public void bookSeat(MvMember mem) { // 좌석예약
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------좌석 예약--------------");
		System.out.println();
		
		String cusName = mem.getName();
		boolean confirm = true;
		while(confirm) {
			// 자리선택
			System.out.println("원하시는 좌석등급을 선택하세요. A석 = 1/B석 = 2/C석 =3/.... (숫자로 입력해주세요)");
			System.out.print("좌석등급 :");
			int stGubun = sc.nextInt() - 1;
			System.out.println("원하시는 좌석번호을 선택하세요. 1~10번");
			System.out.print("좌석번호 :");
			int stNum = sc.nextInt() - 1 ;
			// 자리 중복을 막는다.
			if(seats[stGubun][stNum].equals("__")) {
				seats[stGubun][stNum] = (cusName);
				confirm = false;
			}else{
			System.out.println("이미 예약된 자리입니다.");
			}
			
			if(stNum>10){
     			System.out.println("잘못된 좌석번호 입니다. 다시 입력해주세요.");
     			System.out.print(">>>>> ");
     			stNum = sc.nextInt()-1;
     			
     		}
			
         	
         	break;
		}
		System.out.println();
	}
	
	
	
	
	
	public void canSeat(MvMember mem) { // 좌석취소
	
	
	
			String cusName = mem.getName();
			for (int i = 0; i < 11; i++) {
				for (int j = 0; j < 10; j++) {
					if(cusName.equals(seats[i][j])) {
						seats[i][j] = "__";
		
					
						break;
				}
			}
		}
	}

	

	
	
}
