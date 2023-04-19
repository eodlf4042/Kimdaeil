package kimdaeil.kimdaeil0410;

import ch09_class.homepage.MemberDB;

public class Book {
	private int bookno;    /*책 번호*/
	private String bookname;/*책 제목*/
	private boolean isBorrow; /*책 대여여부*/
	
	
	public Book() {}
	
	public Book(int bookno, String bookname, boolean isBorrow) {
		super();
		this.bookno = bookno;
		this.bookname = bookname;
		this.isBorrow = isBorrow;
	}
	
	
	@Override
	public String toString() {
		if(isBorrow) {
		return "책번호 =" + bookno + ", 책이름=" + bookname + ", 대여상태=" + isBorrow + "대여상태 : 대여중";
	}else {
		return "책번호 =" + bookno + ", 책이름=" + bookname + ", 대여상태=" + isBorrow + "대여상태 : 입고중";
	}
}

	public int getBookno() {
		return bookno;
	}



	public void setBookno(int bookno) {
		this.bookno = bookno;
	}



	public String getBookname() {
		return bookname;
	}



	public void setBookname(String bookname) {
		this.bookname = bookname;
	}



	public boolean isBorrow() {
		return isBorrow;
	}



	public void setBorrow(boolean isBorrow) {
		this.isBorrow = isBorrow;
	}




	


	

	


	
	
}
