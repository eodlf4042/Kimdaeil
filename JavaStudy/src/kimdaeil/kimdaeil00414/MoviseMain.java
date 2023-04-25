package kimdaeil.kimdaeil00414;

import java.util.Scanner;




public class MoviseMain {



	
	public static void main(String[] args) {
		MvMemberDB memDB =MvMemberDB.getInstance();
		ComplaintsDB complaintsDB = ComplaintsDB.getInstance();
	
	
	
	
			Scanner scan = new Scanner(System.in);
			MvMemberDB memberDB = MvMemberDB.getInstance();
			Ticketing	ticketing = new Ticketing ();
		
			
			while(true) {
				System.out.println();
				System.out.println("☆★☆★☆★☆★☆★☆대일시네마 로그인시스템☆★☆★☆★☆★☆★");
				System.out.println();
			
				System.out.println("☆★☆★☆★☆★☆★☆★서비스를 선택해주세요☆★☆★☆★☆★☆★☆★");
				System.out.println("          [1.회원가입]  [2. 로그인]  [3. 회원목록]  [4. 종료]");
				System.out.print(">>> ");
				
				int command = Integer.parseInt(scan.nextLine());
				
				if(command == 1) {
					// 회원가입
					System.out.println("☆★☆★☆★☆★☆★아이디를 입력해주세요☆★☆★☆★☆★☆★☆★");
					System.out.print(">>> ");
					String id = scan.nextLine();
					
					System.out.println("☆★☆★☆★☆★☆★비밀번호를 입력해주세요☆★☆★☆★☆★☆★☆★");
					System.out.print(">>> ");
					String pw = scan.nextLine();
					
					System.out.println("☆★☆★☆★☆★☆★이름을  입력해주세요☆★☆★☆★☆★☆★☆★");
					System.out.print(">>> ");
					String name = scan.nextLine();
					
					MvMember mem = new MvMember(id, pw, name);
					memDB.registMvMember(mem);
					
				}else if(command == 2) {
					// 로그인
					System.out.println("☆★☆★☆★☆★☆★아이디를 입력해주세요☆★☆★☆★☆★☆★☆★");
					System.out.print(">>> ");
					String id = scan.nextLine();
					
					System.out.println("☆★☆★☆★☆★☆★비밀번호를 입력해주세요☆★☆★☆★☆★☆★☆★");
					System.out.print(">>> ");
					String pw = scan.nextLine();
					
					
					MvMember login = memDB.login(id, pw);
					
					if(login != null) {
						// 로그인 성공
						System.out.println("☆★☆★☆★☆★☆★ 로그인 성공☆★☆★☆★☆★☆★☆★");
						System.out.println("               ☆☆"+login.getName() + "님 환영합니다. ★★");
					
						// 영화 예매
						
						while(true) {
				
							System.out.println();
							System.out.println("☆★☆★☆★☆★☆★☆대일시네마 예약시스템☆★☆★☆★☆★☆★");
							//자리보이기
							ticketing.searchSeat();
							System.out.println();
							System.out.println();
							System.out.println("☆★☆★☆★☆★☆★☆★서비스를 선택해주세요☆★☆★☆★☆★☆★☆★");
							System.out.println("    [1.예약]  [2.예약 취소] [3.민원넣기]  [4.민원조회]  [5.로그아웃 ]"); 
							System.out.print(">>>>> ");
							int select = Integer.parseInt(scan.nextLine());
							if(select ==1) {
						
								//예약
								ticketing.searchSeat();
								System.out.println();
								System.out.println();
								ticketing.bookSeat(login);
								System.out.println("★☆★☆★☆★예약을 했습니다☆★☆★☆★☆★");
								ticketing.searchSeat();
								
							 } else if(select ==2) {
								//예약취소
								ticketing.canSeat(login);
								ticketing.searchSeat();
							 } else if(select ==3) {
									//민원 넣기
								 complaintsDB.showComplaintsList();
								   System.out.println("민원 제목을 입력해주세요");
									System.out.print(">>> ");
									String title = scan.nextLine();
									
									System.out.println("민원 내용을 입력해주세요");
									System.out.print(">>> ");
									String content = scan.nextLine();
									
									Complaints complaints = new Complaints(0, title, content, login.getId());
									complaintsDB.addComplaints(complaints);
									
							 } else if(select ==4) {
									//민원 조회
								
								 
								  complaintsDB.showComplaintsList();
								 System.out.println("민호 번호를 입력해주세요");
									System.out.print(">>> ");
									
									int no = Integer.parseInt(scan.nextLine());
									
								
									complaintsDB.selectComplaints(no);
								 
							 }else if(select ==5){ 
								//로그아웃
								System.out.println("로그아웃하였습니다.");
								break;
							}
						}
						
					 }else {
						// 로그인 실패
						System.out.println("아이디 혹은 비밀번호가 틀립니다.");
					}
					
				}else if(command == 3) {
					// 회원목록 조회
					System.out.println("★☆★☆★☆★★☆★회원 아이디 도용금지★☆★☆★☆★☆★☆★");
					memDB.showMvMemList();
					System.out.println("★☆★☆★☆★★☆★회원 아이디 도용금지★☆★☆★☆★☆★☆★");
				}else {
					// 종료
					System.out.println("종료");
					break;
				}
			}
			
			}

	}


