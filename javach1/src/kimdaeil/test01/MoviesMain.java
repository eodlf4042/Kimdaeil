package kimdaeil.test01;

import java.util.Scanner;

import kimdaeil.kimdaeil00414.MvMember;
import kimdaeil.kimdaeil00414.MvMemberDB;

public class MoviesMain {

	public static void main(String[] args) {
		boolean flag = true;
		String cusName = null; // 예약자 성명
		int stGubun = 0; // 좌석타입
		int stNum = 0; //
		

		MvMemberDB memDB =MvMemberDB.getInstance();
		memDB.showMvMemList();
	
		
		
		
		Scanner scan = new Scanner(System.in);
		
		
				
				MvMemberDB memberDB = MvMemberDB.getInstance();
				
				
				Scanner scan1 = new Scanner(System.in);
				
				while(true) {
					System.out.println("행동을 선택해주세요.");
					System.out.println("1. 회원가입 | 2. 로그인 | 3. 회원목록 | 4. 종료");
					System.out.print(">>> ");
					
					int command = Integer.parseInt(scan1.nextLine());
					
					if(command == 1) {
						// 회원가입
						System.out.println("아이디를 입력해주세요");
						System.out.print(">>> ");
						String id = scan1.nextLine();
						
						System.out.println("비밀번호를 입력해주세요");
						System.out.print(">>> ");
						String pw = scan1.nextLine();
						
						System.out.println("이름을 입력해주세요");
						System.out.print(">>> ");
						String name = scan1.nextLine();
						
						MvMember mem = new MvMember(id, pw, name);
						memDB.registMvMember(mem);
						
					}else if(command == 2) {
						// 로그인
						System.out.println("아이디를 입력해주세요");
						System.out.print(">>> ");
						String id = scan1.nextLine();
						
						System.out.println("비밀번호를 입력해주세요");
						System.out.print(">>> ");
						String pw = scan1.nextLine();
						
						
						MvMember login = memDB.login(id, pw);
						
						if(login != null) {
							// 로그인 성공
							System.out.println("로그인 성공!!");
							System.out.println(login.getName() + "님 환영합니다.");
						// 영화 예매
							
							while(flag) {
								
								Movie Mv = new Movie (cusName, stGubun, stNum);
								System.out.println();
								System.out.println("          대일영화관 예약시스템입니다.");
								Mv.searchSeat();
								System.out.println();
								System.out.println();
								System.out.println("원하는 서비스의 번호를 입력하세요.| 1.예약 | 2.취소 | 3.끝내기 |"); 
								System.out.print(">>>>> ");
								int service_num = scan.nextInt();
								switch(service_num) {
								case 1: 
									
									Mv.bookSeat();
									System.out.println("예약을 했습니다.");
									break;
								case 2: 
									Mv.canSeat();
									break;
								case 3: 
									System.out.println("시스템이 종료됩니다.");
									flag = false;
									break;
									
								}
							}
							
							
						 }else {
							// 로그인 실패
							System.out.println("아이디 혹은 비밀번호가 틀립니다.");
						}
						
					}else if(command == 3) {
						// 회원목록 조회
						memDB.showMvMemList();
					}else {
						// 종료
						System.out.println("종료");
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


