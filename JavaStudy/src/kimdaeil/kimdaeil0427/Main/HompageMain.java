package kimdaeil.kimdaeil0427.Main;

import java.util.ArrayList;
import java.util.Scanner;

import kimdaeil.kimdaeil0427.dao.MemberDao;
import kimdaeil.kimdaeil0427.service.BoardService;
import kimdaeil.kimdaeil0427.service.MemberSevice;
import kimdaeil.kimdaeil0427.vo.BoardVo;
import kimdaeil.kimdaeil0427.vo.MemberVo;

public class HompageMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		MemberSevice memSevice = MemberSevice.getInstance();
		BoardService boardService = BoardService.getInstance();
		while(true) {
			System.out.println("행동을 선택해주세요!");
			System.out.println("1.로그인 | 2.회원가입 | 3.회원목록 | 4.종료");
			System.out.print(">>>>>");
			int command = 0;
			try {
				command = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요!!");
				continue;
			}
			if(command == 1) {
				// 로그인
				System.out.print("아이디 : ");
				String id = scan.nextLine();
				System.out.print("비밀번호 : ");
				String pw = scan.nextLine();
				
				MemberVo member = new MemberVo();
				member.setMemId(id);
				member.setMemPassword(pw);
				
				MemberVo login = memSevice.login(member);
				
	            if(login.getMemId() != null) {
	                // 로그인성공
	                System.out.println(login.getMemId() + "님 확영합니다.");
	                while(true) {
	                    System.out.println("행동을 선택해주세요!");
	                    System.out.println("1.글쓰기 | 2.글조회 |3 .로그아웃");
	                    System.out.print(">>>>>");
	                    command = Integer.parseInt(scan.nextLine());
	                    switch(command) {
	                        case 1:
	                            // 글쓰기
	                            System.out.println("글 제목을 입력해주세요");
	                            System.out.print(">>> ");
	                            String title = scan.nextLine();

	                            System.out.println("글 내용을 입력해주세요");
	                            System.out.print(">>> ");
	                            String content = scan.nextLine();

	                            BoardVo board = new BoardVo();
	                            board.setBoardTitle(title);
	                            board.setBoardContent(content);
	                            boardService.getBoardsList(board);
	                            break;
	                        case 2:
	                            // 글조회
	                            System.out.println("글 번호를 입력해주세요");
	                            System.out.print(">>> ");
	                          
	                            int boardNo = Integer.parseInt(scan.nextLine());
	                            
	                            BoardVo board1 = boardService.getBoard(boardNo);
	                            if (board1 == null) {
	                                System.out.println("입력하신 번호에 해당하는 게시글이 없습니다.");
	                            } else {
	                            System.out.println("글 제목: " + board1.getBoardTitle());
	                            System.out.println("작성자: " + board1.getBoardAuthor());
	                            System.out.println("내용: " + board1.getBoardContent());
	                            System.out.println("등록일: " + board1.getBoardDate());
	                            break;
	                            }
	                        case 3:
	                            // 로그아웃
	                            break;
	                        default:
	                            System.out.println("다시 입력해주세요!");
	                            break;
	                    }

					}
					
					
				}else {
					// 로그인실패
					System.out.println("아이디 혹은 비밀번호가 틀립니다.");
				}
				
			}else if (command == 2) {
				//회원가입
				System.out.print("아이디 : ");
				String id = scan.nextLine();
						
				
				System.out.print("비밀번호 : ");
				String pw = scan.nextLine();
				
				MemberVo mem = new MemberVo(id,pw);
				memSevice.regisMember(mem);
				
			}else if (command == 3) {
				// 회원목록
				ArrayList<MemberVo> memList = memSevice.getMemList();
				for(int i = 0; i<memList.size(); i++) {
					System.out.println(memList.get(i));
				}
			}else if (command == 4) {
				//종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("다시 입력해주세요!");
			}
		}
		
	}

	private static void showBoardList() {
	}

}