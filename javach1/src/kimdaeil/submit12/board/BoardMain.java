package chanung.submit12.board;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		CartoonBoard cb 
			= new CartoonBoard(1, "일빠", "내용", "2023.04.21", "이미지");
		
		System.out.println(cb);	
		
		BoardDB boardDB = BoardDB.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 글 목록 | 2. 글 쓰기 | 3. 종료");
			System.out.print(">>> ");
			
			int command = Integer.parseInt(scan.nextLine());
			
			if(command == 1) {
				boardDB.showBoardList();
			}else if(command == 2) {
				System.out.println("글 제목 입력");
				System.out.print(">>> ");
				String title = scan.nextLine();
				
				System.out.println("글 내용 입력");
				System.out.print(">>> ");
				String content = scan.nextLine();
				
				boardDB.addBoard(new Board(title, content));
				
//				Date currentTime = new Date();
//				SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
//				boardDB.addBoard(new Board(title, content, sdf.format(currentTime)));
				
			}else {
				break;
			}
			
			
			
		}
		
		
		
		
		
		
		
	}
}
