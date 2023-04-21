package kimdaeil.kimdaeil0419;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.SIPUSH;

import ch09_class.homepage.Board;
import ch09_class.homepage.BoardDB;

public class BoardMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		CartoonBoard cb = new CartoonBoard(1, "일빠", "내용", "2023.04.21", "이미지");
		System.out.println(cb);
		
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
			boardDB.showBoardList();
				
			}else if(select == 2) {
		
				// 글쓰기
				System.out.println("글 제목을 입력해주세요");
				System.out.print(">>> ");
				String name = scan.nextLine();
				
				System.out.println("글 내용을 입력해주세요");
				System.out.print(">>> ");
				String content = scan.nextLine();
				
//				boardDB.addBoard(new Board(title, content));
//				SimpleDateFormat new SimpleDateFormat("yyyy.MM.dd. HH:mm:ss초");
//				boardDB.addBoard(new Board(title, content, sdf, ));
//				
				
			}else {
				// 종료
				break;
			}
			
		}
	}

}
