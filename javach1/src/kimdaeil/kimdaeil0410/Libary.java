
package kimdaeil.kimdaeil0410;

import java.util.ArrayList;



public class Libary {
	private  ArrayList<Book> bookList = new ArrayList<>();
	
	 
	
	private Libary() {
		String strBooks = "삼국지, 해리포터와 마법사의 돌, 해리포터와 비밀의 방 , 해리포터와 아즈카반의 죄수,해리포터와 불사조 기사단, 해리포터와 혼혈왕자, 해리포터와 죽음의 성물,어린왕자, 나의 라임 오렌지나무, 이것이 자바다, 좋은생각, 반지의 제왕: 반지 원정대, 반지의 제왕: 두 개의 탑, 반지의 제왕: 왕의 귀환, 토익보카, 개미";
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		String[] temp = strBooks.split(",");
		for(int i=0; i<temp.length; i++){
			temp[i] = temp[i].trim();
		}	
		for(int i = 0; i < temp.length; i++) {
			
			bookList.add(new Book(bookList.size()+1, temp[1], false));
		}
	}
	
	
	//싱글턴패턴
	private static Libary instance = new Libary();
	
	public static Libary getInstance() {
		return instance;
	}
	
	 
		
public void showBookList() {
	for(int i = 0; i<bookList.size(); i++) {
		System.out.println(bookList.get(i));
	}
		
}

public void borrowBook(int Bookno) {
	for(int i =0; i < bookList.size(); i++) {
		if(bookList.get(i).getBookno() == Bookno) {
			bookList.get(i).setBorrow(true);
			System.out.println(bookList.get(i).getBookname() + "을 대여하겠습니다.");
		}
	}
}


//책검색
 public void searchBook(String keyword) {
	 for(int i = 0; i < bookList.size(); i++) {
		 if(bookList.get(i).getBookname().contains(keyword)) {
			 System.out.println(bookList.get(i));
		 }
	 }
 }



//책검색  + 검색된 책목록 리턴
 public ArrayList<Book> searchBookList(String keyword) {
	 ArrayList<Book> result = new ArrayList<>();
	 for(int i = 0; i < bookList.size(); i++) {
		 if(bookList.get(i).getBookname().contains(keyword)) {
			 System.out.println(bookList.get(i));
			 result.add(bookList.get(i));
		 }
	 }
	 return result; 
 }
 












}
