package kimdaeil.kimdaeil0410;

import java.util.ArrayList;
import java.util.Scanner;

import ch09_class.homepage.Board;

public class BookMain {

	public static void main(String[] args) {
		
		
		Libary libary = Libary.getInstance();
		

	///
		
		
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			
		
			System.out.println();
			System.out.println("행동을 선택해주세요!");
			System.out.println("1. 책입고 | 2. 책대여 |3.책목록 |4. 책검색 | 5.종료");
			System.out.print(">>>> ");
			int command = Integer.parseInt(scan.nextLine());
			
			if(command == 1) {
				// 책입고
				System.out.println("책 제목을 입력해주세요");
				System.out.print(">>>>  ");
				String bookname = scan.nextLine();
				
				
				
			}else if(command == 2) {
				// 책대여
				System.out.println("책 번호을 입력해주세요");
				System.out.print(">>>>  ");
				String name = scan.nextLine();
				
				ArrayList<Book> searchList = libary.searchBookList(name);
				
				int bookno = Integer.parseInt(scan.nextLine());
				
				libary.borrowBook(bookno);
				
				if(searchList.size() == 0) {
					System.out.println("해당책 존재 없음");
				}else if(searchList.size() == 1) {
					
					libary.borrowBook(searchList.get(0).getBookno());
					
					System.out.println(searchList);
				}
				
			
				
				
			}else if(command == 3) {
				// 책목록
				libary.showBookList();
			}else if(command == 4) {
				
				// 책검색
				System.out.println("책이름을  입력해주세요");
				System.out.println(">>>  ");
				
				String name = scan.nextLine();
				
				libary.searchBook(name);
				
				
				
			
				
				
			}else {
				//로그아웃
				System.out.println("종료합니다.");
				break;
			}
			
			
			
		}
		
		
	}

}
