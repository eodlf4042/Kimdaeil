package kimdaeil.kimdaeil0419;

import java.util.Scanner;

import ch09_class.homepage.Board;
import ch09_class.homepage.BoardDB;

public class BoardMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		BoardDB boardDB = BoardDB.getInstance();
		
		while(true) {
			// 게시물 목록 출력
			boardDB.showBoardList();
			
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 글목록 | 2. 글쓰기 | 3. 종료");
			System.out.print(">>> ");
			
			int select = Integer.parseInt(scan.nextLine());
			
			if(select == 1) {
				// 글조회
				System.out.println("글 번호를 입력해주세요");
				System.out.print(">>> ");
				int no = Integer.parseInt(scan.nextLine());
				boardDB.selectBoard(no);
				
			}else if(select == 2) {
		
				// 글쓰기
				System.out.println("글 제목을 입력해주세요");
				System.out.print(">>> ");
				String name = scan.nextLine();
				
				System.out.println("글 내용을 입력해주세요");
				System.out.print(">>> ");
				String content = scan.nextLine();
				
			Board board = new Board(0, name, content, "");
			boardDB.addBoard(board);
				
			}else {
				// 종료
				break;
			}
			
		}
	}

}
